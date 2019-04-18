package net.bapehc.core.cmd;

import net.bapehc.core.utils.ChatUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Svip implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("svip")) {
            sender.sendMessage(ChatUtil.fixColor("&7&l----------( &a&lS&6&lVIP &7&l)----------"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &aMozliwosci svipa:"));
            sender.sendMessage(ChatUtil.fixColor(""));
            sender.sendMessage(ChatUtil.fixColor("&8>> &e/kit svip/yt/vip/gracz "));
            sender.sendMessage(ChatUtil.fixColor("&8>> &e/enderchest"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &e/efekty"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &e50% itemow na gildie !"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &eZwiekszony drop !"));
            sender.sendMessage(ChatUtil.fixColor(""));
            sender.sendMessage(ChatUtil.fixColor("&8>> &7Cena: &c999999zl"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &7Na ile: &c999999"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &7Shop: &cwww.bapehc.pl"));
            sender.sendMessage(ChatUtil.fixColor("&7&l----------( &a&lS&6&lVIP &7&l)----------"));
        }
        return false;
    }
}
