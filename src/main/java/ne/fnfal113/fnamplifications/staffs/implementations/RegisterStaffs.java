package ne.fnfal113.fnamplifications.staffs.implementations;

import io.github.thebusybiscuit.slimefun4.api.MinecraftVersion;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import ne.fnfal113.fnamplifications.items.FNAmpItems;
import ne.fnfal113.fnamplifications.multiblocks.FnAssemblyStation;
import ne.fnfal113.fnamplifications.staffs.*;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RegisterStaffs {

    public static void setup(SlimefunAddon instance){
        new StaffOfAirStrider(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_AIR_STRIDER, FnAssemblyStation.RECIPE_TYPE, new ItemStack[] {
                FNAmpItems.CLOUD_RUNE.item(), new ItemStack(Material.FEATHER, 1),  FNAmpItems.CLOUD_RUNE.item(),
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 1).item(), new ItemStack(Material.BLAZE_ROD), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 1).item(),
                FNAmpItems.CLOUD_RUNE.item(), null, FNAmpItems.CLOUD_RUNE.item()})
                .register(instance);

        new StaffOfAwareness(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_AWARENESS, FnAssemblyStation.RECIPE_TYPE, new ItemStack[] {
                null, new ItemStack(Material.BLAZE_POWDER, 4), null,
                FNAmpItems.INTELLECT_RUNE.item(), new ItemStack(Material.BLAZE_ROD), FNAmpItems.INTELLECT_RUNE.item(),
                null, SlimefunItems.MAGIC_SUGAR.item(), null})
                .register(instance);

        new StaffOfConfusion(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_CONFUSION, FnAssemblyStation.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 1).item(), FNAmpItems.LINGER_RUNE.item(), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 1).item(),
                FNAmpItems.PESTILENCE_RUNE.item(), new ItemStack(Material.BLAZE_ROD), FNAmpItems.PESTILENCE_RUNE.item(),
                null, SlimefunItems.MAGIC_SUGAR.item(), null})
                .register(instance);

        if(Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_17)) {
            new StaffOfDeepFreeze(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_DEEPFREEZE, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                    null, FNAmpItems.LINGER_RUNE.item(), null,
                    FNAmpItems.ICE_RUNE.item(), new ItemStack(Material.BLAZE_ROD), FNAmpItems.ICE_RUNE.item(),
                    null, SlimefunItems.MAGIC_SUGAR.item(), null})
                    .register(instance);
        }

        new StaffOfExplosion(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_EXPLOSION, FnAssemblyStation.RECIPE_TYPE, new ItemStack[] {
                FNAmpItems.POWER_RUNE.item(), new ItemStack(Material.TNT, 1), FNAmpItems.POWER_RUNE.item(),
                SlimefunItems.MAGIC_SUGAR.item(), new ItemStack(Material.BLAZE_ROD), SlimefunItems.MAGIC_SUGAR.item(),
                null, new ItemStack(Material.GUNPOWDER, 1), null})
                .register(instance);

        new StaffOfFangs(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_FANGS, FnAssemblyStation.RECIPE_TYPE, new ItemStack[] {
                FNAmpItems.SPIRIT_RUNE.item(), new ItemStack(Material.ROTTEN_FLESH, 1), FNAmpItems.SPIRIT_RUNE.item(),
                null, new ItemStack(Material.BLAZE_ROD), null,
                FNAmpItems.SPIRIT_RUNE.item(), new ItemStack(Material.ROTTEN_FLESH, 1), FNAmpItems.SPIRIT_RUNE.item()})
                .register(instance);

        new StaffOfForce(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_FORCE, FnAssemblyStation.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 1).item(), new ItemStack(Material.FEATHER, 12), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_3, 1).item(),
                FNAmpItems.AGILITY_RUNE.item(), new ItemStack(Material.BLAZE_ROD),  FNAmpItems.AGILITY_RUNE.item(),
                null, FNAmpItems.CLOUD_RUNE.item(), null})
                .register(instance);

        new StaffOfGravitationalPull(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_GRAVITY, FnAssemblyStation.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 1).item(), FNAmpItems.SPIRIT_RUNE.item(), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 1).item(),
                null, new ItemStack(Material.BLAZE_ROD), null,
                FNAmpItems.INTELLECT_RUNE.item(), SlimefunItems.MAGIC_SUGAR.item(), FNAmpItems.INTELLECT_RUNE.item()})
                .register(instance);

        new StaffOfHealing(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_HEALING, FnAssemblyStation.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.MAGIC_SUGAR, 1).item(), null, new SlimefunItemStack(SlimefunItems.MAGIC_SUGAR, 1).item(),
                new SlimefunItemStack(SlimefunItems.BANDAGE, 2).item(), new ItemStack(Material.BLAZE_ROD), new SlimefunItemStack(SlimefunItems.BANDAGE, 2).item(),
                FNAmpItems.HEART_RUNE.item(), null, FNAmpItems.HEART_RUNE.item()})
                .register(instance);

        new StaffOfHellFire(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_HELLFIRE, FnAssemblyStation.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 2).item(), null, new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 2).item(),
                FNAmpItems.SPIRAL_FIRE_RUNE.item(), new ItemStack(Material.BLAZE_ROD), FNAmpItems.SPIRAL_FIRE_RUNE.item(),
                null, SlimefunItems.MAGIC_SUGAR.item(), null})
                .register(instance);

        new StaffOfInvisibility(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_INVI, FnAssemblyStation.RECIPE_TYPE, new ItemStack[] {
                null, FNAmpItems.INTELLECT_RUNE.item(), null,
                FNAmpItems.POWER_RUNE.item(), new ItemStack(Material.BLAZE_ROD), FNAmpItems.POWER_RUNE.item(),
                null, FNAmpItems.INTELLECT_RUNE.item(),  null})
                .register(instance);

        new StaffOfInvulnerability(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_INVULNERABILITY, FnAssemblyStation.RECIPE_TYPE, new ItemStack[] {
                FNAmpItems.POWER_RUNE.item(), new ItemStack(Material.GOLDEN_APPLE, 1), FNAmpItems.POWER_RUNE.item(),
                null, new ItemStack(Material.BLAZE_ROD), null,
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 2).item(), null, new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 2).item()})
                .register(instance);

        new StaffOfLocomotion(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_LOCOMOTION, FnAssemblyStation.RECIPE_TYPE, new ItemStack[] {
                FNAmpItems.INTELLECT_RUNE.item(), new ItemStack(Material.ENDER_PEARL, 1), FNAmpItems.CLOUD_RUNE.item(),
                null, new ItemStack(Material.BLAZE_ROD), null,
                FNAmpItems.CLOUD_RUNE.item(), new ItemStack(Material.ENDER_PEARL, 1), FNAmpItems.INTELLECT_RUNE.item()})
                .register(instance);

        new StaffOfMinerals(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_MINERALS, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                new SlimefunItemStack(SlimefunItems.EARTH_RUNE, 1).item(), new ItemStack(Material.BLAZE_POWDER, 1), new SlimefunItemStack(SlimefunItems.EARTH_RUNE, 1).item(),
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 1).item(), new ItemStack(Material.BLAZE_ROD), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 1).item(),
                FNAmpItems.INTELLECT_RUNE.item(), null, FNAmpItems.INTELLECT_RUNE.item()})
                .register(instance);

        new StaffOfMuster(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_MUSTER, FnAssemblyStation.RECIPE_TYPE, new ItemStack[] {
                null, new ItemStack(Material.ENDER_PEARL, 2), null,
                FNAmpItems.SPIRIT_RUNE.item(), new ItemStack(Material.BLAZE_ROD), FNAmpItems.SPIRIT_RUNE.item(),
                new SlimefunItemStack(SlimefunItems.ENDER_LUMP_3, 3).item(), null, new SlimefunItemStack(SlimefunItems.ENDER_LUMP_3, 3).item()})
                .register(instance);

        new StaffOfSkulls(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_SKULLS, FnAssemblyStation.RECIPE_TYPE, new ItemStack[] {
                null, new ItemStack(Material.WITHER_SKELETON_SKULL, 5),  null,
                FNAmpItems.SPIRIT_RUNE.item(), new ItemStack(Material.BLAZE_ROD), FNAmpItems.SPIRIT_RUNE.item(),
                null, new ItemStack(Material.BLAZE_POWDER, 3), null})
                .register(instance);

        new StaffOfStallion(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_STALLION, FnAssemblyStation.RECIPE_TYPE, new ItemStack[] {
                FNAmpItems.SPIRIT_RUNE.item(), new ItemStack(Material.SADDLE), FNAmpItems.SPIRIT_RUNE.item(),
                null, new ItemStack(Material.BLAZE_ROD), null,
                new ItemStack(Material.BONE, 4), null, new ItemStack(Material.BONE, 4)})
                .register(instance);

        new StaffOfTeleportation(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_TP, FnAssemblyStation.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.ENDER_LUMP_3, 2).item(), FNAmpItems.INTELLECT_RUNE.item(), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_3, 2).item(),
                null, new ItemStack(Material.BLAZE_ROD), null,
                null, SlimefunItems.ENDER_RUNE.item(), null})
                .register(instance);

        new StaffOfWebs(FNAmpItems.FN_STAFFS, FNAmpItems.FN_STAFF_COBWEB, FnAssemblyStation.RECIPE_TYPE, new ItemStack[] {
                FNAmpItems.PESTILENCE_RUNE.item(), null,  FNAmpItems.PESTILENCE_RUNE.item(),
                new ItemStack(Material.COBWEB, 2), new ItemStack(Material.BLAZE_ROD),  new ItemStack(Material.COBWEB, 2),
                null, new SlimefunItemStack(SlimefunItems.MAGIC_SUGAR, 5).item(), null})
                .register(instance);
    }
}
