package ne.fnfal113.fnamplifications.gems.abstracts;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

import ne.fnfal113.fnamplifications.FNAmplifications;
import ne.fnfal113.fnamplifications.config.ConfigManager;
import ne.fnfal113.fnamplifications.utils.Utils;

import org.bukkit.inventory.ItemStack;

public abstract class AbstractGemUnbinder extends SlimefunItem {

    private final int chance;

    private final ConfigManager configManager = FNAmplifications.getConfigManager();
    
    public AbstractGemUnbinder(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, int chance) {
        super(itemGroup, item, recipeType, recipe);

        // initialize config values on object construct
        this.configManager.initializeConfig(this.getId(), "unbind-chance", chance, "unbind-gem-settings");
        
        Utils.setLoreByConfigValue(
            (ItemStack) Utils.getField(SlimefunItem.class, "itemStackTemplate", this),
            this.getId(), 
            "unbind-chance", 
            "%", 
            "&e", 
            "%", 
            "unbind-gem-settings"
        );
        
        this.chance = this.configManager.getCustomConfig("unbind-gem-settings").getInt(this.getId() + "." + "unbind-chance");
    }

    public int getChance() {
        return chance;
    }

}