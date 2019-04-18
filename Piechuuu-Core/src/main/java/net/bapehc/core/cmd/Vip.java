package net.bapehc.core.cmd;

import net.bapehc.core.utils.ChatUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Vip implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("vip")) {
            sender.sendMessage(ChatUtil.fixColor("&7&l----------( &6&lVIP &7&l)----------"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &aMozliwosci vipa:"));
            sender.sendMessage(ChatUtil.fixColor(""));
            sender.sendMessage(ChatUtil.fixColor("&8>> &e/kit vip "));
            sender.sendMessage(ChatUtil.fixColor("&8>> &e/enderchest"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &e/efekty"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &e50% itemow na gildie !"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &eZwiekszony drop !"));
            sender.sendMessage(ChatUtil.fixColor(""));
            sender.sendMessage(ChatUtil.fixColor("&8>> &7Cena: 999999zl"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &7Na ile: 999999"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &7Shop: www.bapehc.pl"));
            sender.sendMessage(ChatUtil.fixColor("&7&l----------( &6&lVIP &7&l)----------"));
        }
        return false;
    }
}
