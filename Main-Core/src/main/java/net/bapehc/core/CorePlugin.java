package net.bapehc.core;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class CorePlugin extends JavaPlugin {

    public void onEnable() {
        registerCommands();
        registerListener();

    }

    private void registerListener() {
        PluginManager pm = Bukkit.getPluginManager();
    }

    private void registerCommands() {
    }

    public void onDisable() {
    }
}
