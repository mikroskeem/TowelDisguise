package eu.mikroskeem.toweldisguise.api.flagwatcher;

/**
 * Furnace {@link org.bukkit.entity.Minecart} watcher
 *
 * @author Mark Vainomaa
 */
public interface MinecartFurnaceWatcher extends MinecartWatcher {
    boolean isPowered();
    void setPowered(boolean powered);
}
