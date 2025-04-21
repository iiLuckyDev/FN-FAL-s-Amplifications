package ne.fnfal113.fnamplifications.gears.abstracts;

import com.google.gson.JsonObject;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import ne.fnfal113.fnamplifications.FNAmplifications;
import ne.fnfal113.fnamplifications.config.ConfigManager;
import ne.fnfal113.fnamplifications.gears.implementation.GearTask;
import ne.fnfal113.fnamplifications.utils.Utils;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.UUID;

public abstract class AbstractGears extends SlimefunItem {

    private final NamespacedKey currentXpValueKey;

    private final NamespacedKey currentArmorLevelKey;

    private final NamespacedKey nextLevelXpValueKey;

    private final int startingProgress;

    private final int incrementingProgress;

    private final int maxLevel;

    private final int maxAttributes;

    private final EquipmentSlot equipmentSlot;

    private final GearTask gearTask;

    private final ConfigManager configManager = FNAmplifications.getConfigManager();

    public AbstractGears(ItemGroup itemGroup, SlimefunItemStack sfItemStack, RecipeType recipeType, ItemStack[] recipe,
        NamespacedKey currentXpValueKey, NamespacedKey currentArmorlevelKey, NamespacedKey nextLevelXpValueKey,
        int startingProgress, int incrementingProgress, int maxLevel, int maxAttributes, EquipmentSlot equipmentSlot) 
    {
        super(itemGroup, sfItemStack, recipeType, recipe);

        initializeSettings(maxLevel, maxAttributes);

        this.currentXpValueKey = currentXpValueKey;
        this.currentArmorLevelKey = currentArmorlevelKey;
        this.nextLevelXpValueKey = nextLevelXpValueKey;
        this.startingProgress = startingProgress;
        this.incrementingProgress = incrementingProgress;
        this.maxLevel = getConfigManager().getCustomConfig("fn-gear-level-settings").getInt(this.getId() + "." + "max-level");
        this.maxAttributes = getConfigManager().getCustomConfig("fn-gear-level-settings").getInt(this.getId() + "." + "max-attributes");
        this.equipmentSlot = equipmentSlot;
        this.gearTask = new GearTask(
            currentXpValueKey, 
            currentArmorlevelKey, 
            nextLevelXpValueKey, 
            (ItemStack) Utils.getField(SlimefunItem.class, "itemStackTemplate", this),  
            startingProgress, 
            incrementingProgress, 
            maxLevel
        );
    
    }

    public void initializeSettings(int maxLevel, int maxAttributes) {
        try {
            getConfigManager().initializeConfig(this.getId(), "unbreakable", false, "fn-gear-unbreakable-settings");
            getConfigManager().initializeConfig(this.getId(), "max-level", maxLevel, "fn-gear-level-settings");
            getConfigManager().initializeConfig(this.getId(), "max-attributes", maxAttributes, "fn-gear-level-settings");

            int configMaxLevel = getConfigManager().getCustomConfig("fn-gear-level-settings").getInt(this.getId() + "." + "max-level");
            int configMaxAttributes = getConfigManager().getCustomConfig("fn-gear-level-settings").getInt(this.getId() + "." + "max-attributes");

            JsonObject jsonObject = getConfigManager().loadJson(this.getId().toLowerCase() + "_default_ench");

            for (int i = 1; i <= Math.max(configMaxLevel, maxLevel); i++) {
                String levelSection = this.getId() + "." + "level-" + i;

                initializeEnchants(levelSection, i, jsonObject);

                if(i % 5 == 0){
                    initializeAttributes(levelSection, Math.max(configMaxAttributes, maxAttributes), i, jsonObject);
                }
            }

            setUnbreakable();
        } catch (NullPointerException | IllegalArgumentException e) {
            FNAmplifications.getInstance()
                .getLogger()
                .info("An error has occurred upon initializing FN Gear config settings! Please report on github with error logs!");
            
            
            e.printStackTrace();
        }
    }

