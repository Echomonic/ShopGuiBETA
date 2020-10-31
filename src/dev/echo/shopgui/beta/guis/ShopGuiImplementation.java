package dev.echo.shopgui.beta.guis;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ShopGuiImplementation implements Listener {

    public Inventory shopGui;

    private ItemStack stainedGlass;

    public ShopGuiImplementation(){

        shopGui = Bukkit.createInventory(null, 56, ChatColor.GREEN + "ShopGui"  +ChatColor.RED + "[BETA]" );

        addItems();
    }

    private void addItems() {

        shopGui.addItem(StainedGlass());

    }

    private ItemStack StainedGlass(){

        stainedGlass = new  ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1 , DyeColor.GRAY.getDyeData());

        for(int i = 0; i < shopGui.getSize(); i ++){
            if(shopGui.getItem(i) == null){
                shopGui.setItem(i, null);
            }
        }

        return stainedGlass;
    }

}
