package com.adincrafty.mod.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public abstract class AbstractCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        return onCommand(commandSender, s, strings);
    }

    protected abstract boolean onCommand(CommandSender sender, String label, String[] arguments);
}
