package net.bapehc.core;

import core.cmd.ItemshopCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class JavaCore extends JavaPlugin {

    @Override
    public void onEnable() {
<<<<<<< HEAD:Piechuuu-Core/src/main/java/core/JavaCore.java
        registerCommand();
        registerListeners();
=======

>>>>>>> f72e6fabd8c8bd8a0e30a199a0b1b72f18a0cbd2:Piechuuu-Core/src/main/java/net/bapehc/core/JavaCore.java

    }

    private void registerCommand() {
        getCommand("is").setExecutor(new ItemshopCommand());
    }

    private void registerListeners() {
        PluginManager pm = Bukkit.getPluginManager();
    }

    @Override
    public void onDisable() {
    }
}
