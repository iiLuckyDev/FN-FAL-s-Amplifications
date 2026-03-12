package ne.fnfal113.fnamplifications.items;

import static ne.fnfal113.fnamplifications.utils.SfCompat.custom;
import static ne.fnfal113.fnamplifications.utils.SfCompat.head;
import static ne.fnfal113.fnamplifications.utils.SfCompat.item;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import ne.fnfal113.fnamplifications.FNAmplifications;
import ne.fnfal113.fnamplifications.machines.ElectricMachineDowngrader;
import ne.fnfal113.fnamplifications.multiblocks.FnGemAltar;
import ne.fnfal113.fnamplifications.multiblocks.FnMagicAltar;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.MinecraftVersion;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;

public class FnItemRecipes {

    public static final ItemStack VERSIONED_ITEMSTACK_COPPER;
    public static final ItemStack VERSIONED_ITEMSTACK_COPPER_BATTERY;
    public static final ItemStack VERSIONED_ITEMSTACK_COPPER_BLOCK_INGOT;
    public static final ItemStack VERSIONED_ITEMSTACK_AMETHYSTSHARD_IRON;
    public static final ItemStack VERSIONED_ITEMSTACK_AMETHYSTSHARD_IRONBLOCK;
    public static final ItemStack VERSIONED_ITEMSTACK_CALCITE_IRONINGOT;
    public static final ItemStack VERSIONED_ITEMSTACK_ROD_BATTERY;
    public static final ItemStack VERSIONED_ITEMSTACK_AMETHYSTCLUSTER_IRON;

