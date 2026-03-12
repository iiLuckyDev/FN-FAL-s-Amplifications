package ne.fnfal113.fnamplifications.quivers.implementations;

import static ne.fnfal113.fnamplifications.utils.SfCompat.item;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import ne.fnfal113.fnamplifications.items.FNAmpItems;
import ne.fnfal113.fnamplifications.multiblocks.FnAssemblyStation;
import ne.fnfal113.fnamplifications.quivers.Quiver;
import ne.fnfal113.fnamplifications.quivers.SpectralQuiver;
import ne.fnfal113.fnamplifications.quivers.UpgradedQuiver;
import ne.fnfal113.fnamplifications.quivers.UpgradedSpectralQuiver;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RegisterQuiver {

    public static void setup(SlimefunAddon instance){
        new Quiver(FNAmpItems.FN_QUIVERS, FNAmpItems.FN_QUIVER, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.TIN_INGOT, 5), new ItemStack(Material.LEAD, 3), item(SlimefunItems.COPPER_INGOT, 5),
                new ItemStack(Material.STRING, 16), new ItemStack(Material.STICK, 24),  new ItemStack(Material.STRING, 16),
                item(SlimefunItems.TIN_INGOT, 5), new ItemStack(Material.LEATHER, 16), item(SlimefunItems.COPPER_INGOT, 5)},
                192)
                .register(instance);

        new SpectralQuiver(FNAmpItems.FN_QUIVERS, FNAmpItems.FN_SPECTRAL_QUIVER, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.GOLD_4K, 3), new ItemStack(Material.LEAD, 3), item(SlimefunItems.STEEL_INGOT, 3),
                new ItemStack(Material.STRING, 24), new ItemStack(Material.STICK, 24),  new ItemStack(Material.STRING, 24),
                item(SlimefunItems.GOLD_4K, 3), new ItemStack(Material.LEATHER, 16), item(SlimefunItems.STEEL_INGOT, 3)},
                192)
                .register(instance);

        new UpgradedQuiver(FNAmpItems.FN_QUIVERS, FNAmpItems.FN_UPGRADED_QUIVER, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.LEAD_INGOT, 5), item(FNAmpItems.FN_QUIVER), item(SlimefunItems.BRONZE_INGOT, 5),
                new ItemStack(Material.STRING, 32), new ItemStack(Material.STICK, 48),  new ItemStack(Material.STRING, 32),
                item(SlimefunItems.LEAD_INGOT, 5), new ItemStack(Material.LEATHER, 32), item(SlimefunItems.BRONZE_INGOT, 5)},
                288)
                .register(instance);

        new UpgradedSpectralQuiver(FNAmpItems.FN_QUIVERS, FNAmpItems.FN_UPGRADED_SPECTRAL_QUIVER, FnAssemblyStation.RECIPE_TYPE, new ItemStack[]{
                item(SlimefunItems.GOLD_10K, 3), item(FNAmpItems.FN_SPECTRAL_QUIVER), item(SlimefunItems.DAMASCUS_STEEL_INGOT, 3),
                new ItemStack(Material.STRING, 48), new ItemStack(Material.STICK, 36),  new ItemStack(Material.STRING, 48),
                item(SlimefunItems.GOLD_10K, 3), new ItemStack(Material.LEATHER, 24), item(SlimefunItems.DAMASCUS_STEEL_INGOT, 3)},
                288)
                .register(instance);
    }
}
