package eu.mikroskeem.toweldisguise.api.flagwatcher;

import org.bukkit.inventory.ItemStack;


/**
 * {@link org.bukkit.entity.Minecart} watcher
 *
 * @author Mark Vainomaa
 */
public interface MinecartWatcher extends EntityWatcher {
    int getBlockYOffset();
    void setBlockYOffset(int displayBlockOffset);

    boolean isBlockVisible();
    void setBlockVisible(boolean visible);

    ItemStack getBlockInCart();
    void setBlockInCart(ItemStack blockInCart);
}
