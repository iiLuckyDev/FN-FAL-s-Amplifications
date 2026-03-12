package ne.fnfal113.fnamplifications.materialgenerators.implementations;

import static ne.fnfal113.fnamplifications.utils.SfCompat.item;

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
                        item(SlimefunItems.CARBON), new ItemStack(Material.DIAMOND_PICKAXE), item(SlimefunItems.CARBON),
                        new ItemStack(Material.BOWL), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.BOWL),
                        item(SlimefunItems.CARBON), item(SlimefunItems.GOLD_PAN), item(SlimefunItems.CARBON)})
                .register(instance);

        new CustomMaterialGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_CLAY,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        item(SlimefunItems.GOLD_PAN), new ItemStack(Material.CLAY), item(SlimefunItems.GOLD_PAN),
                        new ItemStack(Material.DIAMOND_PICKAXE), item(FNAmpItems.FMG_GENERATOR_CLAY_BROKEN), new ItemStack(Material.DIAMOND_PICKAXE),
                        new ItemStack(Material.DIAMOND_PICKAXE), new ItemStack(Material.FURNACE), new ItemStack(Material.DIAMOND_PICKAXE)}, 32)
                .setItem(Material.CLAY)
                .setMaterialName("&3&lClay")
                .register(instance);

        if(Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_16)) {
            new CustomBrokenGenerator(FNAmpItems.MATERIAL_GENERATORS,
                    FNAmpItems.FMG_GENERATOR_WARPED_BROKEN,
                    FnAssemblyStation.RECIPE_TYPE,
                    new ItemStack[]{
                            item(SlimefunItems.CARBONADO), new ItemStack(Material.DIAMOND_SHOVEL), item(SlimefunItems.CARBONADO),
                            PICKAXE.clone(), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.NETHERITE_PICKAXE),
                            item(SlimefunItems.CARBONADO), item(SlimefunItems.NETHER_GOLD_PAN), item(SlimefunItems.CARBONADO)})
                    .register(instance);

            new CustomMaterialGenerator(FNAmpItems.MATERIAL_GENERATORS,
                    FNAmpItems.FMG_GENERATOR_WARPED,
                    RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            SHOVEL.clone(), new ItemStack(Material.WARPED_NYLIUM), SHOVEL.clone(),
                            item(FNAmpItems.FMG_GENERATOR_WARPED_BROKEN), item(FNAmpItems.FMG_GENERATOR_WARPED_BROKEN), item(FNAmpItems.FMG_GENERATOR_WARPED_BROKEN),
                            SHOVEL.clone(), new ItemStack(Material.BLAST_FURNACE), SHOVEL.clone()}, 48)
                    .setItem(Material.WARPED_NYLIUM)
                    .setMaterialName("&4&cWarped Nylium")
                    .register(instance);
        }

        new CustomBrokenGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_TERRACOTTA_BROKEN,
                FnAssemblyStation.RECIPE_TYPE,
                new ItemStack[]{
                        item(SlimefunItems.FERROSILICON), new ItemStack(Material.DIAMOND_PICKAXE), item(SlimefunItems.FERROSILICON),
                        new ItemStack(Material.DIAMOND_SHOVEL), new ItemStack(Material.BUCKET), new ItemStack(Material.DIAMOND_SHOVEL),
                        item(SlimefunItems.FERROSILICON), new ItemStack(Material.COAL), item(SlimefunItems.FERROSILICON)})
                .register(instance);

        new CustomMaterialGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_TERRACOTTA,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        item(SlimefunItems.DAMASCUS_STEEL_INGOT), new ItemStack(Material.DIAMOND_PICKAXE), item(SlimefunItems.DAMASCUS_STEEL_INGOT),
                        item(FNAmpItems.FMG_GENERATOR_CLAY), item(FNAmpItems.FMG_GENERATOR_TERRACOTTA_BROKEN), item(FNAmpItems.FMG_GENERATOR_CLAY),
                        item(SlimefunItems.DAMASCUS_STEEL_INGOT), new ItemStack(Material.BLAST_FURNACE), item(SlimefunItems.DAMASCUS_STEEL_INGOT)}, 84)
                .setItem(Material.TERRACOTTA)
                .setMaterialName("&4&lTerracotta")
                .register(instance);

        new CustomBrokenGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_BONE_BROKEN,
                FnAssemblyStation.RECIPE_TYPE,
                new ItemStack[]{
                        new ItemStack(Material.BONE_MEAL), new ItemStack(Material.DIAMOND_SWORD), new ItemStack(Material.BONE_MEAL),
                        new ItemStack(Material.BONE_BLOCK), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.BONE_BLOCK),
                        item(SlimefunItems.BLISTERING_INGOT_2), new ItemStack(Material.COAL), item(SlimefunItems.BLISTERING_INGOT_2)})
                .register(instance);

        new CustomMaterialGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_BONE,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        item(SlimefunItems.BLISTERING_INGOT_3), item(FNAmpItems.FMG_GENERATOR_CLAY), item(SlimefunItems.BLISTERING_INGOT_3),
                        new ItemStack(Material.BONE), item(FNAmpItems.FMG_GENERATOR_BONE_BROKEN), new ItemStack(Material.BONE),
                        item(SlimefunItems.PROGRAMMABLE_ANDROID), new ItemStack(Material.BLAST_FURNACE), item(SlimefunItems.PROGRAMMABLE_ANDROID)}, 256)
                .setItem(Material.BONE)
                .setMaterialName("&f&lBone")
                .register(instance);

        new CustomBrokenGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_DIAMOND_BROKEN,
                FnAssemblyStation.RECIPE_TYPE,
                new ItemStack[]{
                        item(SlimefunItems.SYNTHETIC_DIAMOND), PICKAXE.clone(), item(SlimefunItems.SYNTHETIC_DIAMOND),
                        new ItemStack(Material.DIAMOND_BLOCK), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.DIAMOND_BLOCK),
                        item(SlimefunItems.SYNTHETIC_DIAMOND), new ItemStack(Material.DIAMOND_PICKAXE), item(SlimefunItems.SYNTHETIC_DIAMOND)})
                .register(instance);

        new CustomMaterialGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_DIAMOND,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        item(SlimefunItems.PROGRAMMABLE_ANDROID_MINER), new ItemStack(Material.DIAMOND), item(SlimefunItems.PROGRAMMABLE_ANDROID_MINER),
                        new ItemStack(Material.DIAMOND), item(FNAmpItems.FMG_GENERATOR_DIAMOND_BROKEN), new ItemStack(Material.DIAMOND),
                        item(SlimefunItems.PROGRAMMABLE_ANDROID), new ItemStack(Material.BLAST_FURNACE), item(SlimefunItems.PROGRAMMABLE_ANDROID)}, 192)
                .setItem(Material.DIAMOND)
                .setMaterialName("&b&lDiamond")
                .register(instance);

        new CustomBrokenGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_EMERALD_BROKEN,
                FnAssemblyStation.RECIPE_TYPE,
                new ItemStack[]{
                        new ItemStack(Material.EMERALD), new ItemStack(Material.EMERALD_ORE), new ItemStack(Material.EMERALD),
                        new ItemStack(Material.EMERALD_BLOCK), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.EMERALD_BLOCK),
                        item(SlimefunItems.SYNTHETIC_EMERALD), new ItemStack(Material.DIAMOND_PICKAXE), item(SlimefunItems.SYNTHETIC_EMERALD)})
                .register(instance);

        new CustomMaterialGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_EMERALD,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        item(SlimefunItems.PROGRAMMABLE_ANDROID_MINER), new ItemStack(Material.EMERALD), item(SlimefunItems.PROGRAMMABLE_ANDROID_MINER),
                        new ItemStack(Material.EMERALD), item(FNAmpItems.FMG_GENERATOR_EMERALD_BROKEN), new ItemStack(Material.EMERALD),
                        item(SlimefunItems.PROGRAMMABLE_ANDROID), new ItemStack(Material.BLAST_FURNACE), item(SlimefunItems.PROGRAMMABLE_ANDROID)}, 218)
                .setItem(Material.EMERALD)
                .setMaterialName("&a&lEmerald")
                .register(instance);

        new CustomBrokenGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_DIRT_BROKEN,
                FnAssemblyStation.RECIPE_TYPE,
                new ItemStack[]{
                        new ItemStack(Material.DIRT), new ItemStack(Material.DIAMOND_SHOVEL), new ItemStack(Material.DIRT),
                        new ItemStack(Material.DIAMOND_SHOVEL), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.IRON_SHOVEL),
                        item(SlimefunItems.SOLDER_INGOT), new ItemStack(Material.DIAMOND_PICKAXE), item(SlimefunItems.SOLDER_INGOT)})
                .register(instance);

        new CustomMaterialGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_DIRT,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        new ItemStack(Material.GOLDEN_SHOVEL), new ItemStack(Material.DIRT), new ItemStack(Material.GOLDEN_SHOVEL),
                        new ItemStack(Material.DIRT), item(FNAmpItems.FMG_GENERATOR_DIRT_BROKEN), new ItemStack(Material.DIRT),
                        item(SlimefunItems.MAGNESIUM_INGOT), new ItemStack(Material.BLAST_FURNACE), item(SlimefunItems.MAGNESIUM_INGOT)}, 12)
                .setItem(Material.DIRT)
                .setMaterialName("&6&lDirt")
                .register(instance);

        new CustomBrokenGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_HONEYCOMB_BROKEN,
                FnAssemblyStation.RECIPE_TYPE,
                new ItemStack[]{
                        new ItemStack(Material.HONEYCOMB), new ItemStack(Material.HONEY_BOTTLE), new ItemStack(Material.HONEYCOMB),
                        new ItemStack(Material.DIAMOND_SHOVEL), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.IRON_SHOVEL),
                        item(SlimefunItems.REINFORCED_PLATE), new ItemStack(Material.HONEY_BLOCK), item(SlimefunItems.REINFORCED_PLATE)})
                .register(instance);

        new CustomMaterialGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_HONEYCOMB,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        new ItemStack(Material.HONEYCOMB_BLOCK), item(FNAmpItems.FMG_GENERATOR_DIRT), new ItemStack(Material.HONEYCOMB_BLOCK),
                        new ItemStack(Material.HONEYCOMB), item(FNAmpItems.FMG_GENERATOR_HONEYCOMB_BROKEN), new ItemStack(Material.HONEYCOMB),
                        item(SlimefunItems.REINFORCED_ALLOY_INGOT), new ItemStack(Material.BLAST_FURNACE), item(SlimefunItems.REINFORCED_ALLOY_INGOT)}, 48)
                .setItem(Material.HONEYCOMB)
                .setMaterialName("&6&lHoney Comb")
                .register(instance);

        new CustomBrokenGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_QUARTZ_BROKEN,
                FnAssemblyStation.RECIPE_TYPE,
                new ItemStack[]{
                        new ItemStack(Material.NETHERRACK), new ItemStack(Material.GOLDEN_SHOVEL), new ItemStack(Material.NETHERRACK),
                        new ItemStack(Material.IRON_SHOVEL), new ItemStack(Material.QUARTZ_BLOCK), new ItemStack(Material.IRON_SHOVEL),
                        item(SlimefunItems.STEEL_PLATE), new ItemStack(Material.NETHERRACK), item(SlimefunItems.STEEL_PLATE)})
                .register(instance);

        new CustomMaterialGenerator(FNAmpItems.MATERIAL_GENERATORS,
                FNAmpItems.FMG_GENERATOR_QUARTZ,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        new ItemStack(Material.IRON_PICKAXE), new ItemStack(Material.IRON_PICKAXE), new ItemStack(Material.IRON_PICKAXE),
                        new ItemStack(Material.QUARTZ), item(FNAmpItems.FMG_GENERATOR_QUARTZ_BROKEN), new ItemStack(Material.QUARTZ),
                        item(SlimefunItems.DAMASCUS_STEEL_INGOT), new ItemStack(Material.BLAST_FURNACE), item(SlimefunItems.DAMASCUS_STEEL_INGOT)}, 28)
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
                            item(FNAmpItems.FMG_GENERATOR_QUARTZ), silkTool.clone(), item(FNAmpItems.FMG_GENERATOR_QUARTZ),
                            silkTool.clone(), new ItemStack(Material.AMETHYST_BLOCK), silkTool.clone(),
                            item(FNAmpItems.REINFORCED_CASING), item(FNAmpItems.FMG_GENERATOR_WARPED_BROKEN), item(FNAmpItems.REINFORCED_CASING)})
                    .register(instance);

            new CustomMaterialGenerator(FNAmpItems.MATERIAL_GENERATORS,
                    FNAmpItems.FMG_GENERATOR_AMETHYST,
                    RecipeType.ENHANCED_CRAFTING_TABLE,
                    new ItemStack[]{
                            new ItemStack(Material.DIAMOND_PICKAXE), item(SlimefunItems.REINFORCED_ALLOY_INGOT), new ItemStack(Material.DIAMOND_PICKAXE),
                            new ItemStack(Material.AMETHYST_CLUSTER), item(FNAmpItems.FMG_GENERATOR_AMETHYST_BROKEN), new ItemStack(Material.AMETHYST_CLUSTER),
                            new ItemStack(Material.AMETHYST_BLOCK), new ItemStack(Material.BLAST_FURNACE), new ItemStack(Material.AMETHYST_BLOCK)}, 160)
                    .setItem(Material.AMETHYST_CLUSTER)
                    .setMaterialName("&d&lAmethyst Cluster")
                    .register(instance);
        }

    }
}
