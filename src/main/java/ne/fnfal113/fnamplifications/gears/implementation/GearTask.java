package ne.fnfal113.fnamplifications.gears.implementation;

import com.google.common.base.Strings;

import ne.fnfal113.fnamplifications.utils.WeaponArmorEnum;
import ne.fnfal113.fnamplifications.utils.Utils;

import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GearTask {

    private final NamespacedKey currentXpValueKey;

    private final NamespacedKey currentArmorLevelKey;

    private final NamespacedKey nextLevelXpKey;

    private final int startingProgress;

    private final int incrementProgress;

    private final int maxLevel;

    private final ItemStack itemStack;

    private final List<UUID> uuidList = new ArrayList<>();

    public GearTask(NamespacedKey currentXpValueKey, NamespacedKey currentArmorLevelKey, NamespacedKey nextLevelXpValueKey, 
        ItemStack item, int startingProgress, int incrementProgress, int maxLevel) 
    {
        this.currentXpValueKey = currentXpValueKey;
        this.currentArmorLevelKey = currentArmorLevelKey;
        this.nextLevelXpKey = nextLevelXpValueKey;
        this.itemStack = item;
        this.startingProgress = startingProgress;
        this.incrementProgress = incrementProgress;
        this.maxLevel = maxLevel;
    }

    public String getProgressBar(int current, int max, int totalBars, char symbol, 
        ChatColor completedColor, ChatColor notCompletedColor) 
    {
        // divide the current progress to the max value to get the percent
        float percent = (float) current / max; 
        // multiply the percent value to total progress bars to get current bar amount
        int progressBars = (int) (totalBars * percent); 

        // repeat the progress bar icon with the initial value
        // then get the difference between the initial value and total progress bars to get not completed bars
        return Strings.repeat("" + completedColor + symbol, progressBars)
            + Strings.repeat("" + notCompletedColor + symbol, totalBars - progressBars);
    }

    public boolean onHit(EntityDamageByEntityEvent event, Player p, ItemStack item) {
        ItemMeta meta = item.getItemMeta();
        PersistentDataContainer progress = meta.getPersistentDataContainer();

        int currentXpValue = progress.getOrDefault(getCurrentXpValueKey(), PersistentDataType.INTEGER, 0);
        int currentArmorlevel = progress.getOrDefault(getCurrentArmorLevelKey(), PersistentDataType.INTEGER, 0);
        int nextLevelXpValue = progress.getOrDefault(getNextLevelXpKey(), PersistentDataType.INTEGER, getStartingProgress());
        int currentXpValueIncremented = currentXpValue + 1;

        if (isMaxLevel(currentArmorlevel)) {
            if (! uuidList.contains(p.getUniqueId())) {
                Utils.sendMessage(meta.getDisplayName() + " has reached max level!", p);

                uuidList.add(p.getUniqueId());
            }

            return false;
        }

        progress.set(getCurrentXpValueKey(), PersistentDataType.INTEGER, currentXpValueIncremented);

        List<String> lore = meta.getLore();

        if (currentXpValueIncremented >= 0) {
           updateArmour(currentArmorlevel, currentXpValueIncremented, nextLevelXpValue, item, meta, lore);
        }

        if (currentXpValueIncremented == nextLevelXpValue) {
            return levelUpArmour(currentArmorlevel, currentXpValueIncremented, nextLevelXpValue, item, meta, progress, lore, p);
        }

        return false;
    }

    public void updateArmour(int armorLevel, int currentXpValueIncremented, int nextLevelXpValue, ItemStack item, ItemMeta meta, List<String> lore) {
        lore.set(7, Utils.colorTranslator("&eLevel: ") + armorLevel);
        lore.set(8, Utils.colorTranslator("&eProgress:"));
        lore.set(9, Utils.colorTranslator("&7[&r" + 
            getProgressBar(currentXpValueIncremented, nextLevelXpValue, 10, '■', ChatColor.YELLOW, ChatColor.GRAY) + "&7]")
        );

        if (WeaponArmorEnum.CHESTPLATE.isTagged(getItemStack().getType()) && armorLevel == 30 && currentXpValueIncremented == 1) {
            lore.add(10,"");
            lore.add(11, ChatColor.RED + "◬◬◬◬◬◬| " + ChatColor.LIGHT_PURPLE + ""
                + ChatColor.BOLD + "Effects " + ChatColor.GOLD + "|◬◬◬◬◬◬");
            lore.add(12, ChatColor.GREEN + "Permanent Saturation");
        }

        meta.setLore(lore);
        item.setItemMeta(meta);
    }

    public boolean levelUpArmour(int armorLevel, int currentXpValueIncremented, int nextLevelXpValue, 
        ItemStack item, ItemMeta meta, PersistentDataContainer progress, List<String> lore, Player p) 
    {
        if (isMaxLevel(armorLevel)) {
            Utils.sendMessage(meta.getDisplayName() + " has reached max level!", p);

            return false;
        }

        int currentArmorLevel = armorLevel + 1;

        // reset armor pdc xp to 0
        progress.set(getCurrentXpValueKey(), PersistentDataType.INTEGER, 0);
        // increase armor pdc level by 1
        progress.set(getCurrentArmorLevelKey(), PersistentDataType.INTEGER, currentArmorLevel);
        // increase armor pdc next level xp requirement
        progress.set(getNextLevelXpKey(), PersistentDataType.INTEGER, nextLevelXpValue + getIncrementProgress());

        lore.set(7, Utils.colorTranslator("&eLevel: ") + currentArmorLevel);
        lore.set(8, Utils.colorTranslator("&eProgress:"));
        lore.set(9, Utils.colorTranslator("&7[&r" + 
            getProgressBar(currentXpValueIncremented, nextLevelXpValue, 10, '■', ChatColor.YELLOW, ChatColor.GRAY) + "&7]")
        );

        meta.setLore(lore);
        item.setItemMeta(meta);

        sendLevelUpMessage(p);

        return true;
    }

    public boolean isMaxLevel(int armorLevel) {
        return armorLevel >= getMaxLevel();
    }

    public void sendLevelUpMessage(Player p){
        Utils.sendMessage(getItemStack().getItemMeta().getDisplayName()  + " leveled up!", p);

        p.playSound(p.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1 , 1);
    }

    public NamespacedKey getCurrentXpValueKey() {
        return currentXpValueKey;
    }

    public NamespacedKey getCurrentArmorLevelKey() {
        return currentArmorLevelKey;
    }

    public NamespacedKey getNextLevelXpKey() {
        return nextLevelXpKey;
    }

    public int getStartingProgress() {
        return startingProgress;
    }

    public int getIncrementProgress() {
        return incrementProgress;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

}