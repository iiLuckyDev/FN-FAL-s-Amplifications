package ne.fnfal113.fnamplifications.mysteriousitems.implementation;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import ne.fnfal113.fnamplifications.items.FNAmpItems;
import ne.fnfal113.fnamplifications.multiblocks.FnMysteryStickAltar;
import ne.fnfal113.fnamplifications.mysteriousitems.*;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RegisterSticks {

    public static void setup(SlimefunAddon instance) {
        new MysteryStick(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 8).item(), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1, 6).item(), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1, 8).item(),
                SlimefunItems.BLANK_RUNE.item(), new ItemStack(Material.STICK), SlimefunItems.BLANK_RUNE.item(),
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 8).item(), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 6).item(), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1, 8).item()},
                Material.DIAMOND_SWORD)
                .register(instance);

        new MysteryStick2(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK_2, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 8).item(), new ItemStack(Material.LEATHER), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1, 8).item(),
                SlimefunItems.BLANK_RUNE.item(), new ItemStack(Material.STICK), SlimefunItems.BLANK_RUNE.item(),
                new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1, 8).item(), new ItemStack(Material.OAK_WOOD, 2), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 8).item()},
                Material.DIAMOND_AXE)
                .register(instance);

        new MysteryStick3(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK_3, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).item(), new ItemStack(Material.LEATHER), new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).item(),
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2, 8).item(), new ItemStack(Material.STICK), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2, 8).item(),
                new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1, 6).item(), new ItemStack(Material.LEAD), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1, 6).item()},
                Material.BOW)
                .register(instance);

        new MysteryStick4(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK_4, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1).item(), new SlimefunItemStack(SlimefunItems.EARTH_RUNE, 1).item(), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_3, 16).item(),
                new SlimefunItemStack(SlimefunItems.FIRE_RUNE, 1).item(), FNAmpItems.FN_STICK.item(), new SlimefunItemStack(SlimefunItems.AIR_RUNE, 1).item(),
                new SlimefunItemStack(SlimefunItems.ENDER_LUMP_3, 16).item(), new SlimefunItemStack(SlimefunItems.ENDER_RUNE, 1).item(), new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1).item()},
                Material.DIAMOND_SWORD)
                .register(instance);

        new MysteryStick5(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK_5, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 18).item(), new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1).item(), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2, 18).item(),
                new SlimefunItemStack(SlimefunItems.AIR_RUNE, 2).item(), FNAmpItems.FN_STICK_2.item(), new SlimefunItemStack(SlimefunItems.FIRE_RUNE, 2).item(),
                new SlimefunItemStack(SlimefunItems.ENDER_LUMP_3, 12).item(), new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).item(), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2, 12).item()},
                Material.DIAMOND_AXE)
                .register(instance);

        new MysteryStick6(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK_6, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1).item(), new SlimefunItemStack(SlimefunItems.AIR_RUNE, 2).item(), new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1).item(),
                new SlimefunItemStack(SlimefunItems.FIRE_RUNE, 1).item(), FNAmpItems.FN_STICK_3.item(), new SlimefunItemStack(SlimefunItems.EARTH_RUNE, 1).item(),
                new SlimefunItemStack(SlimefunItems.ENDER_LUMP_3, 18).item(), new SlimefunItemStack(SlimefunItems.ENDER_RUNE, 2).item(), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 18).item()},
                Material.BOW)
                .register(instance);

        new MysteryStick7(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK_7, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 2).item(), new SlimefunItemStack(SlimefunItems.EARTH_RUNE, 2).item(),  new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 2).item(),
                new SlimefunItemStack(SlimefunItems.FIRE_RUNE, 3).item(), FNAmpItems.FN_STICK_4.item(), new SlimefunItemStack(SlimefunItems.AIR_RUNE, 3).item(),
                new SlimefunItemStack(SlimefunItems.LIGHTNING_RUNE, 3).item(), new SlimefunItemStack(SlimefunItems.ENDER_RUNE, 2).item(), new SlimefunItemStack(SlimefunItems.ENCHANTMENT_RUNE, 3).item()},
                Material.DIAMOND_SWORD)
                .register(instance);

        new MysteryStick8(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK_8, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.ENDER_RUNE, 3).item(), new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1).item(), new SlimefunItemStack(SlimefunItems.FIRE_RUNE, 3).item(),
                new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1).item(), FNAmpItems.FN_STICK_5.item(), new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1).item(),
                new SlimefunItemStack(SlimefunItems.EARTH_RUNE, 3).item(), new SlimefunItemStack(SlimefunItems.AIR_RUNE, 2).item(), new SlimefunItemStack(SlimefunItems.AIR_RUNE, 3).item()},
                Material.DIAMOND_AXE)
                .register(instance);

        new MysteryStick9(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK_9, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1).item(), new SlimefunItemStack(SlimefunItems.AIR_RUNE, 3).item(), new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1).item(),
                new SlimefunItemStack(SlimefunItems.FIRE_RUNE, 2).item(), FNAmpItems.FN_STICK_6.item(), new SlimefunItemStack(SlimefunItems.EARTH_RUNE, 2).item(),
                new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1).item(), new SlimefunItemStack(SlimefunItems.ENDER_RUNE, 3).item(), new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1).item()},
                Material.BOW)
                .register(instance);

        new MysteryStick10(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK_10, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[] {
                new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 2).item(), FNAmpItems.FN_STICK_4.item(), new SlimefunItemStack(SlimefunItems.ENCHANTMENT_RUNE, 3).item(),
                new SlimefunItemStack(SlimefunItems.FIRE_RUNE, 3).item(), FNAmpItems.FN_STICK_7.item(), new SlimefunItemStack(SlimefunItems.AIR_RUNE, 3).item(),
                new SlimefunItemStack(SlimefunItems.LIGHTNING_RUNE, 3).item(), FNAmpItems.FN_STICK.item(), new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 2).item()},
                Material.DIAMOND_SWORD)
                .register(instance);

        new MysteryStick11(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK_11, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[] {
                FNAmpItems.FN_STICK_2.item(), new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1).item(), FNAmpItems.FN_STICK_8.item(),
                new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1).item(), FNAmpItems.FN_STICK_5.item(), new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1).item(),
                new SlimefunItemStack(SlimefunItems.EARTH_RUNE, 4).item(), new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 2).item(), new SlimefunItemStack(SlimefunItems.AIR_RUNE, 4).item()},
                Material.DIAMOND_AXE)
                .register(instance);
    }
}
