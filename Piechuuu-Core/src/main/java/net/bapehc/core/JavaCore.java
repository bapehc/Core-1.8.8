package net.bapehc.core;

import net.bapehc.core.cmd.ItemshopCommands;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class JavaCore extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommand();
        registerListeners();

    }

    private void registerCommand() {
        getCommand("is").setExecutor(new ItemshopCommands());
    }

    private void registerListeners() {
        PluginManager pm = Bukkit.getPluginManager();
    }

    @Override
    public void onDisable() {
    }
}
