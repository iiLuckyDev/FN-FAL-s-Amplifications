package ne.fnfal113.fnamplifications.powergenerators.implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.Vector;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetProvider;
import io.github.thebusybiscuit.slimefun4.core.attributes.HologramOwner;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockPlaceHandler;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockUseHandler;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;

import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.api.BlockStorage;

import ne.fnfal113.fnamplifications.FNAmplifications;
import ne.fnfal113.fnamplifications.config.ConfigManager;
import ne.fnfal113.fnamplifications.utils.Utils;

public class CustomPowerGen extends SlimefunItem implements HologramOwner, EnergyNetProvider {

    private final Map<Location, Boolean> HOLO_CACHE = new HashMap<>();

    private final ConfigManager configManager = FNAmplifications.getConfigManager();

    public CustomPowerGen(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, 
        int dayRate, int nightRate, int storage) 
    {
        super(itemGroup, item, recipeType, recipe);

        setConfigValues(dayRate, nightRate, storage);
        
        // Update SlimefunItem Itemstack through reflections since
        // #getItem or #item method returns a cloned delegate Itemstack
        setLore((ItemStack) Utils.getField(SlimefunItem.class, "itemStackTemplate", this));

        addItemHandler(
            toggleHologram(),
            new BlockBreakHandler(false, false) {
                @Override
                public void onPlayerBreak(@Nonnull BlockBreakEvent e, @Nonnull ItemStack item, @Nonnull List<ItemStack> drops) {
                    if (BlockStorage.getLocationInfo(e.getBlock().getLocation(), "holo_status").startsWith("true")) {
                        removeHologram(e.getBlock());
                    }
                }
            },
            new BlockPlaceHandler(false) {
                @Override
                public void onPlayerPlace(@Nonnull BlockPlaceEvent e) {
                    BlockStorage.addBlockInfo(e.getBlock(), "holo_status", "true");
                    
                    HOLO_CACHE.put(e.getBlock().getLocation(), true);
                }
            }
        );
    }

    public void setLore(ItemStack itemStack) {
        ItemMeta meta = itemStack.getItemMeta();
        
        List<String> lore = meta.getLore();
        
        lore.add(Utils.colorTranslator(LoreBuilder.powerBuffer(this.configManager.getCustomConfig("power-xpansion-settings").getInt(this.getId() + "." + "storage"))));
        
        lore.add(Utils.colorTranslator("&8\u21E8 &e\u26A1 &7" + 
            Utils.powerFormat.format(this.configManager.getCustomConfig("power-xpansion-settings").getInt(this.getId() + "." + "dayrate")) + " J/t" + " (Day Rate)"));
        
        lore.add(Utils.colorTranslator("&8\u21E8 &e\u26A1 &7" + 
            Utils.powerFormat.format(this.configManager.getCustomConfig("power-xpansion-settings").getInt(this.getId() + "." + "nightrate")) + " J/t" + " (Night Rate)"));
        
        meta.setLore(lore);
        
        itemStack.setItemMeta(meta);
    }

    public void setConfigValues(int dayRate, int nightRate, int storage) {
        try {
            this.configManager
                .initializeConfig(this.getId(), "dayrate", dayRate, "power-xpansion-settings");

            this.configManager
                .initializeConfig(this.getId(), "nightrate", nightRate, "power-xpansion-settings");

            this.configManager
                .initializeConfig(this.getId(), "storage", storage, "power-xpansion-settings");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Nonnull
    @Override
    public Vector getHologramOffset(@Nonnull Block b) {
        return new Vector(0.5, 0.7, 0.5);
    }

    public BlockUseHandler toggleHologram() {
        return e -> {
            if (! e.getClickedBlock().isPresent()) {
                return;
            }

            Block block = e.getClickedBlock().get();

            String holoStatus = BlockStorage.getLocationInfo(block.getLocation(), "holo_status");
            
            if (holoStatus == null) {
                BlockStorage.addBlockInfo(block.getLocation(), "holo_status", "true");
                
                HOLO_CACHE.put(block.getLocation(), true);

                return;
            } 

            if (HOLO_CACHE.get(block.getLocation())) {
                HOLO_CACHE.put(block.getLocation(), false);
                
                BlockStorage.addBlockInfo(block.getLocation(), "holo_status", "false");
                
                removeHologram(block);
            } else {
                HOLO_CACHE.put(block.getLocation(), true);
                
                BlockStorage.addBlockInfo(block.getLocation(), "holo_status", "true");
            }
        };
    }

    @Override
    public int getGeneratedOutput(@Nonnull Location location, @Nonnull Config data) {
        final int stored = getCharge(location);

        final int generatedOutput = stored < getCapacity() ? getGeneratingAmount(location.getBlock(), location.getWorld()) : 0;

        // for first server boot up, cache location and hologram status per generator
        if (! HOLO_CACHE.containsKey(location)) {
            if (BlockStorage.getLocationInfo(location, "holo_status") != null) {
                HOLO_CACHE.put(location, Boolean.parseBoolean(BlockStorage.getLocationInfo(location, "holo_status")));
            } else {
                BlockStorage.addBlockInfo(location, "holo_status", "true");
                
                HOLO_CACHE.put(location, true);
            }
        } else if (HOLO_CACHE.get(location)) {
            String charge = getCharge(location) <= 0 ? 
                Utils.colorTranslator("&8" + getCharge(location)) : Utils.colorTranslator("&a" + getCharge(location));
            
            updateHologram(location.getBlock(), Utils.colorTranslator("&eOutput: &a" + generatedOutput + " J/t &8| " + "&eCharge: &a" + charge));
        }

        return generatedOutput;
    }

    @Override
    public boolean willExplode(@Nonnull Location l, @Nonnull Config data) {
        return false;
    }

    private int getGeneratingAmount(@Nonnull Block location, @Nonnull World world) {
        if (world.getEnvironment() == World.Environment.THE_END || world.getEnvironment() == World.Environment.NETHER) {
            return this.getNightRate();
        }

        if (world.isThundering() || world.hasStorm() || world.getTime() >= 13000
            || location.getLocation().add(0, 1, 0).getBlock().getLightFromSky() != 15) {
            return this.getNightRate();
        } else {
            return this.getDayRate();
        }
    }

    @Nonnull
    @Override
    public EnergyNetComponentType getEnergyComponentType() {
        return EnergyNetComponentType.GENERATOR;
    }

    @Override
    public int getCapacity() {
        return this.configManager
            .getCustomConfig("power-xpansion-settings").getInt(this.getId() + "." + "storage");
    }

    public int getDayRate() {
        return this.configManager
            .getCustomConfig("power-xpansion-settings").getInt(this.getId() + "." + "dayrate");
    }

    public int getNightRate() {
        return this.configManager
            .getCustomConfig("power-xpansion-settings").getInt(this.getId() + "." + "nightrate");
    }

}