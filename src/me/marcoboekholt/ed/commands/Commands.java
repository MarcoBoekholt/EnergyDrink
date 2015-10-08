package me.marcoboekholt.ed.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.marcoboekholt.ed.data.data;
import me.marcoboekholt.ed.data.drinks;

public class Commands implements CommandExecutor {
	
	data dt = new data();
	drinks dr = new drinks();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(sender instanceof Player) {
			if(p.isOp() || p.hasPermission("energydrinks.help")) {
				if(cmd.getName().equalsIgnoreCase("energydrinks") || cmd.getName().equalsIgnoreCase("ed")) {
					if(args.length == 0) {
						p.sendMessage(dt.HELP_TITLE);
						p.sendMessage(dt.COMMANDS);
						return true;
					} else if(args[0].equalsIgnoreCase("redbull")) {
						if (p.hasPermission("energydrinks.redbull")) {
							dr.redbull(p);
							p.sendMessage(ChatColor.BLUE + "You have got a RedBull drink in your inventory!");
						} else {
							p.sendMessage(dt.NOPERM);
						}		
					} else if(args[0].equalsIgnoreCase("monster")) {
						if (p.hasPermission("energydrinks.monster")) {
							dr.monsterenergy(p);
							p.sendMessage(ChatColor.BLUE + "You have got a Monster Energy drink in your inventory!");
						} else {
							p.sendMessage(dt.NOPERM);
						}
					} else if(args[0].equalsIgnoreCase("rockstar")) {
						if (p.hasPermission("energydrinks.rockstar")) {
							dr.rockstar(p);
							p.sendMessage(ChatColor.BLUE + "You have got a Rockstar drink in your inventory!");
						} else {
							p.sendMessage(dt.NOPERM);
						}
					}
				}
			} else {
				p.sendMessage(dt.NOPERM);
			}
		} else {
			p.sendMessage(dt.NOPLAYER);
		}
		return false;
	}

}
