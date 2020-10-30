package dev.echo.shopgui.beta;

import dev.echo.shopgui.beta.registery.RegisterCommands;
import dev.echo.shopgui.beta.registery.RegisterEvents;
import org.bukkit.plugin.java.JavaPlugin;

public class ShopGui extends JavaPlugin {

    @Override
    public void onEnable() {
        register();
        super.onEnable();
    }

    @Override
    public void onDisable() {

        super.onDisable();
    }



    private void register(){

      RegisterCommands.registerCommands();
      RegisterEvents.registerEvents();

    }



}
