package net.bapehc.core.cmd;

import net.bapehc.core.utils.ChatUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Pomoc implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("pomoc")) {
            sender.sendMessage(ChatUtil.fixColor("&7&l----------( &c&lBapeHC &7&l)----------"));
            sender.sendMessage(ChatUtil.fixColor("&8&l>> &e/Itemy &7- Informacje dotyczące itemow do gildi"));
            sender.sendMessage(ChatUtil.fixColor("&8&l>> &e/craftt &7- Wszelkie craftingi np: &5BoyFarmer"));
            sender.sendMessage(ChatUtil.fixColor("&8&l>> &e/drop &7- Informacje o dropie ze stone'a"));
            sender.sendMessage(ChatUtil.fixColor("&8&l>> &e/vip &7- Informacje na temat &6&lVIP"));
            sender.sendMessage(ChatUtil.fixColor("&8&l>> &e/svip &7- Informacje na temat &a&lS&6&lVIP"));
            sender.sendMessage(ChatUtil.fixColor("&8&l>> &e/yt &7- Informacje na temat &4&lY&f&lT"));
            sender.sendMessage(ChatUtil.fixColor("&7&l----------( &c&lBapeHC &7&l)----------"));
        }
        return false;
    }
}
