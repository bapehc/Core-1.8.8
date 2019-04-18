package net.bapehc.core.cmd;

import net.bapehc.core.utils.ChatUtil;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player cel = Bukkit.getPlayerExact(args[0]);
        Player p = (Player) sender;
        if (!(sender instanceof Player)) {
            sender.sendMessage("Ta komenda nie jest od poziomu konsolii");
            return false;
        }
        if (!sender.hasPermission("core.cmd.fly")) {
            sender.sendMessage(ChatUtil.fixColor("&4Blad: &cNie masz dostepu do &7(core.cmd.fly)"));
            return false;
        }
        if (args.length == 0) {
            if (!p.getAllowFlight() == true) ;
            p.setAllowFlight(false);
            p.sendMessage(ChatUtil.fixColor("&4&lFLY: &cPomyslnie wylaczono latanie"));
            return true;
        } else {
            p.setAllowFlight(true);
            p.sendMessage(ChatUtil.fixColor("&4&lFLY: &cPomyslnie wlaczono latanie"));
            return true;
        }
        if(args.length == 1) {
            if(!cel.getAllowFlight() == true);
            cel.setAllowFlight(false);
            cel.sendMessage(ChatUtil.fixColor("&4&lFLY: &cPomyslnie wylaczono latanie &7" + sender.getName()));
            return true;
        }else{
            cel.setAllowFlight(true);
            cel.sendMessage(ChatUtil.fixColor("&4&lFLY: &cPomyslnie wlaczono latanie &7" + sender.getName()));
            return true;
        }
        return false;
    }
}
