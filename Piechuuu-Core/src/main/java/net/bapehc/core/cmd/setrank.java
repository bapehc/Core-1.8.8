package net.bapehc.core.cmd;

import net.bapehc.core.utils.ChatUtil;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class setrank implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!sender.hasPermission("setrank.core")) {
            sender.sendMessage(ChatUtil.fixColor("&cNie posiadasz uprawnien !"));
            return true;
        }
        if(args.length < 1) {
            sender.sendMessage(ChatUtil.fixColor("&7Poprawne uzycie: &c/setrank <player> <ranga>"));
            return true;
        }
        if(args[1].equalsIgnoreCase("Gracz")) {
            sender.sendMessage(ChatUtil.fixColor("&7Dales graczowi: &c" + args[0] + " &7range: &cGracz"));
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + args[0] + " group set Gracz");
            return true;
        }
        if(args[1].equalsIgnoreCase("Vip")) {
            sender.sendMessage(ChatUtil.fixColor("&7Dales graczowi: &c" + args[0] + " &7range: &cVip"));
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + args[0] + " group set Vip");
            return true;
        }
        if(args[1].equalsIgnoreCase("Svip")) {
            sender.sendMessage(ChatUtil.fixColor("&7Dales graczowi: &c" + args[0] + " &7range: &cSvipa"));
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + args[0] + " group set Svip");
            return true;
        }
        if(args[1].equalsIgnoreCase("Helper")) {
            sender.sendMessage(ChatUtil.fixColor("&7Dales graczowi: &c" + args[0] + " &7range: &cHelpera"));
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + args[0] + " group set Helper");
            return true;
        }
        if(args[1].equalsIgnoreCase("Moderator")) {
            sender.sendMessage(ChatUtil.fixColor("&7Dales graczowi: &c" + args[0] + " &7range: &cModeratora"));
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + args[0] + " group set Moderator");
            return true;
        }
        if(args[1].equalsIgnoreCase("HeadAdmin")) {
            sender.sendMessage(ChatUtil.fixColor("&7Dales graczowi: &c" + args[0] + " &7range: &cHeadAdmina"));
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + args[0] + " group set HeadAdmin");
            return true;
        }
        if(args[1].equalsIgnoreCase("Root")) {
            sender.sendMessage(ChatUtil.fixColor("&7Dales graczowi: &c" + args[0] + " &7range: &cRoot"));
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + args[0] + " group set Root");
            return true;
        }
        return false;
    }
}
