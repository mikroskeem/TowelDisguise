package eu.mikroskeem.toweldisguise.api.flagwatcher;

import net.kyori.text.TextComponent;


/**
 * Command block {@link org.bukkit.entity.Minecart} watcher
 *
 * @author Mark Vainomaa
 */
public interface MinecartCommandBlockWatcher extends MinecartContainerWatcher {
    String getCommand();
    void setCommand(String command);

    TextComponent getLastOutput();
    void setLastOutput(TextComponent lastOutput);
}
