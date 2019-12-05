package com.rafaelrain.statusplus.exampleplugin;

import com.rafaelrain.statusplus.exampleplugin.command.ExampleCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class ExamplePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("teste").setExecutor(new ExampleCommand());
        getLogger().info("Plugin iniciado.");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
