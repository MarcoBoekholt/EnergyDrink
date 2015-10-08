package me.marcoboekholt.ed.data;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

public class drinks {

	public void redbull(Player player) {
		Potion potion = new Potion(PotionType.SPEED, 2, false, false);
		ItemStack ipotion = potion.toItemStack(1);
		ItemMeta mpotion = ipotion.getItemMeta();
		mpotion.setDisplayName(ChatColor.BLUE + "RedBull");
		ipotion.setItemMeta(mpotion);
		player.getPlayer().playSound(player.getPlayer().getLocation(), Sound.FALL_BIG, 0.2F, 1.0F);
		PlayerInventory pl = player.getInventory();
		pl.addItem(ipotion);
	}
	
	public void monsterenergy(Player player) {
		Potion potion = new Potion(PotionType.JUMP, 2, false, false);
		ItemStack ipotion = potion.toItemStack(1);
		ItemMeta mpotion = ipotion.getItemMeta();
		mpotion.setDisplayName(ChatColor.GREEN + "Monster Energy");
		ipotion.setItemMeta(mpotion);
		player.getPlayer().playSound(player.getPlayer().getLocation(), Sound.FALL_BIG, 0.2F, 1.0F);
		PlayerInventory pl = player.getInventory();
		pl.addItem(ipotion);
	}
	
	public void rockstar(Player player) {
		Potion potion = new Potion(PotionType.FIRE_RESISTANCE, 2, false, false);
		ItemStack ipotion = potion.toItemStack(1);
		ItemMeta mpotion = ipotion.getItemMeta();
		mpotion.setDisplayName(ChatColor.YELLOW + "Rockstar Energy");
		ipotion.setItemMeta(mpotion);
		player.getPlayer().playSound(player.getPlayer().getLocation(), Sound.FALL_BIG, 0.2F, 1.0F);
		PlayerInventory pl = player.getInventory();
		pl.addItem(ipotion);
	}
}
