package net.bapehc.core;

import org.bukkit.plugin.java.JavaPlugin;

public final class CorePlugin extends JavaPlugin {

    public void onEnable() {
        registerCommands();
        registerListeners();

    }

    private void registerCommands() {
    }

    public void onDisable() {
    }
}
