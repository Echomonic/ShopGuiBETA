package dev.echo.shopgui.beta.registery;

import dev.echo.shopgui.beta.commands.OpenShopGuiCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class RegisterCommands {

    private static JavaPlugin plugin;
    
    public static void registerCommands(){

        plugin.getCommand("shop").setExecutor(new OpenShopGuiCommand());

    }



}
