package ne.fnfal113.fnamplifications.mysteriousitems.implementation;

import static ne.fnfal113.fnamplifications.utils.SfCompat.item;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import ne.fnfal113.fnamplifications.items.FNAmpItems;
import ne.fnfal113.fnamplifications.multiblocks.FnMysteryStickAltar;
import ne.fnfal113.fnamplifications.mysteriousitems.*;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RegisterSticks {

    public static void setup(SlimefunAddon instance) {
        new MysteryStick(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.MAGIC_LUMP_1, 8), item(SlimefunItems.ENDER_LUMP_1, 6), item(SlimefunItems.ENDER_LUMP_1, 8),
                item(SlimefunItems.BLANK_RUNE), new ItemStack(Material.STICK), item(SlimefunItems.BLANK_RUNE),
                item(SlimefunItems.MAGIC_LUMP_1, 8), item(SlimefunItems.MAGIC_LUMP_1, 6), item(SlimefunItems.ENDER_LUMP_1, 8)},
                Material.DIAMOND_SWORD)
                .register(instance);

        new MysteryStick2(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK_2, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.MAGIC_LUMP_1, 8), new ItemStack(Material.LEATHER), item(SlimefunItems.ENDER_LUMP_1, 8),
                item(SlimefunItems.BLANK_RUNE), new ItemStack(Material.STICK), item(SlimefunItems.BLANK_RUNE),
                item(SlimefunItems.ENDER_LUMP_1, 8), new ItemStack(Material.OAK_WOOD, 2), item(SlimefunItems.MAGIC_LUMP_1, 8)},
                Material.DIAMOND_AXE)
                .register(instance);

        new MysteryStick3(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK_3, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.BLANK_RUNE, 1), new ItemStack(Material.LEATHER), item(SlimefunItems.BLANK_RUNE, 1),
                item(SlimefunItems.MAGIC_LUMP_2, 8), new ItemStack(Material.STICK), item(SlimefunItems.MAGIC_LUMP_2, 8),
                item(SlimefunItems.ENDER_LUMP_1, 6), new ItemStack(Material.LEAD), item(SlimefunItems.ENDER_LUMP_1, 6)},
                Material.BOW)
                .register(instance);

        new MysteryStick4(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK_4, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1), item(SlimefunItems.EARTH_RUNE, 1), item(SlimefunItems.ENDER_LUMP_3, 16),
                item(SlimefunItems.FIRE_RUNE, 1), item(FNAmpItems.FN_STICK), item(SlimefunItems.AIR_RUNE, 1),
                item(SlimefunItems.ENDER_LUMP_3, 16), item(SlimefunItems.ENDER_RUNE, 1), item(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1)},
                Material.DIAMOND_SWORD)
                .register(instance);

        new MysteryStick5(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK_5, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.MAGIC_LUMP_3, 18), item(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1), item(SlimefunItems.ENDER_LUMP_2, 18),
                item(SlimefunItems.AIR_RUNE, 2), item(FNAmpItems.FN_STICK_2), item(SlimefunItems.FIRE_RUNE, 2),
                item(SlimefunItems.ENDER_LUMP_3, 12), item(SlimefunItems.BLANK_RUNE, 1), item(SlimefunItems.MAGIC_LUMP_2, 12)},
                Material.DIAMOND_AXE)
                .register(instance);

        new MysteryStick6(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK_6, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1), item(SlimefunItems.AIR_RUNE, 2), item(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1),
                item(SlimefunItems.FIRE_RUNE, 1), item(FNAmpItems.FN_STICK_3), item(SlimefunItems.EARTH_RUNE, 1),
                item(SlimefunItems.ENDER_LUMP_3, 18), item(SlimefunItems.ENDER_RUNE, 2), item(SlimefunItems.MAGIC_LUMP_3, 18)},
                Material.BOW)
                .register(instance);

        new MysteryStick7(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK_7, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.ESSENCE_OF_AFTERLIFE, 2), item(SlimefunItems.EARTH_RUNE, 2),  item(SlimefunItems.ESSENCE_OF_AFTERLIFE, 2),
                item(SlimefunItems.FIRE_RUNE, 3), item(FNAmpItems.FN_STICK_4), item(SlimefunItems.AIR_RUNE, 3),
                item(SlimefunItems.LIGHTNING_RUNE, 3), item(SlimefunItems.ENDER_RUNE, 2), item(SlimefunItems.ENCHANTMENT_RUNE, 3)},
                Material.DIAMOND_SWORD)
                .register(instance);

        new MysteryStick8(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK_8, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.ENDER_RUNE, 3), item(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1), item(SlimefunItems.FIRE_RUNE, 3),
                item(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1), item(FNAmpItems.FN_STICK_5), item(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1),
                item(SlimefunItems.EARTH_RUNE, 3), item(SlimefunItems.AIR_RUNE, 2), item(SlimefunItems.AIR_RUNE, 3)},
                Material.DIAMOND_AXE)
                .register(instance);

        new MysteryStick9(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK_9, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1), item(SlimefunItems.AIR_RUNE, 3), item(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1),
                item(SlimefunItems.FIRE_RUNE, 2), item(FNAmpItems.FN_STICK_6), item(SlimefunItems.EARTH_RUNE, 2),
                item(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1), item(SlimefunItems.ENDER_RUNE, 3), item(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1)},
                Material.BOW)
                .register(instance);

        new MysteryStick10(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK_10, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.ESSENCE_OF_AFTERLIFE, 2), item(FNAmpItems.FN_STICK_4), item(SlimefunItems.ENCHANTMENT_RUNE, 3),
                item(SlimefunItems.FIRE_RUNE, 3), item(FNAmpItems.FN_STICK_7), item(SlimefunItems.AIR_RUNE, 3),
                item(SlimefunItems.LIGHTNING_RUNE, 3), item(FNAmpItems.FN_STICK), item(SlimefunItems.ESSENCE_OF_AFTERLIFE, 2)},
                Material.DIAMOND_SWORD)
                .register(instance);

        new MysteryStick11(FNAmpItems.MYSTERY_STICKS, FNAmpItems.FN_STICK_11, FnMysteryStickAltar.RECIPE_TYPE, new ItemStack[]{
                item(FNAmpItems.FN_STICK_2), item(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1), item(FNAmpItems.FN_STICK_8),
                item(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1), item(FNAmpItems.FN_STICK_5), item(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1),
                item(SlimefunItems.EARTH_RUNE, 4), item(SlimefunItems.ESSENCE_OF_AFTERLIFE, 2), item(SlimefunItems.AIR_RUNE, 4)},
                Material.DIAMOND_AXE)
                .register(instance);
    }
}
