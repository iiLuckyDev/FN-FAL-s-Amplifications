package ne.fnfal113.fnamplifications.machines.implementation;

import static ne.fnfal113.fnamplifications.utils.SfCompat.item;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import ne.fnfal113.fnamplifications.items.FNAmpItems;
import ne.fnfal113.fnamplifications.machines.*;
import ne.fnfal113.fnamplifications.multiblocks.FnAssemblyStation;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RegisterMachines {

    public static void setup(SlimefunAddon instance){
        new ElectricBlockBreaker(FNAmpItems.MACHINES, FNAmpItems.FN_BLOCK_BREAKER_1, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.GEAR_PART), item(FNAmpItems.COMPONENT_PART), item(FNAmpItems.GEAR_PART),
                new ItemStack(Material.DIAMOND_PICKAXE), item(FNAmpItems.BASIC_MACHINE_BLOCK), new ItemStack(Material.IRON_PICKAXE),
                item(FNAmpItems.ALUMINUM_PLATING), item(FNAmpItems.POWER_COMPONENT), item(FNAmpItems.ALUMINUM_PLATING)}, 12)
                .setCapacity(512)
                .setEnergyConsumption(32)
                .register(instance);

        new ElectricBlockBreaker(FNAmpItems.MACHINES, FNAmpItems.FN_BLOCK_BREAKER_2, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.GEAR_PART, 2), item(FNAmpItems.COMPONENT_PART), item(FNAmpItems.GEAR_PART, 2),
                item(FNAmpItems.FN_BLOCK_BREAKER_1), item(FNAmpItems.BASIC_MACHINE_BLOCK, 2), new ItemStack(Material.DIAMOND_PICKAXE),
                item(FNAmpItems.BRASS_PLATING), item(FNAmpItems.POWER_COMPONENT, 2), item(FNAmpItems.BRASS_PLATING)}, 6)
                .setCapacity(1024)
                .setEnergyConsumption(64)
                .register(instance);

        new ElectricBlockBreaker(FNAmpItems.MACHINES, FNAmpItems.FN_BLOCK_BREAKER_3, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.GEAR_PART, 3), item(FNAmpItems.COMPONENT_PART), item(FNAmpItems.GEAR_PART, 3),
                item(FNAmpItems.FN_BLOCK_BREAKER_1), item(FNAmpItems.HIGHTECH_MACHINE_BLOCK), item(FNAmpItems.FN_BLOCK_BREAKER_2),
                item(FNAmpItems.REINFORCED_CASING), item(FNAmpItems.POWER_COMPONENT, 2), item(FNAmpItems.REINFORCED_CASING)}, 2)
                .setCapacity(2048)
                .setEnergyConsumption(128)
                .register(instance);

        new ElectricCompressor(FNAmpItems.MACHINES, FNAmpItems.FN_FAL_COMPRESSOR_1, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.COMPRESSOR_PART), item(FNAmpItems.THREAD_PART), item(FNAmpItems.MOTOR_SWITCH),
                item(FNAmpItems.GEAR_PART), item(FNAmpItems.BASIC_MACHINE_BLOCK), item(FNAmpItems.GEAR_PART),
                item(FNAmpItems.CONDENSER_PART), item(FNAmpItems.ALUMINUM_PLATING), item(FNAmpItems.POWER_COMPONENT)})
                .setCapacity(1536).setEnergyConsumption(64).setProcessingSpeed(1).register(instance);

        new ElectricCompressor(FNAmpItems.MACHINES, FNAmpItems.FN_FAL_COMPRESSOR_2, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.COMPRESSOR_PART, 2), item(FNAmpItems.THREAD_PART, 2), item(FNAmpItems.MOTOR_SWITCH),
                item(FNAmpItems.GEAR_PART, 4), item(FNAmpItems.BASIC_MACHINE_BLOCK), item(FNAmpItems.FN_FAL_COMPRESSOR_1),
                item(FNAmpItems.CONDENSER_PART), item(FNAmpItems.DIAMOND_PLATING), item(FNAmpItems.POWER_COMPONENT)})
                .setCapacity(1536).setEnergyConsumption(128).setProcessingSpeed(2).register(instance);

        new ElectricCompressor(FNAmpItems.MACHINES, FNAmpItems.FN_FAL_COMPRESSOR_3, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.COMPRESSOR_PART, 3), item(FNAmpItems.COMPONENT_PART, 2), item(FNAmpItems.MOTOR_SWITCH),
                item(FNAmpItems.FN_FAL_COMPRESSOR_2), item(FNAmpItems.HIGHTECH_MACHINE_BLOCK), item(FNAmpItems.FN_FAL_COMPRESSOR_2),
                item(FNAmpItems.CONDENSER_PART), item(FNAmpItems.REINFORCED_CASING), item(FNAmpItems.POWER_COMPONENT)})
                .setCapacity(1536).setEnergyConsumption(256).setProcessingSpeed(4).register(instance);

        new ElectricIngotCondenser(FNAmpItems.MACHINES, FNAmpItems.FN_FAL_CONDENSER_1, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.MOTOR_SWITCH), item(FNAmpItems.THREAD_PART), item(FNAmpItems.FUNNEL_PART),
                item(FNAmpItems.GEAR_PART), item(FNAmpItems.BASIC_MACHINE_BLOCK), item(FNAmpItems.POWER_COMPONENT),
                item(FNAmpItems.COMPRESSOR_PART), item(FNAmpItems.GOLD_PLATING), item(FNAmpItems.COMPRESSOR_PART)})
                .setCapacity(1536).setEnergyConsumption(128).setProcessingSpeed(1).register(instance);

        new ElectricIngotCondenser(FNAmpItems.MACHINES, FNAmpItems.FN_FAL_CONDENSER_2, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.MOTOR_SWITCH), item(FNAmpItems.FN_FAL_CONDENSER_1), item(FNAmpItems.FUNNEL_PART),
                item(FNAmpItems.GEAR_PART, 2), item(FNAmpItems.BASIC_MACHINE_BLOCK), item(FNAmpItems.POWER_COMPONENT, 2),
                item(FNAmpItems.THREAD_PART), item(FNAmpItems.DIAMOND_PLATING), item(FNAmpItems.COMPONENT_PART)})
                .setCapacity(1536).setEnergyConsumption(192).setProcessingSpeed(2).register(instance);

        new ElectricIngotCondenser(FNAmpItems.MACHINES, FNAmpItems.FN_FAL_CONDENSER_3, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.FN_FAL_CONDENSER_1), item(FNAmpItems.FN_FAL_CONDENSER_1), item(FNAmpItems.FN_FAL_CONDENSER_1),
                item(FNAmpItems.GEAR_PART, 3), item(FNAmpItems.HIGHTECH_MACHINE_BLOCK), item(FNAmpItems.POWER_COMPONENT, 3),
                item(FNAmpItems.THREAD_PART), item(FNAmpItems.REINFORCED_CASING), item(FNAmpItems.COMPONENT_PART)})
                .setCapacity(1536).setEnergyConsumption(384).setProcessingSpeed(4).register(instance);

        new ElectricMachineDowngrader(FNAmpItems.MACHINES, FNAmpItems.FN_FAL_DOWNGRADER, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.COMPRESSOR_PART), item(FNAmpItems.DOWNGRADER_PART), item(FNAmpItems.RECYCLER_PART),
                item(FNAmpItems.GEAR_PART, 2), item(FNAmpItems.HIGHTECH_MACHINE_BLOCK), item(FNAmpItems.POWER_COMPONENT, 2),
                item(FNAmpItems.CONDENSER_PART), item(FNAmpItems.REINFORCED_CASING), item(FNAmpItems.MOTOR_SWITCH)})
                .setCapacity(4024).setEnergyConsumption(750).setProcessingSpeed(2).register(instance);

        new ElectricRecycler(FNAmpItems.MACHINES, FNAmpItems.FN_FAL_RECYCLER_1, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.FUNNEL_PART), item(FNAmpItems.RECYCLER_PART), item(FNAmpItems.COMPRESSOR_PART),
                item(FNAmpItems.THREAD_PART), item(FNAmpItems.BASIC_MACHINE_BLOCK), item(FNAmpItems.POWER_COMPONENT),
                item(FNAmpItems.CONDENSER_PART), item(FNAmpItems.BRASS_PLATING), item(FNAmpItems.MOTOR_SWITCH)})
                .setCapacity(1536).setEnergyConsumption(84).setProcessingSpeed(1).register(instance);

        new ElectricRecycler(FNAmpItems.MACHINES, FNAmpItems.FN_FAL_RECYCLER_2, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.FUNNEL_PART, 2), item(FNAmpItems.RECYCLER_PART), item(FNAmpItems.COMPRESSOR_PART),
                item(FNAmpItems.THREAD_PART), item(FNAmpItems.BASIC_MACHINE_BLOCK), item(FNAmpItems.POWER_COMPONENT, 2),
                item(FNAmpItems.FN_FAL_RECYCLER_1), item(FNAmpItems.ALUMINUM_PLATING), item(FNAmpItems.MOTOR_SWITCH)})
                .setCapacity(1536).setEnergyConsumption(168).setProcessingSpeed(2).register(instance);

        new ElectricRecycler(FNAmpItems.MACHINES, FNAmpItems.FN_FAL_RECYCLER_3, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.RECYCLER_PART, 3), item(FNAmpItems.FN_FAL_RECYCLER_1), item(FNAmpItems.COMPRESSOR_PART),
                item(FNAmpItems.GEAR_PART), item(FNAmpItems.HIGHTECH_MACHINE_BLOCK), item(FNAmpItems.POWER_COMPONENT, 3),
                item(FNAmpItems.FN_FAL_RECYCLER_1), item(FNAmpItems.REINFORCED_CASING), item(FNAmpItems.FN_FAL_RECYCLER_1)})
                .setCapacity(1536).setEnergyConsumption(336).setProcessingSpeed(4).register(instance);

        new ElectricTransformer(FNAmpItems.MACHINES, FNAmpItems.FN_FAL_TRANSFORMER_1, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.FUNNEL_PART), item(FNAmpItems.THREAD_PART), item(FNAmpItems.POWER_COMPONENT),
                item(FNAmpItems.GEAR_PART), item(FNAmpItems.BASIC_MACHINE_BLOCK), item(FNAmpItems.GEAR_PART),
                item(FNAmpItems.COMPRESSOR_PART), item(FNAmpItems.BRASS_PLATING), item(FNAmpItems.CONDENSER_PART)})
                .setCapacity(1536).setEnergyConsumption(128).setProcessingSpeed(1).register(instance);

        new ElectricTransformer(FNAmpItems.MACHINES, FNAmpItems.FN_FAL_TRANSFORMER_2, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.FUNNEL_PART), item(FNAmpItems.FN_FAL_TRANSFORMER_1), item(FNAmpItems.POWER_COMPONENT),
                item(FNAmpItems.GEAR_PART, 2), item(FNAmpItems.BASIC_MACHINE_BLOCK), item(FNAmpItems.GEAR_PART, 2),
                item(FNAmpItems.THREAD_PART), item(FNAmpItems.ALUMINUM_PLATING), item(FNAmpItems.CONDENSER_PART)})
                .setCapacity(1536).setEnergyConsumption(192).setProcessingSpeed(2).register(instance);

        new ElectricTransformer(FNAmpItems.MACHINES, FNAmpItems.FN_FAL_TRANSFORMER_3, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.FUNNEL_PART, 2), item(FNAmpItems.FN_FAL_TRANSFORMER_2), item(FNAmpItems.POWER_COMPONENT),
                item(FNAmpItems.FN_FAL_TRANSFORMER_1), item(FNAmpItems.HIGHTECH_MACHINE_BLOCK), item(FNAmpItems.FN_FAL_TRANSFORMER_1),
                item(FNAmpItems.COMPONENT_PART), item(FNAmpItems.REINFORCED_CASING), item(FNAmpItems.CONDENSER_PART, 2)})
                .setCapacity(1536).setEnergyConsumption(384).setProcessingSpeed(4).register(instance);

        new ElectricJukebox(FNAmpItems.MACHINES, FNAmpItems.FN_JUKEBOX_I, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.BASIC_MACHINE_BLOCK), item(FNAmpItems.BRASS_PLATING), item(FNAmpItems.BASIC_MACHINE_BLOCK),
                item(SlimefunItems.COPPER_INGOT), new ItemStack(Material.JUKEBOX), item(SlimefunItems.COPPER_INGOT),
                item(FNAmpItems.COMPONENT_PART), item(FNAmpItems.BRASS_PLATING), item(FNAmpItems.COMPONENT_PART)},
                21, 23, 0 ,0, false)
                .setCapacity(512).setEnergyConsumption(3).register(instance);

        new ElectricJukebox(FNAmpItems.MACHINES, FNAmpItems.FN_JUKEBOX_II, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.ALUMINUM_PLATING), item(FNAmpItems.BASIC_MACHINE_BLOCK), item(FNAmpItems.ALUMINUM_PLATING),
                item(SlimefunItems.ALUMINUM_INGOT), item(FNAmpItems.FN_JUKEBOX_I), item(SlimefunItems.ALUMINUM_INGOT),
                item(FNAmpItems.COMPONENT_PART), item(FNAmpItems.COMPONENT_PART), item(FNAmpItems.COMPONENT_PART)},
                19, 25, 0, 0, false)
                .setCapacity(768).setEnergyConsumption(8).register(instance);

        new ElectricJukebox(FNAmpItems.MACHINES, FNAmpItems.FN_JUKEBOX_III, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.BASIC_MACHINE_BLOCK), item(FNAmpItems.COMPONENT_PART), item(FNAmpItems.BASIC_MACHINE_BLOCK),
                item(SlimefunItems.BRASS_INGOT), item(FNAmpItems.FN_JUKEBOX_II), item(SlimefunItems.BRASS_INGOT),
                item(FNAmpItems.COMPONENT_PART), item(FNAmpItems.REINFORCED_CASING), item(FNAmpItems.COMPONENT_PART)},
                19, 25, 29, 33, true)
                .setCapacity(1024).setEnergyConsumption(16).register(instance);
    }
}