    static {
        if (Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_17) 
                && FNAmplifications.getInstance().getJavaPlugin().getConfig().getBoolean("New-Recipe-Integration")) {
            VERSIONED_ITEMSTACK_COPPER = new ItemStack(Material.COPPER_INGOT);
            VERSIONED_ITEMSTACK_COPPER_BATTERY = new ItemStack(Material.COPPER_INGOT);
            VERSIONED_ITEMSTACK_COPPER_BLOCK_INGOT = new ItemStack(Material.COPPER_BLOCK);
            VERSIONED_ITEMSTACK_AMETHYSTSHARD_IRON = new ItemStack(Material.AMETHYST_SHARD);
            VERSIONED_ITEMSTACK_CALCITE_IRONINGOT = new ItemStack(Material.CALCITE);
            VERSIONED_ITEMSTACK_ROD_BATTERY = new ItemStack(Material.LIGHTNING_ROD);
            VERSIONED_ITEMSTACK_AMETHYSTCLUSTER_IRON = new ItemStack(Material.AMETHYST_CLUSTER);
            VERSIONED_ITEMSTACK_AMETHYSTSHARD_IRONBLOCK = new ItemStack(Material.AMETHYST_SHARD);
        } else {
            VERSIONED_ITEMSTACK_COPPER = item(SlimefunItems.COPPER_INGOT);
            VERSIONED_ITEMSTACK_COPPER_BATTERY = item(SlimefunItems.BATTERY);
            VERSIONED_ITEMSTACK_COPPER_BLOCK_INGOT = item(SlimefunItems.COPPER_INGOT);
            VERSIONED_ITEMSTACK_AMETHYSTSHARD_IRON = new ItemStack(Material.IRON_NUGGET);
            VERSIONED_ITEMSTACK_CALCITE_IRONINGOT = new ItemStack(Material.IRON_INGOT);
            VERSIONED_ITEMSTACK_ROD_BATTERY = item(SlimefunItems.BATTERY);
            VERSIONED_ITEMSTACK_AMETHYSTCLUSTER_IRON = new ItemStack(Material.IRON_INGOT);
            VERSIONED_ITEMSTACK_AMETHYSTSHARD_IRONBLOCK = new ItemStack(Material.IRON_BLOCK);
        }
    }

    public static void setup(SlimefunAddon instance) {
        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.MACHINE_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                item(SlimefunItems.BRONZE_INGOT), item(SlimefunItems.GOLD_4K), item(SlimefunItems.BRONZE_INGOT),
                item(SlimefunItems.ADVANCED_CIRCUIT_BOARD), item(SlimefunItems.ELECTRO_MAGNET), item(SlimefunItems.ADVANCED_CIRCUIT_BOARD),
                item(SlimefunItems.COPPER_WIRE), VERSIONED_ITEMSTACK_ROD_BATTERY, item(SlimefunItems.COPPER_WIRE)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.COMPONENT_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                VERSIONED_ITEMSTACK_COPPER, new ItemStack(Material.GOLD_INGOT), VERSIONED_ITEMSTACK_COPPER,
                item(SlimefunItems.BASIC_CIRCUIT_BOARD), item(SlimefunItems.MAGNET), item(SlimefunItems.BASIC_CIRCUIT_BOARD),
                item(SlimefunItems.COPPER_WIRE), VERSIONED_ITEMSTACK_ROD_BATTERY, item(SlimefunItems.COPPER_WIRE)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.MOTOR_SWITCH, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                item(SlimefunItems.COPPER_WIRE), item(SlimefunItems.ALUMINUM_BRASS_INGOT), item(SlimefunItems.COPPER_WIRE),
                new ItemStack(Material.LEVER), new ItemStack(Material.REDSTONE), new ItemStack(Material.LEVER),
                item(SlimefunItems.COPPER_WIRE), VERSIONED_ITEMSTACK_ROD_BATTERY, item(SlimefunItems.COPPER_WIRE)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.GEAR_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                item(SlimefunItems.COPPER_WIRE), item(SlimefunItems.CARGO_MOTOR), item(SlimefunItems.COPPER_WIRE),
                new ItemStack(Material.REDSTONE), item(SlimefunItems.CHAIN), new ItemStack(Material.REDSTONE),
                item(SlimefunItems.COPPER_WIRE), item(SlimefunItems.ELECTRIC_MOTOR), item(SlimefunItems.COPPER_WIRE)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.THREAD_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.STICK), new ItemStack(Material.OAK_PLANKS),
                item(SlimefunItems.COPPER_WIRE), new ItemStack(Material.STICK), item(SlimefunItems.COPPER_WIRE),
                item(SlimefunItems.COPPER_WIRE), new ItemStack(Material.STICK), item(SlimefunItems.COPPER_WIRE)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.COMPRESSOR_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.PISTON), new ItemStack(Material.NETHER_BRICKS), new ItemStack(Material.PISTON),
                item(FNAmpItems.THREAD_PART), item(FNAmpItems.GEAR_PART), item(FNAmpItems.THREAD_PART),
                item(SlimefunItems.COPPER_WIRE), new ItemStack(Material.NETHER_BRICKS), item(SlimefunItems.COPPER_WIRE)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.CONDENSER_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.PISTON), item(FNAmpItems.COMPONENT_PART), new ItemStack(Material.PISTON),
                item(FNAmpItems.COMPRESSOR_PART), item(FNAmpItems.GEAR_PART), item(FNAmpItems.COMPRESSOR_PART),
                item(SlimefunItems.COPPER_WIRE), item(FNAmpItems.COMPONENT_PART), item(SlimefunItems.COPPER_WIRE)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.RECYCLER_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.PISTON), item(FNAmpItems.COMPONENT_PART), new ItemStack(Material.PISTON),
                null, item(FNAmpItems.GEAR_PART), null,
                item(FNAmpItems.CONDENSER_PART), item(FNAmpItems.COMPRESSOR_PART), item(FNAmpItems.CONDENSER_PART)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.DOWNGRADER_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.PISTON), item(FNAmpItems.THREAD_PART), new ItemStack(Material.PISTON),
                item(FNAmpItems.RECYCLER_PART), item(FNAmpItems.GEAR_PART), item(FNAmpItems.RECYCLER_PART),
                null, item(FNAmpItems.COMPRESSOR_PART), null})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.FUNNEL_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                item(SlimefunItems.LEAD_INGOT), VERSIONED_ITEMSTACK_CALCITE_IRONINGOT, item(SlimefunItems.LEAD_INGOT),
                item(FNAmpItems.THREAD_PART), new ItemStack(Material.BARREL), item(FNAmpItems.THREAD_PART),
                item(SlimefunItems.COPPER_WIRE), VERSIONED_ITEMSTACK_CALCITE_IRONINGOT, item(SlimefunItems.COPPER_WIRE)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.POWER_COMPONENT, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                item(SlimefunItems.ELECTRIC_MOTOR), VERSIONED_ITEMSTACK_COPPER_BATTERY, item(SlimefunItems.ELECTRIC_MOTOR),
                VERSIONED_ITEMSTACK_COPPER, item(SlimefunItems.POWER_CRYSTAL), VERSIONED_ITEMSTACK_COPPER,
                item(SlimefunItems.COPPER_WIRE), VERSIONED_ITEMSTACK_ROD_BATTERY, item(SlimefunItems.COPPER_WIRE)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.BRASS_PLATING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                VERSIONED_ITEMSTACK_COPPER, VERSIONED_ITEMSTACK_AMETHYSTSHARD_IRON, VERSIONED_ITEMSTACK_COPPER,
                item(SlimefunItems.BRASS_INGOT), VERSIONED_ITEMSTACK_COPPER_BLOCK_INGOT, item(SlimefunItems.BRASS_INGOT),
                item(SlimefunItems.BRONZE_INGOT), VERSIONED_ITEMSTACK_AMETHYSTSHARD_IRON, item(SlimefunItems.BRONZE_INGOT)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.REINFORCED_CASING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                item(SlimefunItems.REINFORCED_PLATE), VERSIONED_ITEMSTACK_COPPER, item(SlimefunItems.REINFORCED_PLATE),
                item(SlimefunItems.REINFORCED_ALLOY_INGOT), new ItemStack(Material.IRON_BLOCK), item(SlimefunItems.BRASS_INGOT),
                item(SlimefunItems.BRONZE_INGOT), VERSIONED_ITEMSTACK_COPPER, item(SlimefunItems.BRONZE_INGOT)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.DIAMOND_PLATING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                item(SlimefunItems.COBALT_INGOT), VERSIONED_ITEMSTACK_AMETHYSTCLUSTER_IRON, item(SlimefunItems.COBALT_INGOT),
                new ItemStack(Material.DIAMOND), new ItemStack(Material.DIAMOND_BLOCK), new ItemStack(Material.DIAMOND),
                item(SlimefunItems.BRONZE_INGOT), VERSIONED_ITEMSTACK_AMETHYSTCLUSTER_IRON, item(SlimefunItems.BRONZE_INGOT)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.ALUMINUM_PLATING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                item(SlimefunItems.DURALUMIN_INGOT), VERSIONED_ITEMSTACK_AMETHYSTCLUSTER_IRON, item(SlimefunItems.DURALUMIN_INGOT),
                item(SlimefunItems.ALUMINUM_INGOT), VERSIONED_ITEMSTACK_AMETHYSTCLUSTER_IRON, item(SlimefunItems.ALUMINUM_INGOT),
                item(SlimefunItems.BRONZE_INGOT), VERSIONED_ITEMSTACK_AMETHYSTCLUSTER_IRON, item(SlimefunItems.BRONZE_INGOT)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.GOLD_PLATING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                item(SlimefunItems.GOLD_8K), new ItemStack(Material.GOLD_NUGGET), item(SlimefunItems.GOLD_8K),
                item(SlimefunItems.ALUMINUM_INGOT), new ItemStack(Material.GOLD_BLOCK), item(SlimefunItems.ALUMINUM_INGOT),
                item(SlimefunItems.BRONZE_INGOT), new ItemStack(Material.GOLD_NUGGET), item(SlimefunItems.BRONZE_INGOT)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.BASIC_MACHINE_BLOCK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                item(FNAmpItems.GEAR_PART), VERSIONED_ITEMSTACK_AMETHYSTSHARD_IRONBLOCK, item(FNAmpItems.GEAR_PART),
                item(FNAmpItems.BRASS_PLATING), item(FNAmpItems.MACHINE_PART), item(FNAmpItems.BRASS_PLATING),
                item(FNAmpItems.COMPONENT_PART), VERSIONED_ITEMSTACK_AMETHYSTSHARD_IRONBLOCK, item(FNAmpItems.COMPONENT_PART)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.HIGHTECH_MACHINE_BLOCK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                item(FNAmpItems.GEAR_PART), item(FNAmpItems.BASIC_MACHINE_BLOCK), item(FNAmpItems.GEAR_PART),
                item(FNAmpItems.REINFORCED_CASING), item(FNAmpItems.MACHINE_PART), item(FNAmpItems.BRASS_PLATING),
                item(FNAmpItems.COMPONENT_PART), item(FNAmpItems.BASIC_MACHINE_BLOCK), item(FNAmpItems.COMPONENT_PART)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.FN_METAL_SCRAPS, ElectricMachineDowngrader.RECIPE_TYPE, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.UNBIND_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.BLISTERING_INGOT, 1), new ItemStack(Material.BLAZE_POWDER, 1), item(SlimefunItems.BLISTERING_INGOT, 1),
                item(SlimefunItems.MAGIC_LUMP_3, 2), null, item(SlimefunItems.MAGIC_LUMP_3, 2),
                item(SlimefunItems.BLANK_RUNE, 1), new ItemStack(Material.ROTTEN_FLESH, 1), item(SlimefunItems.BLANK_RUNE, 1)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.SPIRAL_FIRE_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.COPPER_INGOT, 2), new ItemStack(Material.GUNPOWDER, 3), item(SlimefunItems.BLISTERING_INGOT, 1),
                null, item(SlimefunItems.BLANK_RUNE, 1), null,
                item(SlimefunItems.COPPER_INGOT, 2), new ItemStack(Material.FLINT_AND_STEEL, 1), item(SlimefunItems.BLISTERING_INGOT, 1)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.SPIRIT_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.BLANK_RUNE, 2), new ItemStack(Material.ROTTEN_FLESH, 2), item(SlimefunItems.BLANK_RUNE, 2),
                new ItemStack(Material.BLAZE_POWDER, 1), item(SlimefunItems.MAGIC_SUGAR, 1), new ItemStack(Material.BLAZE_POWDER, 1),
                item(SlimefunItems.BLANK_RUNE, 2), new ItemStack(Material.WITHER_SKELETON_SKULL, 3), item(SlimefunItems.BLANK_RUNE, 2)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.PESTILENCE_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.URANIUM, 1), new ItemStack(Material.NETHER_WART, 6), item(SlimefunItems.URANIUM, 1),
                new ItemStack(Material.ROTTEN_FLESH, 4), item(SlimefunItems.BLANK_RUNE, 1), new ItemStack(Material.ROTTEN_FLESH, 4),
                item(SlimefunItems.URANIUM, 1), new ItemStack(Material.QUARTZ, 3), item(SlimefunItems.URANIUM, 1)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.SPARKLING_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.SILVER_INGOT, 2), null, item(SlimefunItems.SILVER_INGOT, 2),
                new ItemStack(Material.BLAZE_ROD, 2), item(SlimefunItems.BLANK_RUNE, 1), new ItemStack(Material.BLAZE_ROD, 2),
                item(SlimefunItems.SILVER_INGOT, 2), null, item(SlimefunItems.SILVER_INGOT, 2)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.CLOUD_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.MAGIC_LUMP_1, 2), new ItemStack(Material.BLAZE_POWDER, 3), item(SlimefunItems.MAGIC_LUMP_1, 2),
                item(SlimefunItems.MAGIC_LUMP_1, 2), item(SlimefunItems.AIR_RUNE, 1), item(SlimefunItems.MAGIC_LUMP_1, 2),
                item(SlimefunItems.MAGNESIUM_DUST, 4), item(SlimefunItems.MAGIC_SUGAR, 1), item(SlimefunItems.MAGNESIUM_DUST, 4)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.ICE_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[]{
                new ItemStack(Material.ICE, 4), null, new ItemStack(Material.ICE, 4),
                item(SlimefunItems.MAGIC_LUMP_3, 2), item(SlimefunItems.BLANK_RUNE, 1), item(SlimefunItems.MAGIC_LUMP_3, 2),
                new ItemStack(Material.ICE, 4), null, new ItemStack(Material.ICE, 4)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.POWER_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[]{
                new ItemStack(Material.REDSTONE, 1), item(SlimefunItems.BLISTERING_INGOT, 1), new ItemStack(Material.REDSTONE, 1),
                item(SlimefunItems.BLISTERING_INGOT, 1), item(SlimefunItems.BLANK_RUNE, 1), item(SlimefunItems.BLISTERING_INGOT, 1),
                new ItemStack(Material.NETHER_STAR, 1), new ItemStack(Material.REDSTONE, 1), new ItemStack(Material.NETHER_STAR, 1)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.LINGER_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[]{
                new ItemStack(Material.NETHER_WART, 5), item(SlimefunItems.TIN_DUST, 1), new ItemStack(Material.NETHER_WART, 5),
                new ItemStack(Material.GLOWSTONE_DUST, 5), item(SlimefunItems.BLANK_RUNE, 1), new ItemStack(Material.GLOWSTONE_DUST, 5),
                new ItemStack(Material.FERMENTED_SPIDER_EYE, 1), item(SlimefunItems.ZINC_DUST, 1), new ItemStack(Material.FERMENTED_SPIDER_EYE, 1)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.AGILITY_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[]{
                new ItemStack(Material.SUGAR, 2), item(SlimefunItems.PORK_JERKY, 1), new ItemStack(Material.SUGAR, 2),
                new ItemStack(Material.NETHER_WART, 4), item(SlimefunItems.BLANK_RUNE, 1), new ItemStack(Material.NETHER_WART, 4),
                new ItemStack(Material.SUGAR, 2), item(SlimefunItems.BEEF_JERKY, 1), new ItemStack(Material.SUGAR, 2)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.INTELLECT_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[]{
                new ItemStack(Material.BLAZE_POWDER, 3), null, new ItemStack(Material.BLAZE_POWDER, 3),
                item(SlimefunItems.MAGIC_SUGAR, 1), item(SlimefunItems.BLANK_RUNE, 1), item(SlimefunItems.MAGIC_SUGAR, 1),
                new ItemStack(Material.SUGAR, 3), null, new ItemStack(Material.SUGAR, 3)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.HEART_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[]{
                null, new ItemStack(Material.NETHER_WART, 2), null,
                item(SlimefunItems.MAGIC_SUGAR, 1), item(SlimefunItems.BLANK_RUNE, 1), item(SlimefunItems.MAGIC_SUGAR, 1),
                new ItemStack(Material.GLISTERING_MELON_SLICE, 1), new ItemStack(Material.NETHER_WART, 2), new ItemStack(Material.GLISTERING_MELON_SLICE, 1)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.FN_GEM_FINE_JASPER_CRAFTING, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                new ItemStack(Material.IRON_ORE, 2), new ItemStack(Material.DIAMOND_ORE, 2),  new ItemStack(Material.IRON_ORE),
                null, item(FNAmpItems.POWER_RUNE), null,
                new ItemStack(Material.GOLD_ORE, 2), new ItemStack(Material.EMERALD_ORE, 2), new ItemStack(Material.GOLD_ORE, 2)})
                .register(instance);

    }
}



