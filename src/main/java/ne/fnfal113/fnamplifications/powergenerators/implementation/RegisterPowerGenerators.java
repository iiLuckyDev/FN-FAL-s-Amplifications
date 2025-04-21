package ne.fnfal113.fnamplifications.powergenerators.implementation;

import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import ne.fnfal113.fnamplifications.items.FNAmpItems;
import ne.fnfal113.fnamplifications.multiblocks.FnAssemblyStation;

public class RegisterPowerGenerators {

    public static void setupPowerX(SlimefunAddon instance) {
        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R1, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.POWER_COMPONENT.item(), CustomItemStack.create(SlimefunItems.TIN_INGOT.item(), 8), FNAmpItems.POWER_COMPONENT.item(),
                FNAmpItems.BASIC_MACHINE_BLOCK.item(), SlimefunItems.SOLAR_GENERATOR_4.item(), FNAmpItems.BASIC_MACHINE_BLOCK.item(),
                SlimefunItems.BASIC_CIRCUIT_BOARD.item(), FNAmpItems.ALUMINUM_PLATING.item(), SlimefunItems.BASIC_CIRCUIT_BOARD.item()
        }, 236, 138, 100000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R2, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.POWER_COMPONENT.item(), FNAmpItems.FN_XPANSION_POWER_R1.item(), FNAmpItems.POWER_COMPONENT.item(),
                FNAmpItems.BASIC_MACHINE_BLOCK.item(), CustomItemStack.create(SlimefunItems.SOLDER_INGOT.item(), 12), FNAmpItems.BASIC_MACHINE_BLOCK.item(),
                SlimefunItems.BASIC_CIRCUIT_BOARD.item(), FNAmpItems.ALUMINUM_PLATING.item(), SlimefunItems.BASIC_CIRCUIT_BOARD.item()
        }, 416, 276, 200000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R3, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.POWER_COMPONENT.item(), FNAmpItems.FN_XPANSION_POWER_R2.item(), FNAmpItems.POWER_COMPONENT.item(),
                FNAmpItems.BASIC_MACHINE_BLOCK.item(), CustomItemStack.create(SlimefunItems.BRONZE_INGOT.item(), 16), FNAmpItems.BASIC_MACHINE_BLOCK.item(),
                SlimefunItems.BASIC_CIRCUIT_BOARD.item(), FNAmpItems.ALUMINUM_PLATING.item(), SlimefunItems.BASIC_CIRCUIT_BOARD.item()
        }, 632, 552, 300000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R4, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.POWER_COMPONENT.item(), FNAmpItems.FN_XPANSION_POWER_R3.item(), FNAmpItems.POWER_COMPONENT.item(),
                FNAmpItems.BASIC_MACHINE_BLOCK.item(), CustomItemStack.create(SlimefunItems.DURALUMIN_INGOT.item(), 20), FNAmpItems.BASIC_MACHINE_BLOCK.item(),
                SlimefunItems.ADVANCED_CIRCUIT_BOARD.item(), FNAmpItems.GOLD_PLATING.item(), SlimefunItems.ADVANCED_CIRCUIT_BOARD.item()
        }, 1264, 1104, 400000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R5, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.POWER_COMPONENT.item(), FNAmpItems.FN_XPANSION_POWER_R4.item(), FNAmpItems.POWER_COMPONENT.item(),
                FNAmpItems.HIGHTECH_MACHINE_BLOCK.item(), CustomItemStack.create(SlimefunItems.ALUMINUM_BRASS_INGOT.item(), 24), FNAmpItems.HIGHTECH_MACHINE_BLOCK.item(),
                FNAmpItems.FN_FAL_GENERATOR_TIER1.item(), FNAmpItems.GOLD_PLATING.item(), SlimefunItems.ADVANCED_CIRCUIT_BOARD.item()
        }, 2420, 1784, 500000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R6, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.POWER_COMPONENT.item(), FNAmpItems.FN_XPANSION_POWER_R5.item(), FNAmpItems.GEAR_PART.item(),
                FNAmpItems.HIGHTECH_MACHINE_BLOCK.item(), CustomItemStack.create(SlimefunItems.CORINTHIAN_BRONZE_INGOT.item(), 28), FNAmpItems.HIGHTECH_MACHINE_BLOCK.item(),
                FNAmpItems.FN_FAL_GENERATOR_TIER2.item(), FNAmpItems.GOLD_PLATING.item(), SlimefunItems.REINFORCED_ALLOY_INGOT.item()
        }, 4342, 3128, 600000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R7, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.POWER_COMPONENT.item(), FNAmpItems.FN_XPANSION_POWER_R6.item(), FNAmpItems.GEAR_PART.item(),
                FNAmpItems.HIGHTECH_MACHINE_BLOCK.item(), CustomItemStack.create(SlimefunItems.STEEL_INGOT.item(), 32), FNAmpItems.HIGHTECH_MACHINE_BLOCK.item(),
                FNAmpItems.FN_FAL_GENERATOR_TIER3.item(), FNAmpItems.BRASS_PLATING.item(), SlimefunItems.BLISTERING_INGOT.item()
        }, 6302, 5142, 700000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R8, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.POWER_COMPONENT.item(), FNAmpItems.FN_XPANSION_POWER_R7.item(), FNAmpItems.GEAR_PART.item(),
                FNAmpItems.HIGHTECH_MACHINE_BLOCK.item(), CustomItemStack.create(SlimefunItems.DAMASCUS_STEEL_INGOT.item(), 36), FNAmpItems.HIGHTECH_MACHINE_BLOCK.item(),
                SlimefunItems.BLISTERING_INGOT_2.item(), FNAmpItems.FN_FAL_GENERATOR_TIER4.item(), SlimefunItems.BLISTERING_INGOT_2.item()
        }, 8524, 6752, 800000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R9, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.POWER_COMPONENT.item(), FNAmpItems.FN_XPANSION_POWER_R8.item(), FNAmpItems.GEAR_PART.item(),
                FNAmpItems.HIGHTECH_MACHINE_BLOCK.item(), CustomItemStack.create(SlimefunItems.HARDENED_METAL_INGOT.item(), 40), FNAmpItems.HIGHTECH_MACHINE_BLOCK.item(),
                SlimefunItems.REINFORCED_ALLOY_INGOT.item(), FNAmpItems.FN_FAL_GENERATOR_TIER5.item(), SlimefunItems.REINFORCED_ALLOY_INGOT.item()
        }, 10384, 7431, 900000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R10, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.POWER_COMPONENT.item(), FNAmpItems.FN_XPANSION_POWER_R9.item(), FNAmpItems.GEAR_PART.item(),
                SlimefunItems.ENERGIZED_CAPACITOR.item(), CustomItemStack.create(SlimefunItems.HARDENED_METAL_INGOT.item(), 44), SlimefunItems.ENERGIZED_CAPACITOR.item(),
                SlimefunItems.URANIUM.item(),  FNAmpItems.FN_FAL_GENERATOR_TIER6.item(), SlimefunItems.URANIUM.item()
        }, 12392, 8128, 1000000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R11, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.POWER_COMPONENT.item(), FNAmpItems.FN_XPANSION_POWER_R10.item(), FNAmpItems.GEAR_PART.item(),
                SlimefunItems.ENERGIZED_CAPACITOR.item(), CustomItemStack.create(SlimefunItems.REINFORCED_ALLOY_INGOT.item(), 40), SlimefunItems.ENERGIZED_CAPACITOR.item(),
                SlimefunItems.NEPTUNIUM.item(), FNAmpItems.FN_FAL_GENERATOR_TIER7.item(), SlimefunItems.NEPTUNIUM.item()
        }, 14584, 9462, 1500000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R12, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.POWER_COMPONENT.item(), FNAmpItems.FN_XPANSION_POWER_R11.item(), FNAmpItems.GEAR_PART.item(),
                SlimefunItems.ENERGIZED_CAPACITOR.item(), CustomItemStack.create(SlimefunItems.REINFORCED_ALLOY_INGOT.item(), 44), SlimefunItems.ENERGIZED_CAPACITOR.item(),
                FNAmpItems.REINFORCED_CASING.item(), FNAmpItems.FN_XPANSION_POWER_R5.item(), SlimefunItems.BOOSTED_URANIUM.item()
        }, 17768, 10128, 2000000).register(instance);

    }

    public static void setupSolarGen(SlimefunAddon instance) {
        new CustomSolarGen(FNAmpItems.SOLAR_GENERATORS, FNAmpItems.FN_FAL_GENERATOR_TIER1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.SOLAR_GENERATOR_2.item(), SlimefunItems.SOLAR_GENERATOR.item(), SlimefunItems.SOLAR_GENERATOR_2.item(),
                SlimefunItems.BIG_CAPACITOR.item(), SlimefunItems.POWER_CRYSTAL.item(), SlimefunItems.BIG_CAPACITOR.item(),
                SlimefunItems.SOLAR_GENERATOR_2.item(), SlimefunItems.SOLAR_GENERATOR_3.item(), SlimefunItems.SOLAR_GENERATOR_2.item()},
                256, 4096).register(instance);

        new CustomSolarGen(FNAmpItems.SOLAR_GENERATORS, FNAmpItems.FN_FAL_GENERATOR_TIER2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.MEDIUM_CAPACITOR.item(), FNAmpItems.FN_FAL_GENERATOR_TIER1.item(), SlimefunItems.MEDIUM_CAPACITOR.item(),
                SlimefunItems.BIG_CAPACITOR.item(), SlimefunItems.POWER_CRYSTAL.item(), SlimefunItems.BIG_CAPACITOR.item(),
                SlimefunItems.BIG_CAPACITOR.item(), FNAmpItems.FN_FAL_GENERATOR_TIER1.item(), SlimefunItems.BIG_CAPACITOR.item()},
                512, 6144).register(instance);

        new CustomSolarGen(FNAmpItems.SOLAR_GENERATORS, FNAmpItems.FN_FAL_GENERATOR_TIER3, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.BIG_CAPACITOR.item(), FNAmpItems.FN_FAL_GENERATOR_TIER1.item(), SlimefunItems.BIG_CAPACITOR.item(),
                FNAmpItems.FN_FAL_GENERATOR_TIER1.item(), SlimefunItems.POWER_CRYSTAL.item(), FNAmpItems.FN_FAL_GENERATOR_TIER1.item(),
                SlimefunItems.BIG_CAPACITOR.item(), SlimefunItems.BIG_CAPACITOR.item(), SlimefunItems.BIG_CAPACITOR.item()},
                768, 8192).register(instance);

        new CustomSolarGen(FNAmpItems.SOLAR_GENERATORS, FNAmpItems.FN_FAL_GENERATOR_TIER4, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.SOLAR_GENERATOR_2.item(), FNAmpItems.FN_FAL_GENERATOR_TIER3.item(), SlimefunItems.SOLAR_GENERATOR_2.item(),
                SlimefunItems.DURALUMIN_INGOT.item(), SlimefunItems.POWER_CRYSTAL.item(), SlimefunItems.DURALUMIN_INGOT.item(),
                SlimefunItems.BIG_CAPACITOR.item(),  SlimefunItems.LARGE_CAPACITOR.item(), SlimefunItems.BIG_CAPACITOR.item()},
                1024, 10240).register(instance);

        new CustomSolarGen(FNAmpItems.SOLAR_GENERATORS, FNAmpItems.FN_FAL_GENERATOR_TIER5, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.BIG_CAPACITOR.item(), SlimefunItems.BIG_CAPACITOR.item(), SlimefunItems.BIG_CAPACITOR.item(),
                FNAmpItems.FN_FAL_GENERATOR_TIER1.item(), FNAmpItems.FN_FAL_GENERATOR_TIER2.item(), FNAmpItems.FN_FAL_GENERATOR_TIER1.item(),
                SlimefunItems.STEEL_INGOT.item(), SlimefunItems.LARGE_CAPACITOR.item(), SlimefunItems.STEEL_INGOT.item()},
                1282, 12288).register(instance);

        new CustomSolarGen(FNAmpItems.SOLAR_GENERATORS,  FNAmpItems.FN_FAL_GENERATOR_TIER6, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.STEEL_INGOT.item(), SlimefunItems.LARGE_CAPACITOR.item(), SlimefunItems.STEEL_INGOT.item(),
                SlimefunItems.DAMASCUS_STEEL_INGOT.item(), SlimefunItems.POWER_CRYSTAL.item(), SlimefunItems.DAMASCUS_STEEL_INGOT.item(),
                FNAmpItems.FN_FAL_GENERATOR_TIER2.item(), FNAmpItems.FN_FAL_GENERATOR_TIER3.item(), FNAmpItems.FN_FAL_GENERATOR_TIER2.item()},
                1538, 14336).register(instance);

        new CustomSolarGen(FNAmpItems.SOLAR_GENERATORS, FNAmpItems.FN_FAL_GENERATOR_TIER7, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.HARDENED_METAL_INGOT.item(), FNAmpItems.FN_FAL_GENERATOR_TIER5.item(), SlimefunItems.HARDENED_METAL_INGOT.item(),
                SlimefunItems.LARGE_CAPACITOR.item(), SlimefunItems.POWER_CRYSTAL.item(), SlimefunItems.LARGE_CAPACITOR.item(),
                SlimefunItems.DAMASCUS_STEEL_INGOT.item(), FNAmpItems.FN_FAL_GENERATOR_TIER1.item(), SlimefunItems.DAMASCUS_STEEL_INGOT.item()},
                1794, 16384).register(instance);

        new CustomSolarGen(FNAmpItems.SOLAR_GENERATORS, FNAmpItems.FN_FAL_GENERATOR_TIER8, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.BIG_CAPACITOR.item(),  FNAmpItems.FN_FAL_GENERATOR_TIER6.item(), SlimefunItems.BIG_CAPACITOR.item(),
                SlimefunItems.REINFORCED_ALLOY_INGOT.item(), SlimefunItems.POWER_CRYSTAL.item(), SlimefunItems.REINFORCED_ALLOY_INGOT.item(),
                SlimefunItems.LARGE_CAPACITOR.item(), FNAmpItems.FN_FAL_GENERATOR_TIER1.item(), SlimefunItems.LARGE_CAPACITOR.item()},
                2048, 20480).register(instance);
    }

}