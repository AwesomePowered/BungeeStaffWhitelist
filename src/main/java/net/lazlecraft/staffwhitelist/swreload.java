package net.lazlecraft.staffwhitelist;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

public class swreload extends Command {
	
	public swreload(StaffWhitelist plugin) {
		super("swreload");
		this.plugin = plugin;
		// TODO Auto-generated constructor stub
	}

	StaffWhitelist plugin;

	@Override
	public void execute(CommandSender sender, String[] arg1) {
		if (sender.hasPermission("StaffWhitelist.reload")) {
			plugin.reloadConfig();
			sender.sendMessage(ChatColor.GREEN + "StaffWhitelist has been reloaded!");
		}
		// TODO Auto-generated method stub

	}

}
