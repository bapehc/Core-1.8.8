package net.bapehc.core.cmd;

import net.bapehc.core.utils.ChatUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Sprawdzanie implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!sender.hasPermission("sprawdzanie.core")) {
            sender.sendMessage(ChatUtil.fixColor("&cNie masz uprawnien !"));
            return true;
        }
        if(cmd.getName().equalsIgnoreCase("sprawdzanie")) {
            Player p = (Player)sender;

        }
        return false;
    }
}
