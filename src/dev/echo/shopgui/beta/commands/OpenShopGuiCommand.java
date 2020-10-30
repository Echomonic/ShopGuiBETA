package dev.echo.shopgui.beta.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class OpenShopGuiCommand implements CommandExecutor, Listener {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player){

            Player player = (Player) sender;

            if(player.getExpToLevel() <= 10){
                player.sendMessage(ChatColor.RED + "You need 10 levels to open the shop!");
            }else{

            }

        }else{
            sender.sendMessage(ChatColor.RED + "You cannot do this as the console!");
            return true;
        }
        return false;

    }
}
