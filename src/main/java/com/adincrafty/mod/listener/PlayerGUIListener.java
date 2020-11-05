package com.adincrafty.mod.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerGUIListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {

        final ItemStack is = e.getCurrentItem();
        final Player p = (Player) e.getWhoClicked();

        if(is == null || is.getType().equals(Material.AIR))
            return;

        final ItemMeta im = is.getItemMeta();

        assert im != null;

        final InventoryView iv = e.getView();

        if(iv.getTitle().contains("§3Information")) {
            e.setCancelled(true);
        }

    }

}
