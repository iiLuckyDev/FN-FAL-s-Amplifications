package ne.fnfal113.fnamplifications.utils;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.compatibility.VersionedPlayerHead;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class SfCompat {

    private SfCompat() {
    }

    public static ItemStack item(SlimefunItemStack stack) {
        return stack.item().clone();
    }

    public static ItemStack item(SlimefunItemStack stack, int amount) {
        ItemStack item = item(stack);
        item.setAmount(amount);
        return item;
    }

    public static ItemStack custom(Material material, String name, String... lore) {
        return CustomItemStack.create(material, name, lore);
    }

    public static ItemStack custom(ItemStack itemStack, String name, String... lore) {
        return CustomItemStack.create(itemStack, name, lore);
    }

    public static ItemStack custom(ItemStack itemStack, int amount) {
        return CustomItemStack.create(itemStack, amount);
    }

    public static ItemStack head(String hash) {
        return VersionedPlayerHead.getItemStack(hash);
    }
}
