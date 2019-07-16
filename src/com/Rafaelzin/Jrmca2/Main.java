package com.Rafaelzin.Jrmca2;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage("[Jrmca2] ativado com sucesso");
		getCommand("jrmca2").setExecutor(new Command());
	}


}
