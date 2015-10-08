package me.marcoboekholt.ed;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.marcoboekholt.ed.commands.Commands;
import me.marcoboekholt.ed.data.*;

public class Main extends JavaPlugin {
	
	data data = new data();
	PluginManager pm = Bukkit.getServer().getPluginManager();
	
	public void onEnable() {
		getCommand("energydrinks").setExecutor(new Commands());
		getCommand("ed").setExecutor(new Commands());
		getServer().getLogger().info(data.PLUGIN_NAME + " has been enabled.");
	}
	
	public void onDisable() {
		getServer().getLogger().info(data.PLUGIN_NAME + "has been disabled.");
	}

}
