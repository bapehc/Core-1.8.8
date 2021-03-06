package core.cmd;

import com.connorlinfoot.titleapi.TitleAPI;
import core.utils.ChatUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ItemshopCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if(!sender.hasPermission("core.cmd.is")){
            sender.sendMessage(ChatUtil.fixColor("&4Blad: &cNie masz dostepu do &7(core.cmd.is)"));
            TitleAPI.sendTitle(p,20,50,20, ChatUtil.fixColor("&4Blad"), ChatUtil.fixColor("&cBrak dostepu"));
            return false;
        }
        if(args.length < 1){
            sender.sendMessage(ChatUtil.fixColor("&4Blad: &cPoprawne uzycie: &7/is <nick> <vip|svip|unban|rezerwacja>"));
        }
        return false;
    }
}
