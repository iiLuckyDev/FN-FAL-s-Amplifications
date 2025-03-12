package ne.fnfal113.fnamplifications.gems.implementation;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.compatibility.VersionedPotionType;
import ne.fnfal113.fnamplifications.FNAmplifications;
import ne.fnfal113.fnamplifications.gems.*;
import ne.fnfal113.fnamplifications.gems.unbinder.BlemishedUnbindGem;
import ne.fnfal113.fnamplifications.gems.unbinder.DamagedUnbindGem;
import ne.fnfal113.fnamplifications.gems.unbinder.FlawlessUnbindGem;
import ne.fnfal113.fnamplifications.gems.unbinder.PreciousUnbindGem;
import ne.fnfal113.fnamplifications.items.FNAmpItems;
import ne.fnfal113.fnamplifications.multiblocks.FnGemAltar;
import ne.fnfal113.fnamplifications.multiblocks.FnGemDowngrader;
import ne.fnfal113.fnamplifications.multiblocks.FnGemUpgrader;
import ne.fnfal113.fnamplifications.utils.PotionBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionType;

public class RegisterGems {

    private static final ItemStack anyUpgradeableGem = CustomItemStack.create(
            Material.EMERALD,
            "&dAny Upgradeable Gem",
            "",
            "&eSame gem type and must",
            "&ebe same level or tier"
    );

    private static final ItemStack anyUpgradedGem = CustomItemStack.create(
            Material.EMERALD,
            "&dAny Upgraded Gem",
            "",
            "&eTier 2 to 4 gem"
    );

