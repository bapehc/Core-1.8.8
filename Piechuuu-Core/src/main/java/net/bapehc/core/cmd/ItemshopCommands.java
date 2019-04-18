package net.bapehc.core.cmd;

import net.bapehc.core.utils.ChatUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ItemshopCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!sender.hasPermission("net.bapehc.core.cmd.is")){
            sender.sendMessage(ChatUtil.fixColor(""));
        }
        return false;
    }
}
