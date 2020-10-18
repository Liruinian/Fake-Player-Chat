package com.timlrn2016.fakeplayerchat;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	public void onEnable() {
		getServer().getConsoleSender().sendMessage("§2[假玩家聊天]成功加载假玩家聊天插件 Made By Tim_LRN2016");
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("§4[假玩家聊天]成功卸载假玩家聊天插件 Made By Tim_LRN2016");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
		if (cmd.getName().equalsIgnoreCase("fakechat")){
			if(args.length == 0) {
				sender.sendMessage("§6§l§m §f§l           假玩家聊天系统帮助        §6§l§m ");
				sender.sendMessage("§b 输入§9/fakechat say [假玩家名] [说话内容]");
				sender.sendMessage("§3 可以模拟玩家说话 说话内容中不准有空格！");
				sender.sendMessage("§b 输入§9/fakechat join [假玩家名]");
				sender.sendMessage("§3 可以模拟玩家进入游戏");
				sender.sendMessage("§b 输入§9/fakechat say [假玩家名]");
				sender.sendMessage("§3 可以模拟玩家退出游戏");
				sender.sendMessage("§b 输入§9/fakechat join [假玩家名] old");
				sender.sendMessage("§3 可以模拟玩家进入游戏（游戏原版）");
				sender.sendMessage("§b 输入§9/fakechat  leave [假玩家名] old");
				sender.sendMessage("§3 可以模拟玩家退出游戏（游戏原版）");
				sender.sendMessage("§b 输入§9/fakechat join [假玩家名] op");
				sender.sendMessage("§3 可以模拟管理员加入游戏");
				sender.sendMessage("§b 输入§9/fakechat leave [假玩家名] op");
				sender.sendMessage("§3 可以模拟管理员退出游戏");
				return true;
			
			/**
			 * 如果命令为：/fakechat say XXX
			 */
		}if(args[0].equalsIgnoreCase("say")) {
	        if (args.length > 3) {
	            sender.sendMessage("[§6假玩家聊天系统§r] §c您所提供的变量过多！输入：/fakechat (help) 来获取帮助");
	            return true;
	        } 
	        if (args.length <= 2) {
	            sender.sendMessage("[§6假玩家聊天系统§r] §c您所提供的变量过少！输入：/fakechat (help) 来获取帮助");
	            return true;
			}Bukkit.broadcastMessage("<" + args[1] + "> " + args[2]);
			 sender.sendMessage("[§6假玩家聊天系统§r] §2成功发送信息");
			return true;
			/**
			 * 如果命令为：/fakechat leave XXX
			 */
		}if(args[0].equalsIgnoreCase("leave")) {
	        if (args.length == 3) {
	        	if(args[2].equalsIgnoreCase("old")) {
        		Bukkit.broadcastMessage("§e" + args[1] +" 退出了游戏");
        		sender.sendMessage("[§6假玩家聊天系统§r] §2成功发送信息");
        		return true;
	        	}if(args[2].equalsIgnoreCase("op")) {
	            	Bukkit.broadcastMessage("§6§l§m §f§l§m                          §6§l§m ");
	            	Bukkit.broadcastMessage(" §7[§4管理员§7] §4 "+args[1]+" §e退出了游戏！");
	            	Bukkit.broadcastMessage("§6§l§m §f§l§m                          §6§l§m ");
	            	sender.sendMessage("[§6假玩家聊天系统§r] §2成功发送信息");
	            	return true;
	        	}
        }
        if (args.length == 2) {
        	Bukkit.broadcastMessage("§6§l§m §f§l§m                          §6§l§m ");
        	Bukkit.broadcastMessage("  §7[§2玩家§7] §a" +args[1]+" §e退出了游戏！");
        	Bukkit.broadcastMessage("§6§l§m §f§l§m                          §6§l§m ");
        	sender.sendMessage("[§6假玩家聊天系统§r] §2成功发送信息");
        	return true;
        }else{
        	sender.sendMessage("[§6假玩家聊天系统§r] §c您所提供的变量错误！输入：/fakechat (help) 来获取帮助");
        	return true;
        }
			/**
			 * 如果命令为：/fakechat join XXX
			 */
		}if(args[0].equalsIgnoreCase("join")) {
	        if (args.length == 3) {
	        	if(args[2].equalsIgnoreCase("old")) {
	        		Bukkit.broadcastMessage("§e" + args[1] +" 加入了游戏");
	        		sender.sendMessage("[§6假玩家聊天系统§r] §2成功发送信息");
	        		return true;
	        	}if(args[2].equalsIgnoreCase("op")) {
	            	Bukkit.broadcastMessage("§6§l§m §f§l§m                          §6§l§m ");
	            	Bukkit.broadcastMessage(" §7[§4管理员§7] §4 "+args[1]+" §e加入了游戏！");
	            	Bukkit.broadcastMessage("§6§l§m §f§l§m                          §6§l§m ");
	            	sender.sendMessage("[§6假玩家聊天系统§r] §2成功发送信息");
	            	return true;
	        	}
	        }if (args.length == 2) {
	        	Bukkit.broadcastMessage("§6§l§m §f§l§m                          §6§l§m ");
	        	Bukkit.broadcastMessage("  §7[§2玩家§7] §a" +args[1]+" §e加入了游戏！");
	        	Bukkit.broadcastMessage("§6§l§m §f§l§m                          §6§l§m ");
	        	sender.sendMessage("[§6假玩家聊天系统§r] §2成功发送信息");
	        	return true;
	        }else{
	        	sender.sendMessage("[§6假玩家聊天系统§r] §c您所提供的变量错误！输入：/fakechat (help) 来获取帮助");
	        	return true;
	        }
			/**
			 * 如果命令为：/fakechat help [XXX]
			 */
		}if(args[0].equalsIgnoreCase("help")) {
					sender.sendMessage("§6§l§m §f§l           假玩家聊天系统帮助        §6§l§m ");
					sender.sendMessage("§b 输入§9/fakechat say [假玩家名] [说话内容]");
					sender.sendMessage("§3 可以模拟玩家说话 说话内容中不准有空格！");
					sender.sendMessage("§b 输入§9/fakechat join [假玩家名]");
					sender.sendMessage("§3 可以模拟玩家进入游戏");
					sender.sendMessage("§b 输入§9/fakechat say [假玩家名]");
					sender.sendMessage("§3 可以模拟玩家退出游戏");
					sender.sendMessage("§b 输入§9/fakechat join [假玩家名] old");
					sender.sendMessage("§3 可以模拟玩家进入游戏（游戏原版）");
					sender.sendMessage("§b 输入§9/fakechat  leave [假玩家名] old");
					sender.sendMessage("§3 可以模拟玩家退出游戏（游戏原版）");
					sender.sendMessage("§b 输入§9/fakechat join [假玩家名] op");
					sender.sendMessage("§3 可以模拟管理员加入游戏");
					sender.sendMessage("§b 输入§9/fakechat leave [假玩家名] op");
					sender.sendMessage("§3 可以模拟管理员退出游戏");
						return true;
						/**
						 * 如果命令不在上面的范围内
						 */
					}else {
						sender.sendMessage("[§6假玩家聊天系统§r] §c您所输入的命令不存在！输入：/fakechat (help) 来获取帮助");
						return true;
			}
		}return true;
	}
}