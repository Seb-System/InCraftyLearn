package com.adincrafty.mod.command;

import com.adincrafty.mod.gui.PlayerGUI;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandMod extends AbstractCommand {


    @Override
    protected boolean onCommand(CommandSender sender, String label, String[] arguments) {

        if(!(sender instanceof Player))
            return false;

        final Player p = ((Player) sender).getPlayer();
        assert p != null;

        if(arguments.length != 1) {
            p.sendMessage("§c[Modération] /mod <player>");
            return false;
        }

        final Player receiver = Bukkit.getPlayer(arguments[0]);

        if(receiver == null) {
            p.sendMessage("§c[Modération] Le joueur " + arguments[0] + " n'existe pas !");
            return false;
        }

        if(label.equals("mod")) {
                new PlayerGUI().open(p);
                return true;
        }

        return false;
    }
}
