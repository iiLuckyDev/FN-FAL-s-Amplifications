package ne.fnfal113.fnamplifications.materialgenerators.implementations;

import io.github.thebusybiscuit.slimefun4.api.MinecraftVersion;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import ne.fnfal113.fnamplifications.multiblocks.FnAssemblyStation;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import ne.fnfal113.fnamplifications.items.FNAmpItems;
import org.bukkit.inventory.meta.ItemMeta;

public class RegisterMaterialGenerators {

    private static final ItemStack SHOVEL = Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_16) ?
            new ItemStack(Material.NETHERITE_SHOVEL) : new ItemStack(Material.DIAMOND_SHOVEL);
    private static final ItemStack PICKAXE = Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_16) ?
            new ItemStack(Material.NETHERITE_PICKAXE) : new ItemStack(Material.DIAMOND_PICKAXE);

    public static void setup(SlimefunAddon instance) {
        new CustomGeneratorMultiblock(FNAmpItems.MATERIAL_GENERATORS, FNAmpItems.FMG_GENERATOR_MULTIBLOCK)
                .register(instance);

        new CustomBrokenGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_CLAY_BROKEN,
                FnAssemblyStation.RECIPE_TYPE,
                new ItemStack[]{
                        SlimefunItems.CARBON.item(), new ItemStack(Material.DIAMOND_PICKAXE), SlimefunItems.CARBON.item(),
                        new ItemStack(Material.BOWL), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.BOWL),
                        SlimefunItems.CARBON.item(), SlimefunItems.GOLD_PAN.item(), SlimefunItems.CARBON.item()})
                .register(instance);

        new CustomMaterialGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_CLAY,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        SlimefunItems.GOLD_PAN.item(), new ItemStack(Material.CLAY), SlimefunItems.GOLD_PAN.item(),
                        new ItemStack(Material.DIAMOND_PICKAXE), FNAmpItems.FMG_GENERATOR_CLAY_BROKEN.item(), new ItemStack(Material.DIAMOND_PICKAXE),
                        new ItemStack(Material.DIAMOND_PICKAXE), new ItemStack(Material.FURNACE), new ItemStack(Material.DIAMOND_PICKAXE)}, 32)
                .setItem(Material.CLAY)
                .setMaterialName("&3&lClay")
                .register(instance);

        if(Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_16)) {
            new CustomBrokenGenerator(FNAmpItems.MATERIAL_GENERATORS,
                    FNAmpItems.FMG_GENERATOR_WARPED_BROKEN,
                    FnAssemblyStation.RECIPE_TYPE,
                    new ItemStack[]{
                            SlimefunItems.CARBONADO.item(), new ItemStack(Material.DIAMOND_SHOVEL), SlimefunItems.CARBONADO.item(),
                            PICKAXE.clone(), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.NETHERITE_PICKAXE),
                            SlimefunItems.CARBONADO.item(), SlimefunItems.NETHER_GOLD_PAN.item(), SlimefunItems.CARBONADO.item()})
                    .register(instance);

            new CustomMaterialGenerator(FNAmpItems.MATERIAL_GENERATORS,
                    FNAmpItems.FMG_GENERATOR_WARPED,
                    RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            SHOVEL.clone(), new ItemStack(Material.WARPED_NYLIUM), SHOVEL.clone(),
                            FNAmpItems.FMG_GENERATOR_WARPED_BROKEN.item(), FNAmpItems.FMG_GENERATOR_WARPED_BROKEN.item(), FNAmpItems.FMG_GENERATOR_WARPED_BROKEN.item(),
                            SHOVEL.clone(), new ItemStack(Material.BLAST_FURNACE), SHOVEL.clone()}, 48)
                    .setItem(Material.WARPED_NYLIUM)
                    .setMaterialName("&4&cWarped Nylium")
                    .register(instance);
        }

        new CustomBrokenGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_TERRACOTTA_BROKEN,
                FnAssemblyStation.RECIPE_TYPE,
                new ItemStack[]{
                        SlimefunItems.FERROSILICON.item(), new ItemStack(Material.DIAMOND_PICKAXE), SlimefunItems.FERROSILICON.item(),
                        new ItemStack(Material.DIAMOND_SHOVEL), new ItemStack(Material.BUCKET), new ItemStack(Material.DIAMOND_SHOVEL),
                        SlimefunItems.FERROSILICON.item(), new ItemStack(Material.COAL), SlimefunItems.FERROSILICON.item()})
                .register(instance);

        new CustomMaterialGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_TERRACOTTA,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        SlimefunItems.DAMASCUS_STEEL_INGOT.item(), new ItemStack(Material.DIAMOND_PICKAXE), SlimefunItems.DAMASCUS_STEEL_INGOT.item(),
                        FNAmpItems.FMG_GENERATOR_CLAY.item(), FNAmpItems.FMG_GENERATOR_TERRACOTTA_BROKEN.item(), FNAmpItems.FMG_GENERATOR_CLAY.item(),
                        SlimefunItems.DAMASCUS_STEEL_INGOT.item(), new ItemStack(Material.BLAST_FURNACE), SlimefunItems.DAMASCUS_STEEL_INGOT.item()}, 84)
                .setItem(Material.TERRACOTTA)
                .setMaterialName("&4&lTerracotta")
                .register(instance);

        new CustomBrokenGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_BONE_BROKEN,
                FnAssemblyStation.RECIPE_TYPE,
                new ItemStack[]{
                        new ItemStack(Material.BONE_MEAL), new ItemStack(Material.DIAMOND_SWORD), new ItemStack(Material.BONE_MEAL),
                        new ItemStack(Material.BONE_BLOCK), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.BONE_BLOCK),
                        SlimefunItems.BLISTERING_INGOT_2.item(), new ItemStack(Material.COAL), SlimefunItems.BLISTERING_INGOT_2.item()})
                .register(instance);

        new CustomMaterialGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_BONE,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        SlimefunItems.BLISTERING_INGOT_3.item(), FNAmpItems.FMG_GENERATOR_CLAY.item(), SlimefunItems.BLISTERING_INGOT_3.item(),
                        new ItemStack(Material.BONE), FNAmpItems.FMG_GENERATOR_BONE_BROKEN.item(), new ItemStack(Material.BONE),
                        SlimefunItems.PROGRAMMABLE_ANDROID.item(), new ItemStack(Material.BLAST_FURNACE), SlimefunItems.PROGRAMMABLE_ANDROID.item()}, 256)
                .setItem(Material.BONE)
                .setMaterialName("&f&lBone")
                .register(instance);

        new CustomBrokenGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_DIAMOND_BROKEN,
                FnAssemblyStation.RECIPE_TYPE,
                new ItemStack[]{
                        SlimefunItems.SYNTHETIC_DIAMOND.item(), PICKAXE.clone(), SlimefunItems.SYNTHETIC_DIAMOND.item(),
                        new ItemStack(Material.DIAMOND_BLOCK), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.DIAMOND_BLOCK),
                        SlimefunItems.SYNTHETIC_DIAMOND.item(), new ItemStack(Material.DIAMOND_PICKAXE), SlimefunItems.SYNTHETIC_DIAMOND.item()})
                .register(instance);

        new CustomMaterialGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_DIAMOND,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        SlimefunItems.PROGRAMMABLE_ANDROID_MINER.item(), new ItemStack(Material.DIAMOND), SlimefunItems.PROGRAMMABLE_ANDROID_MINER.item(),
                        new ItemStack(Material.DIAMOND), FNAmpItems.FMG_GENERATOR_DIAMOND_BROKEN.item(), new ItemStack(Material.DIAMOND),
                        SlimefunItems.PROGRAMMABLE_ANDROID.item(), new ItemStack(Material.BLAST_FURNACE), SlimefunItems.PROGRAMMABLE_ANDROID.item()}, 192)
                .setItem(Material.DIAMOND)
                .setMaterialName("&b&lDiamond")
                .register(instance);

        new CustomBrokenGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_EMERALD_BROKEN,
                FnAssemblyStation.RECIPE_TYPE,
                new ItemStack[]{
                        new ItemStack(Material.EMERALD), new ItemStack(Material.EMERALD_ORE), new ItemStack(Material.EMERALD),
                        new ItemStack(Material.EMERALD_BLOCK), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.EMERALD_BLOCK),
                        SlimefunItems.SYNTHETIC_EMERALD.item(), new ItemStack(Material.DIAMOND_PICKAXE), SlimefunItems.SYNTHETIC_EMERALD.item()})
                .register(instance);

        new CustomMaterialGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_EMERALD,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        SlimefunItems.PROGRAMMABLE_ANDROID_MINER.item(), new ItemStack(Material.EMERALD), SlimefunItems.PROGRAMMABLE_ANDROID_MINER.item(),
                        new ItemStack(Material.EMERALD), FNAmpItems.FMG_GENERATOR_EMERALD_BROKEN.item(), new ItemStack(Material.EMERALD),
                        SlimefunItems.PROGRAMMABLE_ANDROID.item(), new ItemStack(Material.BLAST_FURNACE), SlimefunItems.PROGRAMMABLE_ANDROID.item()}, 218)
                .setItem(Material.EMERALD)
                .setMaterialName("&a&lEmerald")
                .register(instance);

        new CustomBrokenGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_DIRT_BROKEN,
                FnAssemblyStation.RECIPE_TYPE,
                new ItemStack[]{
                        new ItemStack(Material.DIRT), new ItemStack(Material.DIAMOND_SHOVEL), new ItemStack(Material.DIRT),
                        new ItemStack(Material.DIAMOND_SHOVEL), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.IRON_SHOVEL),
                        SlimefunItems.SOLDER_INGOT.item(), new ItemStack(Material.DIAMOND_PICKAXE), SlimefunItems.SOLDER_INGOT.item()})
                .register(instance);

        new CustomMaterialGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_DIRT,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        new ItemStack(Material.GOLDEN_SHOVEL), new ItemStack(Material.DIRT), new ItemStack(Material.GOLDEN_SHOVEL),
                        new ItemStack(Material.DIRT), FNAmpItems.FMG_GENERATOR_DIRT_BROKEN.item(), new ItemStack(Material.DIRT),
                        SlimefunItems.MAGNESIUM_INGOT.item(), new ItemStack(Material.BLAST_FURNACE), SlimefunItems.MAGNESIUM_INGOT.item()}, 12)
                .setItem(Material.DIRT)
                .setMaterialName("&6&lDirt")
                .register(instance);

        new CustomBrokenGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_HONEYCOMB_BROKEN,
                FnAssemblyStation.RECIPE_TYPE,
                new ItemStack[]{
                        new ItemStack(Material.HONEYCOMB), new ItemStack(Material.HONEY_BOTTLE), new ItemStack(Material.HONEYCOMB),
                        new ItemStack(Material.DIAMOND_SHOVEL), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.IRON_SHOVEL),
                        SlimefunItems.REINFORCED_PLATE.item(), new ItemStack(Material.HONEY_BLOCK), SlimefunItems.REINFORCED_PLATE.item()})
                .register(instance);

        new CustomMaterialGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_HONEYCOMB,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        new ItemStack(Material.HONEYCOMB_BLOCK), FNAmpItems.FMG_GENERATOR_DIRT.item(), new ItemStack(Material.HONEYCOMB_BLOCK),
                        new ItemStack(Material.HONEYCOMB), FNAmpItems.FMG_GENERATOR_HONEYCOMB_BROKEN.item(), new ItemStack(Material.HONEYCOMB),
                        SlimefunItems.REINFORCED_ALLOY_INGOT.item(), new ItemStack(Material.BLAST_FURNACE), SlimefunItems.REINFORCED_ALLOY_INGOT.item()}, 48)
                .setItem(Material.HONEYCOMB)
                .setMaterialName("&6&lHoney Comb")
                .register(instance);

        new CustomBrokenGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_QUARTZ_BROKEN,
                FnAssemblyStation.RECIPE_TYPE,
                new ItemStack[]{
                        new ItemStack(Material.NETHERRACK), new ItemStack(Material.GOLDEN_SHOVEL), new ItemStack(Material.NETHERRACK),
                        new ItemStack(Material.IRON_SHOVEL), new ItemStack(Material.QUARTZ_BLOCK), new ItemStack(Material.IRON_SHOVEL),
                        SlimefunItems.STEEL_PLATE.item(), new ItemStack(Material.NETHERRACK), SlimefunItems.STEEL_PLATE.item()})
                .register(instance);

        new CustomMaterialGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_QUARTZ,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        new ItemStack(Material.IRON_PICKAXE), new ItemStack(Material.IRON_PICKAXE), new ItemStack(Material.IRON_PICKAXE),
                        new ItemStack(Material.QUARTZ), FNAmpItems.FMG_GENERATOR_QUARTZ_BROKEN.item(), new ItemStack(Material.QUARTZ),
                        SlimefunItems.DAMASCUS_STEEL_INGOT.item(), new ItemStack(Material.BLAST_FURNACE), SlimefunItems.DAMASCUS_STEEL_INGOT.item()}, 28)
                .setItem(Material.QUARTZ)
                .setMaterialName("&f&lQuartz")
                .register(instance);

        if(Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_17)){
            ItemStack silkTool = new ItemStack(Material.NETHERITE_PICKAXE);
            ItemMeta meta = silkTool.getItemMeta();
            meta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
            silkTool.setItemMeta(meta);

            new CustomBrokenGenerator(FNAmpItems.MATERIAL_GENERATORS,
                    FNAmpItems.FMG_GENERATOR_AMETHYST_BROKEN,
                    FnAssemblyStation.RECIPE_TYPE,
                    new ItemStack[]{
                            FNAmpItems.FMG_GENERATOR_QUARTZ.item(), silkTool.clone(), FNAmpItems.FMG_GENERATOR_QUARTZ.item(),
                            silkTool.clone(), new ItemStack(Material.AMETHYST_BLOCK), silkTool.clone(),
                            FNAmpItems.REINFORCED_CASING.item(), FNAmpItems.FMG_GENERATOR_WARPED_BROKEN.item(), FNAmpItems.REINFORCED_CASING.item()})
                    .register(instance);

            new CustomMaterialGenerator(FNAmpItems.MATERIAL_GENERATORS,
                    FNAmpItems.FMG_GENERATOR_AMETHYST,
                    RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.DIAMOND_PICKAXE), SlimefunItems.REINFORCED_ALLOY_INGOT.item(), new ItemStack(Material.DIAMOND_PICKAXE),
                            new ItemStack(Material.AMETHYST_CLUSTER), FNAmpItems.FMG_GENERATOR_AMETHYST_BROKEN.item(), new ItemStack(Material.AMETHYST_CLUSTER),
                            new ItemStack(Material.AMETHYST_BLOCK), new ItemStack(Material.BLAST_FURNACE), new ItemStack(Material.AMETHYST_BLOCK)}, 160)
                    .setItem(Material.AMETHYST_CLUSTER)
                    .setMaterialName("&d&lAmethyst Cluster")
                    .register(instance);
        }

    }
}
