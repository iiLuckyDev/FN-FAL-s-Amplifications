package ne.fnfal113.fnamplifications.items;

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
            VERSIONED_ITEMSTACK_COPPER = SlimefunItems.COPPER_INGOT.item();
            VERSIONED_ITEMSTACK_COPPER_BATTERY = SlimefunItems.BATTERY.item();
            VERSIONED_ITEMSTACK_COPPER_BLOCK_INGOT = SlimefunItems.COPPER_INGOT.item();
            VERSIONED_ITEMSTACK_AMETHYSTSHARD_IRON = new ItemStack(Material.IRON_NUGGET);
            VERSIONED_ITEMSTACK_CALCITE_IRONINGOT = new ItemStack(Material.IRON_INGOT);
            VERSIONED_ITEMSTACK_ROD_BATTERY = SlimefunItems.BATTERY.item();
            VERSIONED_ITEMSTACK_AMETHYSTCLUSTER_IRON = new ItemStack(Material.IRON_INGOT);
            VERSIONED_ITEMSTACK_AMETHYSTSHARD_IRONBLOCK = new ItemStack(Material.IRON_BLOCK);
        }
    }

    public static void setup(SlimefunAddon instance) {
        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.MACHINE_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.BRONZE_INGOT.item(), SlimefunItems.GOLD_4K.item(), SlimefunItems.BRONZE_INGOT.item(),
                SlimefunItems.ADVANCED_CIRCUIT_BOARD.item(), SlimefunItems.ELECTRO_MAGNET.item(), SlimefunItems.ADVANCED_CIRCUIT_BOARD.item(),
                SlimefunItems.COPPER_WIRE.item(), VERSIONED_ITEMSTACK_ROD_BATTERY, SlimefunItems.COPPER_WIRE.item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.COMPONENT_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                VERSIONED_ITEMSTACK_COPPER, new ItemStack(Material.GOLD_INGOT), VERSIONED_ITEMSTACK_COPPER,
                SlimefunItems.BASIC_CIRCUIT_BOARD.item(), SlimefunItems.MAGNET.item(), SlimefunItems.BASIC_CIRCUIT_BOARD.item(),
                SlimefunItems.COPPER_WIRE.item(), VERSIONED_ITEMSTACK_ROD_BATTERY, SlimefunItems.COPPER_WIRE.item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.MOTOR_SWITCH, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.COPPER_WIRE.item(), SlimefunItems.ALUMINUM_BRASS_INGOT.item(), SlimefunItems.COPPER_WIRE.item(),
                new ItemStack(Material.LEVER), new ItemStack(Material.REDSTONE), new ItemStack(Material.LEVER),
                SlimefunItems.COPPER_WIRE.item(), VERSIONED_ITEMSTACK_ROD_BATTERY, SlimefunItems.COPPER_WIRE.item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.GEAR_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.COPPER_WIRE.item(), SlimefunItems.CARGO_MOTOR.item(), SlimefunItems.COPPER_WIRE.item(),
                new ItemStack(Material.REDSTONE), SlimefunItems.CHAIN.item(), new ItemStack(Material.REDSTONE),
                SlimefunItems.COPPER_WIRE.item(), SlimefunItems.ELECTRIC_MOTOR.item(), SlimefunItems.COPPER_WIRE.item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.THREAD_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.STICK), new ItemStack(Material.OAK_PLANKS),
                SlimefunItems.COPPER_WIRE.item(), new ItemStack(Material.STICK), SlimefunItems.COPPER_WIRE.item(),
                SlimefunItems.COPPER_WIRE.item(), new ItemStack(Material.STICK), SlimefunItems.COPPER_WIRE.item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.COMPRESSOR_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.PISTON), new ItemStack(Material.NETHER_BRICKS), new ItemStack(Material.PISTON),
                FNAmpItems.THREAD_PART.item(), FNAmpItems.GEAR_PART.item(), FNAmpItems.THREAD_PART.item(),
                SlimefunItems.COPPER_WIRE.item(), new ItemStack(Material.NETHER_BRICKS), SlimefunItems.COPPER_WIRE.item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.CONDENSER_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.PISTON), FNAmpItems.COMPONENT_PART.item(), new ItemStack(Material.PISTON),
                FNAmpItems.COMPRESSOR_PART.item(), FNAmpItems.GEAR_PART.item(), FNAmpItems.COMPRESSOR_PART.item(),
                SlimefunItems.COPPER_WIRE.item(), FNAmpItems.COMPONENT_PART.item(), SlimefunItems.COPPER_WIRE.item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.RECYCLER_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.PISTON), FNAmpItems.COMPONENT_PART.item(), new ItemStack(Material.PISTON),
                null, FNAmpItems.GEAR_PART.item(), null,
                FNAmpItems.CONDENSER_PART.item(), FNAmpItems.COMPRESSOR_PART.item(), FNAmpItems.CONDENSER_PART.item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.DOWNGRADER_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.PISTON), FNAmpItems.THREAD_PART.item(), new ItemStack(Material.PISTON),
                FNAmpItems.RECYCLER_PART.item(), FNAmpItems.GEAR_PART.item(), FNAmpItems.RECYCLER_PART.item(),
                null, FNAmpItems.COMPRESSOR_PART.item(), null})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.FUNNEL_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.LEAD_INGOT.item(), VERSIONED_ITEMSTACK_CALCITE_IRONINGOT, SlimefunItems.LEAD_INGOT.item(),
                FNAmpItems.THREAD_PART.item(), new ItemStack(Material.BARREL), FNAmpItems.THREAD_PART.item(),
                SlimefunItems.COPPER_WIRE.item(), VERSIONED_ITEMSTACK_CALCITE_IRONINGOT, SlimefunItems.COPPER_WIRE.item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.POWER_COMPONENT, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.ELECTRIC_MOTOR.item(), VERSIONED_ITEMSTACK_COPPER_BATTERY, SlimefunItems.ELECTRIC_MOTOR.item(),
                VERSIONED_ITEMSTACK_COPPER, SlimefunItems.POWER_CRYSTAL.item(), VERSIONED_ITEMSTACK_COPPER,
                SlimefunItems.COPPER_WIRE.item(), VERSIONED_ITEMSTACK_ROD_BATTERY, SlimefunItems.COPPER_WIRE.item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.BRASS_PLATING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                VERSIONED_ITEMSTACK_COPPER, VERSIONED_ITEMSTACK_AMETHYSTSHARD_IRON, VERSIONED_ITEMSTACK_COPPER,
                SlimefunItems.BRASS_INGOT.item(), VERSIONED_ITEMSTACK_COPPER_BLOCK_INGOT, SlimefunItems.BRASS_INGOT.item(),
                SlimefunItems.BRONZE_INGOT.item(), VERSIONED_ITEMSTACK_AMETHYSTSHARD_IRON, SlimefunItems.BRONZE_INGOT.item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.REINFORCED_CASING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.REINFORCED_PLATE.item(), VERSIONED_ITEMSTACK_COPPER, SlimefunItems.REINFORCED_PLATE.item(),
                SlimefunItems.REINFORCED_ALLOY_INGOT.item(), new ItemStack(Material.IRON_BLOCK), SlimefunItems.BRASS_INGOT.item(),
                SlimefunItems.BRONZE_INGOT.item(), VERSIONED_ITEMSTACK_COPPER, SlimefunItems.BRONZE_INGOT.item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.DIAMOND_PLATING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.COBALT_INGOT.item(), VERSIONED_ITEMSTACK_AMETHYSTCLUSTER_IRON, SlimefunItems.COBALT_INGOT.item(),
                new ItemStack(Material.DIAMOND), new ItemStack(Material.DIAMOND_BLOCK), new ItemStack(Material.DIAMOND),
                SlimefunItems.BRONZE_INGOT.item(), VERSIONED_ITEMSTACK_AMETHYSTCLUSTER_IRON, SlimefunItems.BRONZE_INGOT.item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.ALUMINUM_PLATING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.DURALUMIN_INGOT.item(), VERSIONED_ITEMSTACK_AMETHYSTCLUSTER_IRON, SlimefunItems.DURALUMIN_INGOT.item(),
                SlimefunItems.ALUMINUM_INGOT.item(), VERSIONED_ITEMSTACK_AMETHYSTCLUSTER_IRON, SlimefunItems.ALUMINUM_INGOT.item(),
                SlimefunItems.BRONZE_INGOT.item(), VERSIONED_ITEMSTACK_AMETHYSTCLUSTER_IRON, SlimefunItems.BRONZE_INGOT.item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.GOLD_PLATING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.GOLD_8K.item(), new ItemStack(Material.GOLD_NUGGET), SlimefunItems.GOLD_8K.item(),
                SlimefunItems.ALUMINUM_INGOT.item(), new ItemStack(Material.GOLD_BLOCK), SlimefunItems.ALUMINUM_INGOT.item(),
                SlimefunItems.BRONZE_INGOT.item(), new ItemStack(Material.GOLD_NUGGET), SlimefunItems.BRONZE_INGOT.item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.BASIC_MACHINE_BLOCK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                FNAmpItems.GEAR_PART.item(), VERSIONED_ITEMSTACK_AMETHYSTSHARD_IRONBLOCK, FNAmpItems.GEAR_PART.item(),
                FNAmpItems.BRASS_PLATING.item(), FNAmpItems.MACHINE_PART.item(), FNAmpItems.BRASS_PLATING.item(),
                FNAmpItems.COMPONENT_PART.item(), VERSIONED_ITEMSTACK_AMETHYSTSHARD_IRONBLOCK, FNAmpItems.COMPONENT_PART.item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.HIGHTECH_MACHINE_BLOCK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                FNAmpItems.GEAR_PART.item(), FNAmpItems.BASIC_MACHINE_BLOCK.item(), FNAmpItems.GEAR_PART.item(),
                FNAmpItems.REINFORCED_CASING.item(), FNAmpItems.MACHINE_PART.item(), FNAmpItems.BRASS_PLATING.item(),
                FNAmpItems.COMPONENT_PART.item(), FNAmpItems.BASIC_MACHINE_BLOCK.item(), FNAmpItems.COMPONENT_PART.item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.ITEMS, FNAmpItems.FN_METAL_SCRAPS, ElectricMachineDowngrader.RECIPE_TYPE, new ItemStack[] {
                null, null, null,
                null, null, null,
                null, null, null})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.UNBIND_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT, 1).item(), new ItemStack(Material.BLAZE_POWDER, 1), new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT, 1).item(),
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 2).item(), null, new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 2).item(),
                new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).item(), new ItemStack(Material.ROTTEN_FLESH, 1), new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.SPIRAL_FIRE_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 2).item(), new ItemStack(Material.GUNPOWDER, 3), new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT, 1).item(),
                null, new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).item(), null,
                new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 2).item(), new ItemStack(Material.FLINT_AND_STEEL, 1), new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT, 1).item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.SPIRIT_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 2).item(), new ItemStack(Material.ROTTEN_FLESH, 2), new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 2).item(),
                new ItemStack(Material.BLAZE_POWDER, 1), new SlimefunItemStack(SlimefunItems.MAGIC_SUGAR, 1).item(), new ItemStack(Material.BLAZE_POWDER, 1),
                new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 2).item(), new ItemStack(Material.WITHER_SKELETON_SKULL, 3), new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 2).item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.PESTILENCE_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.URANIUM, 1).item(), new ItemStack(Material.NETHER_WART, 6), new SlimefunItemStack(SlimefunItems.URANIUM, 1).item(),
                new ItemStack(Material.ROTTEN_FLESH, 4), new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).item(), new ItemStack(Material.ROTTEN_FLESH, 4),
                new SlimefunItemStack(SlimefunItems.URANIUM, 1).item(), new ItemStack(Material.QUARTZ, 3), new SlimefunItemStack(SlimefunItems.URANIUM, 1).item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.SPARKLING_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.SILVER_INGOT, 2).item(), null, new SlimefunItemStack(SlimefunItems.SILVER_INGOT, 2).item(),
                new ItemStack(Material.BLAZE_ROD, 2), new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).item(), new ItemStack(Material.BLAZE_ROD, 2),
                new SlimefunItemStack(SlimefunItems.SILVER_INGOT, 2).item(), null, new SlimefunItemStack(SlimefunItems.SILVER_INGOT, 2).item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.CLOUD_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 2).item(), new ItemStack(Material.BLAZE_POWDER, 3), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 2).item(),
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 2).item(), new SlimefunItemStack(SlimefunItems.AIR_RUNE, 1).item(), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 2).item(),
                new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 4).item(), new SlimefunItemStack(SlimefunItems.MAGIC_SUGAR, 1).item(), new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 4).item()})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.ICE_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[] {
                new ItemStack(Material.ICE, 4), null, new ItemStack(Material.ICE, 4),
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 2).item(), new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).item(), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 2).item(),
                new ItemStack(Material.ICE, 4), null, new ItemStack(Material.ICE, 4)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.POWER_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[] {
                new ItemStack(Material.REDSTONE, 1), new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT, 1).item(), new ItemStack(Material.REDSTONE, 1),
                new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT, 1).item(), new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).item(), new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT, 1).item(),
                new ItemStack(Material.NETHER_STAR, 1), new ItemStack(Material.REDSTONE, 1), new ItemStack(Material.NETHER_STAR, 1)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.LINGER_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[] {
                new ItemStack(Material.NETHER_WART, 5), new SlimefunItemStack(SlimefunItems.TIN_DUST, 1).item(), new ItemStack(Material.NETHER_WART, 5),
                new ItemStack(Material.GLOWSTONE_DUST, 5), new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).item(), new ItemStack(Material.GLOWSTONE_DUST, 5),
                new ItemStack(Material.FERMENTED_SPIDER_EYE, 1), new SlimefunItemStack(SlimefunItems.ZINC_DUST, 1).item(), new ItemStack(Material.FERMENTED_SPIDER_EYE, 1)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.AGILITY_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[] {
                new ItemStack(Material.SUGAR, 2), new SlimefunItemStack(SlimefunItems.PORK_JERKY, 1).item(), new ItemStack(Material.SUGAR, 2),
                new ItemStack(Material.NETHER_WART, 4), new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).item(), new ItemStack(Material.NETHER_WART, 4),
                new ItemStack(Material.SUGAR, 2), new SlimefunItemStack(SlimefunItems.BEEF_JERKY, 1).item(), new ItemStack(Material.SUGAR, 2)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.INTELLECT_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[] {
                new ItemStack(Material.BLAZE_POWDER, 3), null, new ItemStack(Material.BLAZE_POWDER, 3),
                new SlimefunItemStack(SlimefunItems.MAGIC_SUGAR, 1).item(), new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).item(), new SlimefunItemStack(SlimefunItems.MAGIC_SUGAR, 1).item(),
                new ItemStack(Material.SUGAR, 3), null, new ItemStack(Material.SUGAR, 3)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.HEART_RUNE, FnMagicAltar.RECIPE_TYPE, new ItemStack[] {
                null, new ItemStack(Material.NETHER_WART, 2), null,
                new SlimefunItemStack(SlimefunItems.MAGIC_SUGAR, 1).item(), new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).item(), new SlimefunItemStack(SlimefunItems.MAGIC_SUGAR, 1).item(),
                new ItemStack(Material.GLISTERING_MELON_SLICE, 1), new ItemStack(Material.NETHER_WART, 2), new ItemStack(Material.GLISTERING_MELON_SLICE, 1)})
                .register(instance);

        new UnplaceableBlock(FNAmpItems.MAGICAL_ITEMS, FNAmpItems.FN_GEM_FINE_JASPER_CRAFTING, FnGemAltar.RECIPE_TYPE, new ItemStack[] {
                new ItemStack(Material.IRON_ORE, 2), new ItemStack(Material.DIAMOND_ORE, 2),  new ItemStack(Material.IRON_ORE),
                null, FNAmpItems.POWER_RUNE.item(), null,
                new ItemStack(Material.GOLD_ORE, 2), new ItemStack(Material.EMERALD_ORE, 2), new ItemStack(Material.GOLD_ORE, 2)})
                .register(instance);

    }
}
