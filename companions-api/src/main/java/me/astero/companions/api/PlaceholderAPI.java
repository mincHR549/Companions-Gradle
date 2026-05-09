package me.astero.companions.api;

import me.astero.companions.CompanionsPlugin;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

/**
 * Stub implementation for compilation.
 * When PlaceholderAPI plugin is installed on the server, the real expansion
 * from PlaceholderAPI takes over this registration.
 */
public class PlaceholderAPI {
    public void register() {
        Plugin papi = CompanionsPlugin.getPlugin(CompanionsPlugin.class)
            .getServer().getPluginManager().getPlugin("PlaceholderAPI");
        if (papi != null) {
            try {
                Class<?> clazz = papi.getClass().getClassLoader().loadClass("me.clip.placeholderapi.expansion.PlaceholderExpansion");
                Object expansion = clazz.getDeclaredConstructor().newInstance();
                clazz.getMethod("register").invoke(expansion);
            } catch (Exception ignored) {}
        }
    }
}
