package com.adincrafty.mod.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.List;

public class PlayerGUI {

    public void open(Player p) {

        final Inventory inv = Bukkit.createInventory(p, 54, "§3Information de " + p.getName());
        final List<String> list = new ArrayList<String>();
        list.add("§6Vie:§c " + p.getHealth());
        list.add("§6Nourriture:§c " + p.getFoodLevel());

        final ItemStack glass = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);

        final ItemStack head = new ItemStack(Material.PLAYER_HEAD);
        final SkullMeta headItem = (SkullMeta) head.getItemMeta();
        assert headItem != null;

        headItem.setDisplayName("§3" + p.getName());
        headItem.setLore(list);
        headItem.setOwningPlayer(p);
        headItem.removeItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        head.setItemMeta(headItem);

        for (int i = 0; i < 9; i++) {
            inv.setItem(i, glass);
        }

        inv.setItem(8, glass);
        inv.setItem(17, glass);
        inv.setItem(26, glass);
        inv.setItem(35, glass);

        inv.setItem(22, head);

        inv.setItem(9, glass);
        inv.setItem(18, glass);
        inv.setItem(27, glass);
        inv.setItem(36, glass);

        for (int i = 45; i < 54; i++) {
            inv.setItem(i, glass);
        }


        p.openInventory(inv);


    }

}
