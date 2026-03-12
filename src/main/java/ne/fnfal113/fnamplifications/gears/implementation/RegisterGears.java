package ne.fnfal113.fnamplifications.gears.implementation;

import static ne.fnfal113.fnamplifications.utils.SfCompat.item;

import io.github.thebusybiscuit.slimefun4.api.MinecraftVersion;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import ne.fnfal113.fnamplifications.gears.FnBoots;
import ne.fnfal113.fnamplifications.gears.FnChestPlate;
import ne.fnfal113.fnamplifications.gears.FnHelmet;
import ne.fnfal113.fnamplifications.gears.FnLeggings;
import ne.fnfal113.fnamplifications.items.FNAmpItems;
import ne.fnfal113.fnamplifications.multiblocks.FnAssemblyStation;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RegisterGears {

    private static final ItemStack INGOT = Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_16) ?
            new ItemStack(Material.NETHERITE_INGOT, 2) : new ItemStack(Material.DIAMOND, 2);

    public static void setup(SlimefunAddon instance){
        new FnBoots(FNAmpItems.FN_GEARS, FNAmpItems.FN_GEAR_BOOTS, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.REINFORCED_PLATE, 5), new ItemStack(Material.IRON_BOOTS), item(SlimefunItems.REINFORCED_PLATE, 5),
                item(SlimefunItems.ENCHANTMENT_RUNE), INGOT.clone(), item(SlimefunItems.ENCHANTMENT_RUNE),
                item(SlimefunItems.REINFORCED_ALLOY_INGOT, 6), new ItemStack(Material.DIAMOND_BOOTS), item(SlimefunItems.REINFORCED_ALLOY_INGOT, 6)})
                .register(instance);

        new FnChestPlate(FNAmpItems.FN_GEARS, FNAmpItems.FN_GEAR_CHESTPLATE, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.REINFORCED_PLATE, 2), new ItemStack(Material.IRON_CHESTPLATE), item(SlimefunItems.REINFORCED_PLATE, 2),
                item(SlimefunItems.ENCHANTMENT_RUNE), INGOT.clone(), item(SlimefunItems.ENCHANTMENT_RUNE),
                item(SlimefunItems.REINFORCED_ALLOY_INGOT, 4), new ItemStack(Material.DIAMOND_CHESTPLATE), item(SlimefunItems.REINFORCED_ALLOY_INGOT, 4)})
                .register(instance);

        new FnHelmet(FNAmpItems.FN_GEARS, FNAmpItems.FN_GEAR_HELMET, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.REINFORCED_PLATE, 4), new ItemStack(Material.IRON_HELMET), item(SlimefunItems.REINFORCED_PLATE, 4),
                item(SlimefunItems.ENCHANTMENT_RUNE), INGOT.clone(), item(SlimefunItems.ENCHANTMENT_RUNE),
                item(SlimefunItems.REINFORCED_ALLOY_INGOT, 6), new ItemStack(Material.DIAMOND_HELMET), item(SlimefunItems.REINFORCED_ALLOY_INGOT, 6)})
                .register(instance);

        new FnLeggings(FNAmpItems.FN_GEARS, FNAmpItems.FN_GEAR_LEGGINGS, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.REINFORCED_PLATE, 2), new ItemStack(Material.IRON_LEGGINGS), item(SlimefunItems.REINFORCED_PLATE, 2),
                item(SlimefunItems.ENCHANTMENT_RUNE), INGOT.clone(), item(SlimefunItems.ENCHANTMENT_RUNE),
                item(SlimefunItems.REINFORCED_ALLOY_INGOT, 3), new ItemStack(Material.DIAMOND_LEGGINGS), item(SlimefunItems.REINFORCED_ALLOY_INGOT, 3)})
                .register(instance);
    }
}