    public void initializeEnchants(String levelSection, int i, JsonObject jsonObject) {
        try{
            String settingEnchant = "enchantment-name";
            String settingEnchantLevel = "enchantment-level";

            // initialize default enchant and levels under the default max level from the json resource stream
            if(jsonObject.has("level-" + i) && jsonObject.getAsJsonObject("level-" + i).has(settingEnchant)
                    && jsonObject.getAsJsonObject("level-" + i).has(settingEnchantLevel)) {
                getConfigManager().initializeConfig(
                    levelSection, 
                    settingEnchant, 
                    jsonObject.getAsJsonObject("level-" + i).get(settingEnchant).getAsString(), 
                    "fn-gear-level-settings"
                );
                
                getConfigManager().initializeConfig(
                    levelSection, 
                    settingEnchantLevel, 
                    jsonObject.getAsJsonObject("level-" + i).get(settingEnchantLevel).getAsInt(), 
                    "fn-gear-level-settings"
                );
            }

        } catch (NullPointerException | IllegalArgumentException e) {
            FNAmplifications.getInstance()
                .getLogger()
                .info("An error has occurred upon initializing FN Gear enchants setting! Please report on github with errors logs!");
            
            e.printStackTrace();
        }
    }

    public void initializeAttributes(String levelSection, int maxAttributes, int i, JsonObject jsonObject) {
        try {
            for (int x = 1; x <= maxAttributes; x++) {
                String attributeSection = levelSection + "." + "bonus-attributes" + "." + "attribute-" + x;
                String settingAttribute = "attribute-name";
                String settingAttributeValue = "attribute-value";

                // initialize default attribute and values from parsed json resource stream under the default max level
                if (jsonObject.has("level-" + i) && jsonObject.getAsJsonObject("level-" + i).has("attributes")
                        && jsonObject.getAsJsonObject("level-" + i).getAsJsonObject("attributes").has("attribute-" + x)) {
                    getConfigManager().initializeConfig(
                        attributeSection, 
                        settingAttribute, 
                        jsonObject.getAsJsonObject("level-" + i)
                            .getAsJsonObject("attributes")
                            .get("attribute-" + x)
                            .getAsJsonObject()
                            .get(settingAttribute)
                            .getAsString(), 
                        "fn-gear-level-settings"
                    );

                    getConfigManager().initializeConfig(
                        attributeSection, 
                        settingAttributeValue, 
                        jsonObject.getAsJsonObject("level-" + i)
                            .getAsJsonObject("attributes")
                            .get("attribute-" + x)
                            .getAsJsonObject()
                            .get(settingAttributeValue)
                            .getAsDouble(), 
                        "fn-gear-level-settings"
                    );
                }
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            FNAmplifications.getInstance()
                .getLogger()
                .info("An error has occurred upon initializing gear bonus attributes setting! Please report on github with logs!");
            
            e.printStackTrace();
        }
    }

    public void initializePdc() {

    }

    public final void setUnbreakable() {
        ItemMeta meta = ((ItemStack) Utils.getField(SlimefunItem.class, "itemStackTemplate", this)).getItemMeta();
        
        meta.setUnbreakable(
            getConfigManager()
                .getCustomConfig("fn-gear-unbreakable-settings")
                .getBoolean(this.getId() + "." + "unbreakable")
        );

        this.getItem().setItemMeta(meta);
    }

    public void onHit(EntityDamageByEntityEvent event, ItemStack armour) {
        if (! (event.getEntity() instanceof Player)) {
            return;
        }

        Player p = ((Player) event.getEntity()).getPlayer();

        if (p == null) {
            return;
        }

        if (gearTask.onHit(event, p, armour)) {
            upgradeArmor(armour, armour.getItemMeta().getPersistentDataContainer().getOrDefault(getCurrentArmorLevelKey(), PersistentDataType.INTEGER, 0), p, getEquipmentSlot());
        }
    }

    /**
     * When the armor levels up, add or upgrade any enchants/attributes
     * @param armor the armor that leveled up
     * @param armorLevel the new level of the armor
     * @param p the player who wore the armor
     */
    public void upgradeArmor(ItemStack armor, int armorLevel, Player p, EquipmentSlot slot) {
        ItemMeta meta = armor.getItemMeta();
        String levelSection = this.getId() + "." + "level-" + armorLevel;
        String enchant = getConfigManager().getCustomConfig("fn-gear-level-settings").getString(levelSection + "." + "enchantment-name");
        int enchantLevel = getConfigManager().getCustomConfig("fn-gear-level-settings").getInt(levelSection + "." + "enchantment-level");

        // add armor enchant
        try {
            if (enchant != null && enchantLevel != 0) {
                if(EnchantmentWrapper.getByKey(NamespacedKey.minecraft(enchant)) != null) {
                    meta.addEnchant(EnchantmentWrapper.getByKey(NamespacedKey.minecraft(enchant)), enchantLevel, true);
                }
            }
        } catch (NullPointerException | IllegalArgumentException e) {
            p.sendMessage(Utils.colorTranslator("&cAn error has occurred upon adding new armor enchants, please ask the admin to check the console for errors and report it on github"));
            
            e.printStackTrace();
        }

        // add bonus attribute
        if (armorLevel % 5 == 0) {
            try {
                for (int i = 1; i <= getMaxAttributes(); i++) {
                    String attribute = getConfigManager().getCustomConfig("fn-gear-level-settings").getString(levelSection + "." + "bonus-attributes" + "." + "attribute-" + i + "." + "attribute-name");
                    double attributeValue = getConfigManager().getCustomConfig("fn-gear-level-settings").getDouble(levelSection + "." + "bonus-attributes" + "." + "attribute-" + i + "." + "attribute-value");

                    if (attribute != null && attributeValue != 0.0) {
                        if(meta.getAttributeModifiers(getEquipmentSlot()).asMap().containsKey(Attribute.valueOf(attribute))) {
                            meta.removeAttributeModifier(Attribute.valueOf(attribute));
                        }

                        meta.addAttributeModifier(
                            Attribute.valueOf(attribute), 
                            new AttributeModifier(
                                UUID.randomUUID(),
                                "generic." + attribute.toLowerCase() + "." + armor.getType().toString().toLowerCase(),
                                attributeValue,
                                AttributeModifier.Operation.ADD_NUMBER, slot
                            )
                        );
                    }

                }

                p.sendMessage(Utils.colorTranslator("&6FN Gear attributes has been upgraded!"));
            } catch (NullPointerException | IllegalArgumentException e) {
                p.sendMessage(Utils.colorTranslator("&cAn error has occurred when adding FN Gear armor attributes. Please configure FN Gear attributes properly."));
                
                e.printStackTrace();
            }

        }

        armor.setItemMeta(meta);
    }

    @Override
    public boolean isEnchantable() {
        return true;
    }

    @Override
    public boolean isDisenchantable() {
        return false;
    }

    @Override
    public boolean isUseableInWorkbench() {
        return false;
    }

    public NamespacedKey getCurrentXpValueKey() {
        return currentXpValueKey;
    }

    public NamespacedKey getCurrentArmorLevelKey() {
        return currentArmorLevelKey;
    }

    public NamespacedKey getNextLevelXpValueKey() {
        return nextLevelXpValueKey;
    }

    public int getStartingProgress() {
        return startingProgress;
    }

    public int getIncrementingProgress() {
        return incrementingProgress;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getMaxAttributes() {
        return maxAttributes;
    }

    public EquipmentSlot getEquipmentSlot() {
        return equipmentSlot;
    }

    public GearTask getGearTask() {
        return gearTask;
    }

    public ConfigManager getConfigManager() {
        return configManager;
    }

}