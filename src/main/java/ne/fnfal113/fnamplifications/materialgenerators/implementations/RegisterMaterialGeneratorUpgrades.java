package ne.fnfal113.fnamplifications.materialgenerators.implementations;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import ne.fnfal113.fnamplifications.items.FNAmpItems;
import ne.fnfal113.fnamplifications.materialgenerators.upgrades.FastProduce;
import ne.fnfal113.fnamplifications.materialgenerators.upgrades.RepairItem;
import ne.fnfal113.fnamplifications.multiblocks.FnAssemblyStation;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RegisterMaterialGeneratorUpgrades {

    public static void setup(SlimefunAddon instance) {
        new RepairItem(
                FNAmpItems.MATERIAL_GENERATORS_UPGRADES,
                FNAmpItems.FN_MAT_GEN_UPGRADES_REPAIR_ITEM,
                FnAssemblyStation.RECIPE_TYPE,
                new ItemStack[]{
                        SlimefunItems.BRONZE_INGOT.item(), null, SlimefunItems.ALUMINUM_INGOT.item(),
                        null, new ItemStack(Material.DIAMOND_PICKAXE), null,
                        SlimefunItems.STEEL_INGOT.item(), null, SlimefunItems.BRASS_INGOT.item()}
        ).register(instance);

        new FastProduce(
                FNAmpItems.MATERIAL_GENERATORS_UPGRADES,
                FNAmpItems.FN_MAT_GEN_UPGRADES_FAST_PRODUCE,
                FnAssemblyStation.RECIPE_TYPE,
                new ItemStack[]{
                        new ItemStack(Material.DIAMOND_SHOVEL), SlimefunItems.DURALUMIN_INGOT.item(), new ItemStack(Material.DIAMOND_SHOVEL),
                        SlimefunItems.HARDENED_METAL_INGOT.item(), null, SlimefunItems.HARDENED_METAL_INGOT.item(),
                        new ItemStack(Material.DIAMOND_PICKAXE), SlimefunItems.BILLON_INGOT.item(), new ItemStack(Material.DIAMOND_PICKAXE)}
        ).register(instance);
    }
}
