
import static ne.fnfal113.fnamplifications.utils.SfCompat.custom;
import static ne.fnfal113.fnamplifications.utils.SfCompat.head;
import static ne.fnfal113.fnamplifications.utils.SfCompat.item;

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
                        item(SlimefunItems.BRONZE_INGOT), null, item(SlimefunItems.ALUMINUM_INGOT),
                        null, new ItemStack(Material.DIAMOND_PICKAXE), null,
                        item(SlimefunItems.STEEL_INGOT), null, item(SlimefunItems.BRASS_INGOT)}
        ).register(instance);

        new FastProduce(
                FNAmpItems.MATERIAL_GENERATORS_UPGRADES,
                FNAmpItems.FN_MAT_GEN_UPGRADES_FAST_PRODUCE,
                FnAssemblyStation.RECIPE_TYPE,
                new ItemStack[]{
                        new ItemStack(Material.DIAMOND_SHOVEL), item(SlimefunItems.DURALUMIN_INGOT), new ItemStack(Material.DIAMOND_SHOVEL),
                        item(SlimefunItems.HARDENED_METAL_INGOT), null, item(SlimefunItems.HARDENED_METAL_INGOT),
                        new ItemStack(Material.DIAMOND_PICKAXE), item(SlimefunItems.BILLON_INGOT), new ItemStack(Material.DIAMOND_PICKAXE)}
        ).register(instance);
    }
}

