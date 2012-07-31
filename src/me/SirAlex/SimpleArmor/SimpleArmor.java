package me.SirAlex.SimpleArmor;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class SimpleArmor extends JavaPlugin{

	public void onDisable() {
		
		System.out.println("[SimpleArmor] disabled!");
	}

	public void onEnable() {
		
		System.out.println("[SimpleArmor] enabled!");
	}
    
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		boolean succeed = false;
		
		if (sender instanceof Player) {
		    Player player = (Player) sender;
		    if (cmd.getName().equalsIgnoreCase("darmor"))
		    	if (player.hasPermission("simplearmor.diamond")){
		    		
		    		player.getInventory().setHelmet(new ItemStack(310, 1));
		    		player.getInventory().setChestplate(new ItemStack(311, 1));
		    		player.getInventory().setLeggings(new ItemStack(312, 1));
		    		player.getInventory().setBoots(new ItemStack(313, 1));
		    		player.getInventory().setItem(0, new ItemStack(276, 1));
		    		player.getInventory().setItem(1, new ItemStack(279, 1));
		    		player.getInventory().setItem(2, new ItemStack(278, 1));
		    		player.getInventory().setItem(3, new ItemStack(277, 1));
		    		System.out.println("[SimpleArmor] " + player.getName() + " cheated diamond armor!");
		    		
		    		
		    		succeed = true;
		    		 {
		    		player.sendMessage(ChatColor.GREEN + "[SimpleArmor] " + ChatColor.GREEN + "Here is your diamond armor!");
		    	}
		    
		    }
		    	else player.sendMessage(ChatColor.RED + "[SimpleArmor] You don't have permission to do that.");
	
		
		    if (cmd.getName().equalsIgnoreCase("garmor"))
	    	if (player.hasPermission("simplearmor.gold")){
	    		
			player.getInventory().setHelmet(new ItemStack(314, 1));
    		player.getInventory().setChestplate(new ItemStack(315, 1));
    		player.getInventory().setLeggings(new ItemStack(316, 1));
    		player.getInventory().setBoots(new ItemStack(317, 1));
    		player.getInventory().setItem(0, new ItemStack(283, 1));
    		player.getInventory().setItem(1, new ItemStack(286, 1));
    		player.getInventory().setItem(2, new ItemStack(285, 1));
    		player.getInventory().setItem(3, new ItemStack(284, 1));
    		System.out.println("[SimpleArmor] " + player.getName() + " cheated gold armor!");

    		succeed = true;
    		 {
    		player.sendMessage(ChatColor.GREEN + "[SimpleArmor] " + ChatColor.GREEN + "Here is your gold armor!");
    	}
    
    }	

	    	else player.sendMessage(ChatColor.RED + "[SimpleArmor] You don't have permission to do that.");
		
		    if (cmd.getName().equalsIgnoreCase("iarmor")) 
	    	if (player.hasPermission("simplearmor.iron")){
	    		
			player.getInventory().setHelmet(new ItemStack(306, 1));
    		player.getInventory().setChestplate(new ItemStack(307, 1));
    		player.getInventory().setLeggings(new ItemStack(308, 1));
    		player.getInventory().setBoots(new ItemStack(309, 1));
    		player.getInventory().setItem(0, new ItemStack(267, 1));
    		player.getInventory().setItem(1, new ItemStack(258, 1));
    		player.getInventory().setItem(2, new ItemStack(257, 1));
    		player.getInventory().setItem(3, new ItemStack(256, 1));
    		System.out.println("[SimpleArmor] " + player.getName() + " cheated iron armor!");

    		succeed = true;
    		 {
    		player.sendMessage(ChatColor.GREEN + "[SimpleArmor] " + ChatColor.GREEN + "Here is your iron armor!");
    	}
    
    }
	    	else player.sendMessage(ChatColor.RED + "[SimpleArmor] You don't have permission to do that.");
		
		if (cmd.getName().equalsIgnoreCase("carmor"))
    	if (player.hasPermission("simplearmor.chain")){
    		
		player.getInventory().setHelmet(new ItemStack(302, 1));
		player.getInventory().setChestplate(new ItemStack(303, 1));
		player.getInventory().setLeggings(new ItemStack(304, 1));
		player.getInventory().setBoots(new ItemStack(305, 1));
		player.getInventory().setItem(0, new ItemStack(267, 1));
		player.getInventory().setItem(1, new ItemStack(258, 1));
		player.getInventory().setItem(2, new ItemStack(257, 1));
		player.getInventory().setItem(3, new ItemStack(256, 1));
		System.out.println("[SimpleArmor] " + player.getName() + " cheated chain armor!");

		succeed = true;
		 {
		player.sendMessage(ChatColor.GREEN + "[SimpleArmor] " + ChatColor.GREEN + "Here is your chain armor!");
	}

}
    	else player.sendMessage(ChatColor.RED + "[SimpleArmor] You don't have permission to do that.");
		
		if (cmd.getName().equalsIgnoreCase("larmor"))
	    	if (player.hasPermission("simplearmor.leather")){
	    		
			player.getInventory().setHelmet(new ItemStack(298, 1));
			player.getInventory().setChestplate(new ItemStack(299, 1));
			player.getInventory().setLeggings(new ItemStack(300, 1));
			player.getInventory().setBoots(new ItemStack(301, 1));
			player.getInventory().setItem(0, new ItemStack(268, 1));
			player.getInventory().setItem(1, new ItemStack(271, 1));
			player.getInventory().setItem(2, new ItemStack(270, 1));
			player.getInventory().setItem(3, new ItemStack(269, 1));
			System.out.println("[SimpleArmor] " + player.getName() + " cheated leather armor!");

			succeed = true;
			 {
			player.sendMessage(ChatColor.GREEN + "[SimpleArmor] " + ChatColor.GREEN + "Here is your leather armor!");
		}

	}
	    	else player.sendMessage(ChatColor.RED + "[SimpleArmor] You don't have permission to do that.");
		
		if (cmd.getName().equalsIgnoreCase("repair"))
	    	if (player.hasPermission("simplearmor.repair")){
	    		
			player.getItemInHand().setDurability((short) 0);
    		System.out.println("[SimpleArmor] " + player.getName() + " repaired an item!");

			succeed = true;
			 {
			player.sendMessage(ChatColor.GREEN + "[SimpleArmor] " + ChatColor.GREEN + "Item repaired!");
		}
		}
	    	else player.sendMessage(ChatColor.RED + "[SimpleArmor] You don't have permission to do that.");
		
		
		if (cmd.getName().equalsIgnoreCase("arepair"))
	    	if (player.hasPermission("simplearmor.arepair")){
	    		
	    	player.getInventory().getHelmet().setDurability((short) 0);
	    	player.getInventory().getChestplate().setDurability((short) 0);
	    	player.getInventory().getLeggings().setDurability((short) 0);
	    	player.getInventory().getBoots().setDurability((short) 0);
    		System.out.println("[SimpleArmor] " + player.getName() + " repaired his armor!");

			succeed = true;
			 {
			player.sendMessage(ChatColor.GREEN + "[SimpleArmor] " + ChatColor.GREEN + "Armor repaired!");
		}
		}
	    	else player.sendMessage(ChatColor.RED + "[SimpleArmor] You don't have permission to do that.");
  }
		return succeed;
    }
}
