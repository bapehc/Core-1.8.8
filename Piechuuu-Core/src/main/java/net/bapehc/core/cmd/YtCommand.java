package net.bapehc.core.cmd;

import net.bapehc.core.utils.ChatUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class YtCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("YtCommand")) {
            sender.sendMessage(ChatUtil.fixColor("&7&l----------( &4&lY&f&lT &7&l)----------"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &aMozliwosci YtCommand:"));
            sender.sendMessage(ChatUtil.fixColor(""));
            sender.sendMessage(ChatUtil.fixColor("&8>> &e/kit YtCommand/vip/svip/gracz "));
            sender.sendMessage(ChatUtil.fixColor("&8>> &e/enderchest"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &e/efekty"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &e50% itemow na gildie !"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &eZwiekszony drop !"));
            sender.sendMessage(ChatUtil.fixColor(""));
            sender.sendMessage(ChatUtil.fixColor("&8>> &7150 subow"));
            sender.sendMessage(ChatUtil.fixColor("&7&l----------( &4&lY&f&lT &7&l)----------"));
        }
        return false;
    }
}
