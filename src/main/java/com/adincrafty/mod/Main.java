package com.adincrafty.mod;

import com.adincrafty.mod.command.CommandMod;
import com.adincrafty.mod.listener.PlayerGUIListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new PlayerGUIListener(), this);

        getCommand("mod").setExecutor(new CommandMod());

        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
