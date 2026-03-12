package ne.fnfal113.fnamplifications.staffs.implementations;

import static ne.fnfal113.fnamplifications.utils.SfCompat.item;

import io.github.thebusybiscuit.slimefun4.api.MinecraftVersion;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import ne.fnfal113.fnamplifications.items.FNAmpItems;
import ne.fnfal113.fnamplifications.multiblocks.FnAssemblyStation;
import ne.fnfal113.fnamplifications.staffs.*;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RegisterStaffs {

    public static void setup(SlimefunAddon instance){
        new StaffOfAirStrider(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_AIR_STRIDER, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.CLOUD_RUNE), new ItemStack(Material.FEATHER, 1),  item(FNAmpItems.CLOUD_RUNE),
                item(SlimefunItems.MAGIC_LUMP_3, 1), new ItemStack(Material.BLAZE_ROD), item(SlimefunItems.MAGIC_LUMP_3, 1),
                item(FNAmpItems.CLOUD_RUNE), null, item(FNAmpItems.CLOUD_RUNE)})
                .register(instance);

        new StaffOfAwareness(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_AWARENESS, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                null, new ItemStack(Material.BLAZE_POWDER, 4), null,
                item(FNAmpItems.INTELLECT_RUNE), new ItemStack(Material.BLAZE_ROD), item(FNAmpItems.INTELLECT_RUNE),
                null, item(SlimefunItems.MAGIC_SUGAR), null})
                .register(instance);

        new StaffOfConfusion(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_CONFUSION, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.MAGIC_LUMP_3, 1), item(FNAmpItems.LINGER_RUNE), item(SlimefunItems.MAGIC_LUMP_3, 1),
                item(FNAmpItems.PESTILENCE_RUNE), new ItemStack(Material.BLAZE_ROD), item(FNAmpItems.PESTILENCE_RUNE),
                null, item(SlimefunItems.MAGIC_SUGAR), null})
                .register(instance);

        if(Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_17)) {
            new StaffOfDeepFreeze(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_DEEPFREEZE, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                    null, item(FNAmpItems.LINGER_RUNE), null,
                    item(FNAmpItems.ICE_RUNE), new ItemStack(Material.BLAZE_ROD), item(FNAmpItems.ICE_RUNE),
                    null, item(SlimefunItems.MAGIC_SUGAR), null})
                    .register(instance);
        }

        new StaffOfExplosion(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_EXPLOSION, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.POWER_RUNE), new ItemStack(Material.TNT, 1), item(FNAmpItems.POWER_RUNE),
                item(SlimefunItems.MAGIC_SUGAR), new ItemStack(Material.BLAZE_ROD), item(SlimefunItems.MAGIC_SUGAR),
                null, new ItemStack(Material.GUNPOWDER, 1), null})
                .register(instance);

        new StaffOfFangs(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_FANGS, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.SPIRIT_RUNE), new ItemStack(Material.ROTTEN_FLESH, 1), item(FNAmpItems.SPIRIT_RUNE),
                null, new ItemStack(Material.BLAZE_ROD), null,
                item(FNAmpItems.SPIRIT_RUNE), new ItemStack(Material.ROTTEN_FLESH, 1), item(FNAmpItems.SPIRIT_RUNE)})
                .register(instance);

        new StaffOfForce(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_FORCE, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.MAGIC_LUMP_3, 1), new ItemStack(Material.FEATHER, 12), item(SlimefunItems.ENDER_LUMP_3, 1),
                item(FNAmpItems.AGILITY_RUNE), new ItemStack(Material.BLAZE_ROD),  item(FNAmpItems.AGILITY_RUNE),
                null, item(FNAmpItems.CLOUD_RUNE), null})
                .register(instance);

        new StaffOfGravitationalPull(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_GRAVITY, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.MAGIC_LUMP_1, 1), item(FNAmpItems.SPIRIT_RUNE), item(SlimefunItems.MAGIC_LUMP_1, 1),
                null, new ItemStack(Material.BLAZE_ROD), null,
                item(FNAmpItems.INTELLECT_RUNE), item(SlimefunItems.MAGIC_SUGAR), item(FNAmpItems.INTELLECT_RUNE)})
                .register(instance);

        new StaffOfHealing(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_HEALING, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.MAGIC_SUGAR, 1), null, item(SlimefunItems.MAGIC_SUGAR, 1),
                item(SlimefunItems.BANDAGE, 2), new ItemStack(Material.BLAZE_ROD), item(SlimefunItems.BANDAGE, 2),
                item(FNAmpItems.HEART_RUNE), null, item(FNAmpItems.HEART_RUNE)})
                .register(instance);

        new StaffOfHellFire(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_HELLFIRE, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.MAGIC_LUMP_3, 2), null, item(SlimefunItems.MAGIC_LUMP_3, 2),
                item(FNAmpItems.SPIRAL_FIRE_RUNE), new ItemStack(Material.BLAZE_ROD), item(FNAmpItems.SPIRAL_FIRE_RUNE),
                null, item(SlimefunItems.MAGIC_SUGAR), null})
                .register(instance);

        new StaffOfInvisibility(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_INVI, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                null, item(FNAmpItems.INTELLECT_RUNE), null,
                item(FNAmpItems.POWER_RUNE), new ItemStack(Material.BLAZE_ROD), item(FNAmpItems.POWER_RUNE),
                null, item(FNAmpItems.INTELLECT_RUNE),  null})
                .register(instance);

        new StaffOfInvulnerability(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_INVULNERABILITY, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.POWER_RUNE), new ItemStack(Material.GOLDEN_APPLE, 1), item(FNAmpItems.POWER_RUNE),
                null, new ItemStack(Material.BLAZE_ROD), null,
                item(SlimefunItems.MAGIC_LUMP_1, 2), null, item(SlimefunItems.MAGIC_LUMP_1, 2)})
                .register(instance);

        new StaffOfLocomotion(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_LOCOMOTION, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.INTELLECT_RUNE), new ItemStack(Material.ENDER_PEARL, 1), item(FNAmpItems.CLOUD_RUNE),
                null, new ItemStack(Material.BLAZE_ROD), null,
                item(FNAmpItems.CLOUD_RUNE), new ItemStack(Material.ENDER_PEARL, 1), item(FNAmpItems.INTELLECT_RUNE)})
                .register(instance);

        new StaffOfMinerals(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_MINERALS, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.EARTH_RUNE, 1), new ItemStack(Material.BLAZE_POWDER, 1), item(SlimefunItems.EARTH_RUNE, 1),
                item(SlimefunItems.MAGIC_LUMP_3, 1), new ItemStack(Material.BLAZE_ROD), item(SlimefunItems.MAGIC_LUMP_3, 1),
                item(FNAmpItems.INTELLECT_RUNE), null, item(FNAmpItems.INTELLECT_RUNE)})
                .register(instance);

        new StaffOfMuster(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_MUSTER, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                null, new ItemStack(Material.ENDER_PEARL, 2), null,
                item(FNAmpItems.SPIRIT_RUNE), new ItemStack(Material.BLAZE_ROD), item(FNAmpItems.SPIRIT_RUNE),
                item(SlimefunItems.ENDER_LUMP_3, 3), null, item(SlimefunItems.ENDER_LUMP_3, 3)})
                .register(instance);

        new StaffOfSkulls(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_SKULLS, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                null, new ItemStack(Material.WITHER_SKELETON_SKULL, 5),  null,
                item(FNAmpItems.SPIRIT_RUNE), new ItemStack(Material.BLAZE_ROD), item(FNAmpItems.SPIRIT_RUNE),
                null, new ItemStack(Material.BLAZE_POWDER, 3), null})
                .register(instance);

        new StaffOfStallion(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_STALLION, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.SPIRIT_RUNE), new ItemStack(Material.SADDLE), item(FNAmpItems.SPIRIT_RUNE),
                null, new ItemStack(Material.BLAZE_ROD), null,
                new ItemStack(Material.BONE, 4), null, new ItemStack(Material.BONE, 4)})
                .register(instance);

        new StaffOfTeleportation(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_TP, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.ENDER_LUMP_3, 2), item(FNAmpItems.INTELLECT_RUNE), item(SlimefunItems.ENDER_LUMP_3, 2),
                null, new ItemStack(Material.BLAZE_ROD), null,
                null, item(SlimefunItems.ENDER_RUNE), null})
                .register(instance);

        new StaffOfWebs(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_COBWEB, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.PESTILENCE_RUNE), null,  item(FNAmpItems.PESTILENCE_RUNE),
                new ItemStack(Material.COBWEB, 2), new ItemStack(Material.BLAZE_ROD),  new ItemStack(Material.COBWEB, 2),
                null, item(SlimefunItems.MAGIC_SUGAR, 5), null})
                .register(instance);
    }
}
