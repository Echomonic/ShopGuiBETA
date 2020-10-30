package dev.echo.shopgui.beta.guis;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class ShopGuiImplementation implements Listener {

    public Inventory shopGui;

    public ShopGuiImplementation(){

        shopGui = Bukkit.createInventory(null, 56, ChatColor.GREEN + "ShopGui"  +ChatColor.RED + "[BETA]" );

    }


}
