package ne.fnfal113.fnamplifications.tools.implementation;

import static ne.fnfal113.fnamplifications.utils.SfCompat.item;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import ne.fnfal113.fnamplifications.items.FNAmpItems;
import ne.fnfal113.fnamplifications.multiblocks.FnAssemblyStation;
import ne.fnfal113.fnamplifications.tools.AutoLadder;
import ne.fnfal113.fnamplifications.tools.FnHoe;
import ne.fnfal113.fnamplifications.tools.FnHoeAutoPlant;
import ne.fnfal113.fnamplifications.tools.BlockRotator;
import ne.fnfal113.fnamplifications.tools.OrientPearl;
import ne.fnfal113.fnamplifications.tools.ThrowableTorch;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RegisterTools {

    public static void setup(SlimefunAddon instance) {
        new FnHoe(FNAmpItems.FN_MISC, FNAmpItems.FN_HOE_5X5, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.COMMON_TALISMAN), item(SlimefunItems.CARBON, 3), item(SlimefunItems.COMMON_TALISMAN),
                item(SlimefunItems.EARTH_RUNE, 4), new ItemStack(Material.DIAMOND_HOE), item(SlimefunItems.EARTH_RUNE, 2),
                item(SlimefunItems.STEEL_INGOT, 6), item(SlimefunItems.CARBON, 4), item(SlimefunItems.STEEL_INGOT, 6)})
                .register(instance);

        new FnHoeAutoPlant(FNAmpItems.FN_MISC, FNAmpItems.FN_HOE_5X5_AUTO_PLANT, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.COMMON_TALISMAN), null, item(SlimefunItems.COMMON_TALISMAN),
                item(SlimefunItems.EARTH_RUNE, 4), item(FNAmpItems.FN_HOE_5X5), item(SlimefunItems.EARTH_RUNE, 4),
                item(SlimefunItems.REINFORCED_ALLOY_INGOT, 8), null, item(SlimefunItems.REINFORCED_ALLOY_INGOT, 8)})
                .register(instance);

        new BlockRotator(FNAmpItems.FN_MISC, FNAmpItems.FN_BLOCK_ROTATOR, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.CARBON), item(SlimefunItems.COPPER_INGOT, 3), item(SlimefunItems.CARBON),
                item(SlimefunItems.ELECTRO_MAGNET), new ItemStack(Material.COMPASS), item(SlimefunItems.ELECTRO_MAGNET),
                item(SlimefunItems.DURALUMIN_INGOT, 2), item(SlimefunItems.COPPER_INGOT, 3), item(SlimefunItems.DURALUMIN_INGOT, 2)})
                .register(instance);

        new AutoLadder(FNAmpItems.FN_MISC, FNAmpItems.FN_AUTO_LADDER, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                null, new ItemStack(Material.LEAD, 2), null,
                new ItemStack(Material.LEAD, 2), new ItemStack(Material.LADDER, 8), new ItemStack(Material.LEAD, 2),
                null, new ItemStack(Material.LEAD, 2), null})
                .register(instance);

        new OrientPearl(FNAmpItems.FN_MISC, FNAmpItems.FN_ORIENT_PEARL, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                null, new ItemStack(Material.BONE), null,
                new ItemStack(Material.BONE), new ItemStack(Material.ENDER_PEARL, 1), new ItemStack(Material.BONE),
                null, new ItemStack(Material.BONE), null})
                .register(instance);

        new ThrowableTorch(FNAmpItems.FN_MISC, FNAmpItems.FN_THROWABLE_TORCH, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                null, new ItemStack(Material.BLAZE_POWDER), null,
                new ItemStack(Material.BLAZE_POWDER), new ItemStack(Material.TORCH, 1), new ItemStack(Material.BLAZE_POWDER),
                null, new ItemStack(Material.BLAZE_POWDER), null})
                .register(instance);
    }

}