    public static void setup(SlimefunAddon instance){
        new ArmorImpairGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_ARMOR_IMPAIR, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                new ItemStack(Material.BLAZE_POWDER), new ItemStack(Material.BLAZE_POWDER), new ItemStack(Material.BLAZE_POWDER),
                FNAmpItems.UNBIND_RUNE.item(), new ItemStack(Material.EMERALD), FNAmpItems.UNBIND_RUNE.item(),
                new ItemStack(Material.BLAZE_POWDER), new ItemStack(Material.BLAZE_POWDER), new ItemStack(Material.BLAZE_POWDER)})
                .register(instance);

        new AxeThrowieGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_AXETHROWIE, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                null, new SlimefunItemStack(SlimefunItems.AIR_RUNE, 1).item(),  null,
                FNAmpItems.POWER_RUNE.item(), new ItemStack(Material.EMERALD), FNAmpItems.POWER_RUNE.item(),
                null, new SlimefunItemStack(SlimefunItems.AIR_RUNE, 1).item(),  null})
                .register(instance);

        new BlindBindGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_BLINDBIND, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                null, FNAmpItems.PESTILENCE_RUNE.item(), null,
                FNAmpItems.LINGER_RUNE.item(), new ItemStack(Material.EMERALD), FNAmpItems.LINGER_RUNE.item(),
                null, FNAmpItems.PESTILENCE_RUNE.item(), null})
                .register(instance);

        new DamnationGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_DAMNATION, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                SlimefunItems.MAGIC_SUGAR.item(), FNAmpItems.INTELLECT_RUNE.item(),  SlimefunItems.MAGIC_SUGAR.item(),
                FNAmpItems.SPIRIT_RUNE.item(), new ItemStack(Material.EMERALD), FNAmpItems.SPIRIT_RUNE.item(),
                SlimefunItems.MAGIC_SUGAR.item(), FNAmpItems.INTELLECT_RUNE.item(),  SlimefunItems.MAGIC_SUGAR.item()})
                .register(instance);

        new HastyGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_HASTY, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.AGILITY_RUNE.item(), new ItemStack(Material.DIAMOND_PICKAXE), FNAmpItems.AGILITY_RUNE.item(),
                null, new ItemStack(Material.EMERALD), null,
                FNAmpItems.AGILITY_RUNE.item(), new ItemStack(Material.DIAMOND_PICKAXE), FNAmpItems.AGILITY_RUNE.item()})
                .register(instance);

        new ImpostorGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_IMPOSTOR, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                null, FNAmpItems.POWER_RUNE.item(), null,
                FNAmpItems.INTELLECT_RUNE.item(), new ItemStack(Material.EMERALD), FNAmpItems.INTELLECT_RUNE.item(),
                null, FNAmpItems.POWER_RUNE.item(), null})
                .register(instance);

        new InfernoGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_INFERNO, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.SPIRAL_FIRE_RUNE.item(), new SlimefunItemStack(SlimefunItems.AIR_RUNE, 1).item(), FNAmpItems.SPIRAL_FIRE_RUNE.item(),
                null, new ItemStack(Material.EMERALD), null,
                FNAmpItems.SPIRAL_FIRE_RUNE.item(), null, FNAmpItems.SPIRAL_FIRE_RUNE.item()})
                .register(instance);

        new PsychokinesisGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_PSYCHOKINESIS, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.INTELLECT_RUNE.item(), new SlimefunItemStack(SlimefunItems.ENDER_RUNE, 1).item(), FNAmpItems.INTELLECT_RUNE.item(),
                new ItemStack(Material.BLAZE_POWDER), new ItemStack(Material.EMERALD), new ItemStack(Material.BLAZE_POWDER),
                FNAmpItems.INTELLECT_RUNE.item(), new ItemStack(Material.ROTTEN_FLESH), FNAmpItems.INTELLECT_RUNE.item()})
                .register(instance);

        new RetaliateGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_RETALIATE, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                null, new SlimefunItemStack(SlimefunItems.AIR_RUNE, 1).item(), null,
                FNAmpItems.INTELLECT_RUNE.item(), new ItemStack(Material.EMERALD), FNAmpItems.INTELLECT_RUNE.item(),
                null, new SlimefunItemStack(SlimefunItems.AIR_RUNE, 1).item(),  null})
                .register(instance);

        new TelepathyGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_TELEPATHY, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.INTELLECT_RUNE.item(), new ItemStack(Material.DIAMOND_PICKAXE), FNAmpItems.INTELLECT_RUNE.item(),
                null, new ItemStack(Material.EMERALD), null,
                FNAmpItems.INTELLECT_RUNE.item(), new ItemStack(Material.IRON_PICKAXE), FNAmpItems.INTELLECT_RUNE.item()})
                .register(instance);

        new ThornAwayGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_THORN_AWAY, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                null, FNAmpItems.INTELLECT_RUNE.item(), null,
                new ItemStack(Material.BLAZE_POWDER, 2), new ItemStack(Material.EMERALD),  new ItemStack(Material.BLAZE_POWDER, 2),
                null, FNAmpItems.POWER_RUNE.item(), null})
                .register(instance);

        new ThunderBoltGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_THUNDER, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.SPARKLING_RUNE.item(), new ItemStack(Material.FIRE_CHARGE), FNAmpItems.SPARKLING_RUNE.item(),
                null, new ItemStack(Material.EMERALD), null,
                FNAmpItems.SPARKLING_RUNE.item(), new ItemStack(Material.BLAZE_POWDER), FNAmpItems.SPARKLING_RUNE.item()})
                .register(instance);

        new TriSwordGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_TRI_SWORD, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                null, FNAmpItems.INTELLECT_RUNE.item(),  null,
                FNAmpItems.POWER_RUNE.item(), new ItemStack(Material.EMERALD), FNAmpItems.POWER_RUNE.item(),
                null, FNAmpItems.INTELLECT_RUNE.item(),  null})
                .register(instance);

        new GuardianGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_GUARDIAN, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                new ItemStack(Material.ROTTEN_FLESH), new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).item(), new ItemStack(Material.ROTTEN_FLESH),
                FNAmpItems.SPIRIT_RUNE.item(), new ItemStack(Material.EMERALD),  FNAmpItems.SPIRIT_RUNE.item(),
                SlimefunItems.MAGIC_SUGAR.item(), new ItemStack(Material.ROTTEN_FLESH),  SlimefunItems.MAGIC_SUGAR.item()})
                .register(instance);

        new DisruptedGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_DISRUPTED, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                null, FNAmpItems.SPIRIT_RUNE.item(), null,
                FNAmpItems.POWER_RUNE.item(), new ItemStack(Material.EMERALD), FNAmpItems.POWER_RUNE.item(),
                null, FNAmpItems.SPIRIT_RUNE.item(), null})
                .register(instance);

        new ArrowAvertGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_ARROW_AVERT, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.CLOUD_RUNE.item(), new ItemStack(Material.BLAZE_POWDER, 1),  FNAmpItems.CLOUD_RUNE.item(),
                null, new ItemStack(Material.EMERALD), null,
                FNAmpItems.CLOUD_RUNE.item(), new ItemStack(Material.BLAZE_POWDER, 1), FNAmpItems.CLOUD_RUNE.item()})
                .register(instance);

        new DeberserkGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_DEBERSERK, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.AGILITY_RUNE.item(), new SlimefunItemStack(SlimefunItems.EARTH_RUNE, 1).item(), FNAmpItems.AGILITY_RUNE.item(),
                SlimefunItems.STEEL_INGOT.item(), new ItemStack(Material.EMERALD), SlimefunItems.STEEL_INGOT.item(),
                new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).item(), null, new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).item()})
                .register(instance);

        new ParryGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_PARRY, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).item(), new SlimefunItemStack(SlimefunItems.EARTH_RUNE, 1).item(), new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).item(),
                SlimefunItems.DURALUMIN_INGOT.item(), new ItemStack(Material.EMERALD), SlimefunItems.DURALUMIN_INGOT.item(),
                FNAmpItems.AGILITY_RUNE.item(), new SlimefunItemStack(SlimefunItems.AIR_RUNE, 2).item(), FNAmpItems.AGILITY_RUNE.item()})
                .register(instance);

        new StoutGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_STOUT, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.POWER_RUNE.item(), null, FNAmpItems.HEART_RUNE.item(),
                null, new ItemStack(Material.EMERALD), null,
                FNAmpItems.INTELLECT_RUNE.item(), SlimefunItems.MAGIC_SUGAR.item(), FNAmpItems.HEART_RUNE.item()})
                .register(instance);

        new AdamantineGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_ADAMANTINE, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.POWER_RUNE.item(), new ItemStack(Material.BLAZE_POWDER, 2), FNAmpItems.POWER_RUNE.item(),
                null, new ItemStack(Material.EMERALD), null,
                FNAmpItems.AGILITY_RUNE.item(), new ItemStack(Material.BLAZE_POWDER, 2), FNAmpItems.AGILITY_RUNE.item()})
                .register(instance);

        new AwakenGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_AWAKEN, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.HEART_RUNE.item(), new ItemStack(Material.BLAZE_POWDER), FNAmpItems.HEART_RUNE.item(),
                null, new ItemStack(Material.EMERALD), null,
                FNAmpItems.HEART_RUNE.item(), SlimefunItems.MAGIC_SUGAR.item(), FNAmpItems.HEART_RUNE.item()})
                .register(instance);

        new AvengeGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_AVENGE, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.PESTILENCE_RUNE.item(), new ItemStack(Material.ROTTEN_FLESH), FNAmpItems.PESTILENCE_RUNE.item(),
                null, new ItemStack(Material.EMERALD), null,
                FNAmpItems.LINGER_RUNE.item(), new ItemStack(Material.ROTTEN_FLESH), FNAmpItems.LINGER_RUNE.item()})
                .register(instance);

        new AchillesHeelGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_ACHILLES_HEEL, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.AGILITY_RUNE.item(), new ItemStack(Material.FEATHER), FNAmpItems.AGILITY_RUNE.item(),
                new ItemStack(Material.ARROW), new ItemStack(Material.EMERALD), new ItemStack(Material.ARROW),
                FNAmpItems.PESTILENCE_RUNE.item(), null, FNAmpItems.INTELLECT_RUNE.item()})
                .register(instance);

        new DisarmorGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_DISARMOR, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.INTELLECT_RUNE.item(), null, FNAmpItems.LINGER_RUNE.item(),
                new ItemStack(Material.BLAZE_POWDER), new ItemStack(Material.EMERALD), new ItemStack(Material.BLAZE_POWDER),
                FNAmpItems.LINGER_RUNE.item(), null, FNAmpItems.INTELLECT_RUNE.item()})
                .register(instance);

        new DisarmGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_DISARM, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.INTELLECT_RUNE.item(), SlimefunItems.MAGIC_SUGAR.item(), FNAmpItems.PESTILENCE_RUNE.item(),
                new ItemStack(Material.BLAZE_POWDER, 2), new ItemStack(Material.EMERALD), new ItemStack(Material.BLAZE_POWDER, 2),
                FNAmpItems.PESTILENCE_RUNE.item(), new ItemStack(Material.BLAZE_POWDER), FNAmpItems.INTELLECT_RUNE.item()})
                .register(instance);

        new SmokeCriminalGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_SMOKE_CRIMINAL, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.SPIRIT_RUNE.item(), null, FNAmpItems.CLOUD_RUNE.item(),
                new ItemStack(Material.ROTTEN_FLESH, 1), new ItemStack(Material.EMERALD), new ItemStack(Material.BLAZE_POWDER, 1),
                FNAmpItems.CLOUD_RUNE.item(), null, FNAmpItems.POWER_RUNE.item()})
                .register(instance);

        new LifestealGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_LIFESTEAL, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.HEART_RUNE.item(), SlimefunItems.MAGIC_SUGAR.item(), new ItemStack(Material.BLAZE_POWDER),
                new ItemStack(Material.BLAZE_POWDER, 1), new ItemStack(Material.EMERALD), new ItemStack(Material.BLAZE_POWDER, 1),
                new ItemStack(Material.BLAZE_POWDER), null, FNAmpItems.HEART_RUNE.item()})
                .register(instance);

        new AtrohpyGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_ATROPHY, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.LINGER_RUNE.item(), FNAmpItems.PESTILENCE_RUNE.item(), FNAmpItems.LINGER_RUNE.item(),
                new PotionBuilder(PotionType.WEAKNESS).createPotion(), new ItemStack(Material.EMERALD), new PotionBuilder(PotionType.POISON).createPotion(),
                new ItemStack(Material.BLAZE_POWDER), FNAmpItems.HEART_RUNE.item(), new ItemStack(Material.BLAZE_POWDER)})
                .register(instance);

        new BaneGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_BANE, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.LINGER_RUNE.item(), new ItemStack(Material.BLAZE_POWDER), FNAmpItems.LINGER_RUNE.item(),
                new PotionBuilder(PotionType.POISON).createPotion(), new ItemStack(Material.EMERALD), new PotionBuilder(PotionType.POISON).createPotion(),
                FNAmpItems.PESTILENCE_RUNE.item(), new ItemStack(Material.BLAZE_POWDER), FNAmpItems.PESTILENCE_RUNE.item()})
                .register(instance);

        new SedateGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_SEDATE, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.LINGER_RUNE.item(), new ItemStack(Material.BLAZE_POWDER), FNAmpItems.LINGER_RUNE.item(),
                new PotionBuilder(PotionType.SLOWNESS).createPotion(), new ItemStack(Material.EMERALD), new PotionBuilder(PotionType.SLOWNESS).createPotion(),
                new ItemStack(Material.BLAZE_POWDER), FNAmpItems.AGILITY_RUNE.item(), new ItemStack(Material.BLAZE_POWDER)})
                .register(instance);

        new DecrepitGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_DECREPIT, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.LINGER_RUNE.item(), new ItemStack(Material.BLAZE_POWDER), FNAmpItems.LINGER_RUNE.item(),
                new PotionBuilder(PotionType.WEAKNESS).createPotion(), new ItemStack(Material.EMERALD), new PotionBuilder(PotionType.WEAKNESS).createPotion(),
                new ItemStack(Material.BLAZE_POWDER), null, new ItemStack(Material.BLAZE_POWDER)})
                .register(instance);

        new DeceptionGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_DECEPTION, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                new ItemStack(Material.BLAZE_POWDER), FNAmpItems.SPIRIT_RUNE.item(), new ItemStack(Material.BLAZE_POWDER),
                new PotionBuilder(PotionType.AWKWARD).createPotion(), new ItemStack(Material.EMERALD), new PotionBuilder(PotionType.AWKWARD).createPotion(),
                FNAmpItems.PESTILENCE_RUNE.item(), new ItemStack(Material.BLAZE_POWDER), FNAmpItems.PESTILENCE_RUNE.item()})
                .register(instance);

        new CelerityGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_CELERITY, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.AGILITY_RUNE.item(), null, FNAmpItems.AGILITY_RUNE.item(),
                new PotionBuilder(VersionedPotionType.SWIFTNESS).createPotion(), new ItemStack(Material.EMERALD), new PotionBuilder(VersionedPotionType.SWIFTNESS).createPotion(),
                null, FNAmpItems.POWER_RUNE.item(), null})
                .register(instance);

                
        if(FNAmplifications.getVaultIntegration().isVaultInstalled()){
            new LootGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_LOOT, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                    FNAmpItems.PESTILENCE_RUNE.item(), FNAmpItems.AGILITY_RUNE.item(), FNAmpItems.LINGER_RUNE.item(),
                    null, new ItemStack(Material.EMERALD), null,
                    FNAmpItems.LINGER_RUNE.item(), FNAmpItems.CLOUD_RUNE.item(), FNAmpItems.PESTILENCE_RUNE.item()})
                    .register(instance);
        }

        new ShockwaveGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_SHOCKWAVE, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.POWER_RUNE.item(), new ItemStack(Material.NETHER_WART), FNAmpItems.POWER_RUNE.item(),
                null, new ItemStack(Material.EMERALD), null,
                FNAmpItems.POWER_RUNE.item(), new ItemStack(Material.NETHER_WART), FNAmpItems.POWER_RUNE.item()})
                .register(instance);

        new BerserkGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_BERSERK, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.POWER_RUNE.item(), SlimefunItems.REINFORCED_ALLOY_INGOT.item(), FNAmpItems.POWER_RUNE.item(),
                null, new ItemStack(Material.EMERALD), null,
                new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 2).item(), SlimefunItems.REINFORCED_ALLOY_INGOT.item(), new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 2).item()})
                .register(instance);

        new FlawlessUnbindGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_FLAWLESS_UNBIND, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 5).item(), FNAmpItems.UNBIND_RUNE.item(), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_3, 5).item(),
                FNAmpItems.UNBIND_RUNE.item(), new ItemStack(Material.DIAMOND), FNAmpItems.UNBIND_RUNE.item(),
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 5).item(), FNAmpItems.UNBIND_RUNE.item(), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_3, 5).item()})
                .register(instance);

        new PreciousUnbindGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_PRECIOUS_UNBIND, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2, 4).item(), FNAmpItems.UNBIND_RUNE.item(), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2, 4).item(),
                new ItemStack(Material.SUGAR, 4), new ItemStack(Material.DIAMOND), new ItemStack(Material.SUGAR, 4),
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_3, 4).item(), FNAmpItems.UNBIND_RUNE.item(), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_3, 4).item()})
                .register(instance);

        new BlemishedUnbindGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_BLEMISHED_UNBIND, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 3).item(), FNAmpItems.UNBIND_RUNE.item(), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1, 3).item(),
                null, new ItemStack(Material.DIAMOND), null,
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2, 3).item(), FNAmpItems.UNBIND_RUNE.item(), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2, 3).item()})
                .register(instance);

        new DamagedUnbindGem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_DAMAGED_UNBIND, FnGemAltar.RECIPE_TYPE, new ItemStack[]{
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 2).item(), null, new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1, 2).item(),
                null, new ItemStack(Material.DIAMOND), null,
                new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1, 2).item(), FNAmpItems.UNBIND_RUNE.item(), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1, 2).item()})
                .register(instance);

        new SlimefunItem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_UPGRADES_DISPLAY_ITEM, FnGemUpgrader.RECIPE_TYPE, new ItemStack[]{
                    anyUpgradeableGem.clone(), null, anyUpgradeableGem.clone(),
                    null, FNAmpItems.FN_GEM_FINE_JASPER_CRAFTING.item(), null,
                    anyUpgradeableGem.clone(), null, anyUpgradeableGem.clone()})
                .register(instance);

        new SlimefunItem(FNAmpItems.FN_GEMS, FNAmpItems.FN_GEM_DOWNGRADES_DISPLAY_ITEM, FnGemDowngrader.RECIPE_TYPE, new ItemStack[]{
                FNAmpItems.FN_GEM_FINE_JASPER_CRAFTING.item(), null, FNAmpItems.FN_GEM_FINE_JASPER_CRAFTING.item(),
                null, anyUpgradedGem.clone(), null,
                FNAmpItems.FN_GEM_FINE_JASPER_CRAFTING.item(), null, FNAmpItems.FN_GEM_FINE_JASPER_CRAFTING.item()})
                .register(instance);

    }
}
