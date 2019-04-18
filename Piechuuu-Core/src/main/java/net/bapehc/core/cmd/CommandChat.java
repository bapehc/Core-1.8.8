package net.bapehc.core.cmd;

import net.bapehc.core.utils.ChatUtil;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class CommandChat implements CommandExecutor, Listener {

    private static boolean chat = true;


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("chat")) {
            if(!(sender instanceof Player)) {
                sender.sendMessage("Komendy tylko dla graczy !");
                return false;
            }
            if(!(sender.hasPermission("chat.core.all"))) {
                sender.sendMessage(ChatUtil.fixColor("&cNie posiadasz odpowiednich uprawnien !"));
                return false;
            }
            Player p = (Player)sender;
            if(args.length==1) {
                if(args[0].equalsIgnoreCase("on")) {
                    if(chat=false) {
                        chat = true;
                        Bukkit.broadcastMessage(ChatUtil.fixColor("&8>> &7Administrator wlaczyl chat - &c" +p.getName()));
                        return true;
                    } else{
                        p.sendMessage(ChatUtil.fixColor("&4Chat juz jest wlaczony !"));
                        return false;
                    }
                    if(args[0].equalsIgnoreCase("off")) {
                        if(chat==true) {
                            chat=false;
                            Bukkit.broadcastMessage(ChatUtil.fixColor("&8>> &7Administrator wylaczyl chat - &c" +p.getName()));
                            return true;
                        } else{
                            p.sendMessage(ChatUtil.fixColor("&4Chat juz jest wylaczony !"));
                        }
                    if(args[0].equalsIgnoreCase("cc") || args[0].equalsIgnoreCase("clear")) {
                        for(int i = 0; i < 150; i++) {
                            Bukkit.broadcastMessage("");
                        }
                        Bukkit.broadcastMessage(ChatUtil.fixColor("&8>> &7Administrator wyczyscil  chat - &c" +p.getName()));
                        return true;
                    }
                    }
                }
            }
        }
        return false;
    }
}
