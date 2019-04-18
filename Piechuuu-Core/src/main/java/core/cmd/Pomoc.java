package core.cmd;

import core.utils.ChatUtil;
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
        if(cmd.getName().equalsIgnoreCase("svip")) {
            sender.sendMessage(ChatUtil.fixColor("&7&l----------( &a&lS&6&lVIP &7&l)----------"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &2eMozliwosci vipa:"));
            sender.sendMessage(ChatUtil.fixColor(""));
            sender.sendMessage(ChatUtil.fixColor("&8>> &6/kit vip "));
            sender.sendMessage(ChatUtil.fixColor("&8>> &6/enderchest"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &6/efekty"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &650% itemow na gildie !"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &6Zwiekszony drop !"));
            sender.sendMessage(ChatUtil.fixColor(""));
            sender.sendMessage(ChatUtil.fixColor("&8>> &cCena: 999999zl"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &cNa ile: 999999"));
            sender.sendMessage(ChatUtil.fixColor("&8>> &cShop: www.bapehc.pl"));
            sender.sendMessage(ChatUtil.fixColor("&7&l----------( &a&lS&6&lVIP &7&l)----------"));
        }
        return false;
    }
}
