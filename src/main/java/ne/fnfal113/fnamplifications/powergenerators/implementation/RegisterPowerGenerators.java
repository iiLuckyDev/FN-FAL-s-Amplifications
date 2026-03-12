package ne.fnfal113.fnamplifications.powergenerators.implementation;

import static ne.fnfal113.fnamplifications.utils.SfCompat.custom;
import static ne.fnfal113.fnamplifications.utils.SfCompat.head;
import static ne.fnfal113.fnamplifications.utils.SfCompat.item;

import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import ne.fnfal113.fnamplifications.items.FNAmpItems;
import ne.fnfal113.fnamplifications.multiblocks.FnAssemblyStation;

public class RegisterPowerGenerators {

    public static void setupPowerX(SlimefunAddon instance) {
        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R1, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.POWER_COMPONENT), custom(item(SlimefunItems.TIN_INGOT), 8), item(FNAmpItems.POWER_COMPONENT),
                item(FNAmpItems.BASIC_MACHINE_BLOCK), item(SlimefunItems.SOLAR_GENERATOR_4), item(FNAmpItems.BASIC_MACHINE_BLOCK),
                item(SlimefunItems.BASIC_CIRCUIT_BOARD), item(FNAmpItems.ALUMINUM_PLATING), item(SlimefunItems.BASIC_CIRCUIT_BOARD)
        }, 236, 138, 20, 100000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R2, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.POWER_COMPONENT), item(FNAmpItems.FN_XPANSION_POWER_R1), item(FNAmpItems.POWER_COMPONENT),
                item(FNAmpItems.BASIC_MACHINE_BLOCK), custom(item(SlimefunItems.SOLDER_INGOT), 12), item(FNAmpItems.BASIC_MACHINE_BLOCK),
                item(SlimefunItems.BASIC_CIRCUIT_BOARD), item(FNAmpItems.ALUMINUM_PLATING), item(SlimefunItems.BASIC_CIRCUIT_BOARD)
        }, 416, 276, 40, 200000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R3, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.POWER_COMPONENT), item(FNAmpItems.FN_XPANSION_POWER_R2), item(FNAmpItems.POWER_COMPONENT),
                item(FNAmpItems.BASIC_MACHINE_BLOCK), custom(item(SlimefunItems.BRONZE_INGOT), 16), item(FNAmpItems.BASIC_MACHINE_BLOCK),
                item(SlimefunItems.BASIC_CIRCUIT_BOARD), item(FNAmpItems.ALUMINUM_PLATING), item(SlimefunItems.BASIC_CIRCUIT_BOARD)
        }, 632, 552, 60, 300000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R4, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.POWER_COMPONENT), item(FNAmpItems.FN_XPANSION_POWER_R3), item(FNAmpItems.POWER_COMPONENT),
                item(FNAmpItems.BASIC_MACHINE_BLOCK), custom(item(SlimefunItems.DURALUMIN_INGOT), 20), item(FNAmpItems.BASIC_MACHINE_BLOCK),
                item(SlimefunItems.ADVANCED_CIRCUIT_BOARD), item(FNAmpItems.GOLD_PLATING), item(SlimefunItems.ADVANCED_CIRCUIT_BOARD)
        }, 1264, 1104, 120, 400000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R5, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.POWER_COMPONENT), item(FNAmpItems.FN_XPANSION_POWER_R4), item(FNAmpItems.POWER_COMPONENT),
                item(FNAmpItems.HIGHTECH_MACHINE_BLOCK), custom(item(SlimefunItems.ALUMINUM_BRASS_INGOT), 24), item(FNAmpItems.HIGHTECH_MACHINE_BLOCK),
                item(FNAmpItems.FN_FAL_GENERATOR_TIER1), item(FNAmpItems.GOLD_PLATING), item(SlimefunItems.ADVANCED_CIRCUIT_BOARD)
        }, 2420, 1784, 480, 500000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R6, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.POWER_COMPONENT), item(FNAmpItems.FN_XPANSION_POWER_R5), item(FNAmpItems.GEAR_PART),
                item(FNAmpItems.HIGHTECH_MACHINE_BLOCK), custom(item(SlimefunItems.CORINTHIAN_BRONZE_INGOT), 28), item(FNAmpItems.HIGHTECH_MACHINE_BLOCK),
                item(FNAmpItems.FN_FAL_GENERATOR_TIER2), item(FNAmpItems.GOLD_PLATING), item(SlimefunItems.REINFORCED_ALLOY_INGOT)
        }, 4342, 3128, 480, 600000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R7, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.POWER_COMPONENT), item(FNAmpItems.FN_XPANSION_POWER_R6), item(FNAmpItems.GEAR_PART),
                item(FNAmpItems.HIGHTECH_MACHINE_BLOCK), custom(item(SlimefunItems.STEEL_INGOT), 32), item(FNAmpItems.HIGHTECH_MACHINE_BLOCK),
                item(FNAmpItems.FN_FAL_GENERATOR_TIER3), item(FNAmpItems.BRASS_PLATING), item(SlimefunItems.BLISTERING_INGOT)
        }, 6302, 5142, 960, 700000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R8, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.POWER_COMPONENT), item(FNAmpItems.FN_XPANSION_POWER_R7), item(FNAmpItems.GEAR_PART),
                item(FNAmpItems.HIGHTECH_MACHINE_BLOCK), custom(item(SlimefunItems.DAMASCUS_STEEL_INGOT), 36), item(FNAmpItems.HIGHTECH_MACHINE_BLOCK),
                item(SlimefunItems.BLISTERING_INGOT_2), item(FNAmpItems.FN_FAL_GENERATOR_TIER4), item(SlimefunItems.BLISTERING_INGOT_2)
        }, 8524, 6752, 1200, 800000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R9, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.POWER_COMPONENT), item(FNAmpItems.FN_XPANSION_POWER_R8), item(FNAmpItems.GEAR_PART),
                item(FNAmpItems.HIGHTECH_MACHINE_BLOCK), custom(item(SlimefunItems.HARDENED_METAL_INGOT), 40), item(FNAmpItems.HIGHTECH_MACHINE_BLOCK),
                item(SlimefunItems.REINFORCED_ALLOY_INGOT), item(FNAmpItems.FN_FAL_GENERATOR_TIER5), item(SlimefunItems.REINFORCED_ALLOY_INGOT)
        }, 10384, 7431, 1440, 900000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R10, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.POWER_COMPONENT), item(FNAmpItems.FN_XPANSION_POWER_R9), item(FNAmpItems.GEAR_PART),
                item(SlimefunItems.ENERGIZED_CAPACITOR), custom(item(SlimefunItems.HARDENED_METAL_INGOT), 44), item(SlimefunItems.ENERGIZED_CAPACITOR),
                item(SlimefunItems.URANIUM), item(FNAmpItems.FN_FAL_GENERATOR_TIER6), item(SlimefunItems.URANIUM)
        }, 12392, 8128, 1520, 1000000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R11, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.POWER_COMPONENT), item(FNAmpItems.FN_XPANSION_POWER_R10), item(FNAmpItems.GEAR_PART),
                item(SlimefunItems.ENERGIZED_CAPACITOR), custom(item(SlimefunItems.REINFORCED_ALLOY_INGOT), 40), item(SlimefunItems.ENERGIZED_CAPACITOR),
                item(SlimefunItems.NEPTUNIUM), item(FNAmpItems.FN_FAL_GENERATOR_TIER7), item(SlimefunItems.NEPTUNIUM)
        }, 14584, 9462, 1640, 1500000).register(instance);

        new CustomPowerGen(FNAmpItems.POWER_GENERATORS, FNAmpItems.FN_XPANSION_POWER_R12, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.POWER_COMPONENT), item(FNAmpItems.FN_XPANSION_POWER_R11), item(FNAmpItems.GEAR_PART),
                item(SlimefunItems.ENERGIZED_CAPACITOR), custom(item(SlimefunItems.REINFORCED_ALLOY_INGOT), 44), item(SlimefunItems.ENERGIZED_CAPACITOR),
                item(FNAmpItems.REINFORCED_CASING), item(FNAmpItems.FN_XPANSION_POWER_R5), item(SlimefunItems.BOOSTED_URANIUM)
        }, 17768, 10128, 1780, 2000000).register(instance);

    }

    public static void setupSolarGen(SlimefunAddon instance){
        new CustomSolarGen(FNAmpItems.SOLAR_GENERATORS, FNAmpItems.FN_FAL_GENERATOR_TIER1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                item(SlimefunItems.SOLAR_GENERATOR_2), item(SlimefunItems.SOLAR_GENERATOR), item(SlimefunItems.SOLAR_GENERATOR_2),
                item(SlimefunItems.BIG_CAPACITOR), item(SlimefunItems.POWER_CRYSTAL), item(SlimefunItems.BIG_CAPACITOR),
                item(SlimefunItems.SOLAR_GENERATOR_2), item(SlimefunItems.SOLAR_GENERATOR_3), item(SlimefunItems.SOLAR_GENERATOR_2)},
                256, 0, 4096).register(instance);

        new CustomSolarGen(FNAmpItems.SOLAR_GENERATORS, FNAmpItems.FN_FAL_GENERATOR_TIER2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                item(SlimefunItems.MEDIUM_CAPACITOR), item(FNAmpItems.FN_FAL_GENERATOR_TIER1), item(SlimefunItems.MEDIUM_CAPACITOR),
                item(SlimefunItems.BIG_CAPACITOR), item(SlimefunItems.POWER_CRYSTAL), item(SlimefunItems.BIG_CAPACITOR),
                item(SlimefunItems.BIG_CAPACITOR), item(FNAmpItems.FN_FAL_GENERATOR_TIER1), item(SlimefunItems.BIG_CAPACITOR)},
                512, 0, 6144).register(instance);

        new CustomSolarGen(FNAmpItems.SOLAR_GENERATORS, FNAmpItems.FN_FAL_GENERATOR_TIER3, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                item(SlimefunItems.BIG_CAPACITOR), item(FNAmpItems.FN_FAL_GENERATOR_TIER1), item(SlimefunItems.BIG_CAPACITOR),
                item(FNAmpItems.FN_FAL_GENERATOR_TIER1), item(SlimefunItems.POWER_CRYSTAL), item(FNAmpItems.FN_FAL_GENERATOR_TIER1),
                item(SlimefunItems.BIG_CAPACITOR), item(SlimefunItems.BIG_CAPACITOR), item(SlimefunItems.BIG_CAPACITOR)},
                768, 0, 8192).register(instance);

        new CustomSolarGen(FNAmpItems.SOLAR_GENERATORS, FNAmpItems.FN_FAL_GENERATOR_TIER4, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                item(SlimefunItems.SOLAR_GENERATOR_2), item(FNAmpItems.FN_FAL_GENERATOR_TIER3), item(SlimefunItems.SOLAR_GENERATOR_2),
                item(SlimefunItems.DURALUMIN_INGOT), item(SlimefunItems.POWER_CRYSTAL), item(SlimefunItems.DURALUMIN_INGOT),
                item(SlimefunItems.BIG_CAPACITOR),  item(SlimefunItems.LARGE_CAPACITOR), item(SlimefunItems.BIG_CAPACITOR)},
                1024, 0, 10240).register(instance);

        new CustomSolarGen(FNAmpItems.SOLAR_GENERATORS, FNAmpItems.FN_FAL_GENERATOR_TIER5, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                item(SlimefunItems.BIG_CAPACITOR), item(SlimefunItems.BIG_CAPACITOR), item(SlimefunItems.BIG_CAPACITOR),
                item(FNAmpItems.FN_FAL_GENERATOR_TIER1), item(FNAmpItems.FN_FAL_GENERATOR_TIER2), item(FNAmpItems.FN_FAL_GENERATOR_TIER1),
                item(SlimefunItems.STEEL_INGOT), item(SlimefunItems.LARGE_CAPACITOR), item(SlimefunItems.STEEL_INGOT)},
                1282, 0, 12288).register(instance);

        new CustomSolarGen(FNAmpItems.SOLAR_GENERATORS, FNAmpItems.FN_FAL_GENERATOR_TIER6, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                item(SlimefunItems.STEEL_INGOT), item(SlimefunItems.LARGE_CAPACITOR), item(SlimefunItems.STEEL_INGOT),
                item(SlimefunItems.DAMASCUS_STEEL_INGOT), item(SlimefunItems.POWER_CRYSTAL), item(SlimefunItems.DAMASCUS_STEEL_INGOT),
                item(FNAmpItems.FN_FAL_GENERATOR_TIER2), item(FNAmpItems.FN_FAL_GENERATOR_TIER3), item(FNAmpItems.FN_FAL_GENERATOR_TIER2)},
                1538, 0, 14336).register(instance);

        new CustomSolarGen(FNAmpItems.SOLAR_GENERATORS, FNAmpItems.FN_FAL_GENERATOR_TIER7, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                item(SlimefunItems.HARDENED_METAL_INGOT), item(FNAmpItems.FN_FAL_GENERATOR_TIER5), item(SlimefunItems.HARDENED_METAL_INGOT),
                item(SlimefunItems.LARGE_CAPACITOR), item(SlimefunItems.POWER_CRYSTAL), item(SlimefunItems.LARGE_CAPACITOR),
                item(SlimefunItems.DAMASCUS_STEEL_INGOT), item(FNAmpItems.FN_FAL_GENERATOR_TIER1), item(SlimefunItems.DAMASCUS_STEEL_INGOT)},
                1794, 0, 16384).register(instance);

        new CustomSolarGen(FNAmpItems.SOLAR_GENERATORS, FNAmpItems.FN_FAL_GENERATOR_TIER8, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                item(SlimefunItems.BIG_CAPACITOR), item(FNAmpItems.FN_FAL_GENERATOR_TIER6), item(SlimefunItems.BIG_CAPACITOR),
                item(SlimefunItems.REINFORCED_ALLOY_INGOT), item(SlimefunItems.POWER_CRYSTAL), item(SlimefunItems.REINFORCED_ALLOY_INGOT),
                item(SlimefunItems.LARGE_CAPACITOR), item(FNAmpItems.FN_FAL_GENERATOR_TIER1), item(SlimefunItems.LARGE_CAPACITOR)},
                2048, 0, 20480).register(instance);
    }

}
