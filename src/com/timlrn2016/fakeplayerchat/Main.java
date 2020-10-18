package com.timlrn2016.fakeplayerchat;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	public void onEnable() {
		getServer().getConsoleSender().sendMessage("��2[���������]�ɹ����ؼ���������� Made By Tim_LRN2016");
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("��4[���������]�ɹ�ж�ؼ���������� Made By Tim_LRN2016");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
		if (cmd.getName().equalsIgnoreCase("fakechat")){
			if(args.length == 0) {
				sender.sendMessage("��6��l��m ��f��l           ���������ϵͳ����        ��6��l��m ");
				sender.sendMessage("��b �����9/fakechat say [�������] [˵������]");
				sender.sendMessage("��3 ����ģ�����˵�� ˵�������в�׼�пո�");
				sender.sendMessage("��b �����9/fakechat join [�������]");
				sender.sendMessage("��3 ����ģ����ҽ�����Ϸ");
				sender.sendMessage("��b �����9/fakechat say [�������]");
				sender.sendMessage("��3 ����ģ������˳���Ϸ");
				sender.sendMessage("��b �����9/fakechat join [�������] old");
				sender.sendMessage("��3 ����ģ����ҽ�����Ϸ����Ϸԭ�棩");
				sender.sendMessage("��b �����9/fakechat  leave [�������] old");
				sender.sendMessage("��3 ����ģ������˳���Ϸ����Ϸԭ�棩");
				sender.sendMessage("��b �����9/fakechat join [�������] op");
				sender.sendMessage("��3 ����ģ�����Ա������Ϸ");
				sender.sendMessage("��b �����9/fakechat leave [�������] op");
				sender.sendMessage("��3 ����ģ�����Ա�˳���Ϸ");
				return true;
			
			/**
			 * �������Ϊ��/fakechat say XXX
			 */
		}if(args[0].equalsIgnoreCase("say")) {
	        if (args.length > 3) {
	            sender.sendMessage("[��6���������ϵͳ��r] ��c�����ṩ�ı������࣡���룺/fakechat (help) ����ȡ����");
	            return true;
	        } 
	        if (args.length <= 2) {
	            sender.sendMessage("[��6���������ϵͳ��r] ��c�����ṩ�ı������٣����룺/fakechat (help) ����ȡ����");
	            return true;
			}Bukkit.broadcastMessage("<" + args[1] + "> " + args[2]);
			 sender.sendMessage("[��6���������ϵͳ��r] ��2�ɹ�������Ϣ");
			return true;
			/**
			 * �������Ϊ��/fakechat leave XXX
			 */
		}if(args[0].equalsIgnoreCase("leave")) {
	        if (args.length == 3) {
	        	if(args[2].equalsIgnoreCase("old")) {
        		Bukkit.broadcastMessage("��e" + args[1] +" �˳�����Ϸ");
        		sender.sendMessage("[��6���������ϵͳ��r] ��2�ɹ�������Ϣ");
        		return true;
	        	}if(args[2].equalsIgnoreCase("op")) {
	            	Bukkit.broadcastMessage("��6��l��m ��f��l��m                          ��6��l��m ");
	            	Bukkit.broadcastMessage(" ��7[��4����Ա��7] ��4 "+args[1]+" ��e�˳�����Ϸ��");
	            	Bukkit.broadcastMessage("��6��l��m ��f��l��m                          ��6��l��m ");
	            	sender.sendMessage("[��6���������ϵͳ��r] ��2�ɹ�������Ϣ");
	            	return true;
	        	}
        }
        if (args.length == 2) {
        	Bukkit.broadcastMessage("��6��l��m ��f��l��m                          ��6��l��m ");
        	Bukkit.broadcastMessage("  ��7[��2��ҡ�7] ��a" +args[1]+" ��e�˳�����Ϸ��");
        	Bukkit.broadcastMessage("��6��l��m ��f��l��m                          ��6��l��m ");
        	sender.sendMessage("[��6���������ϵͳ��r] ��2�ɹ�������Ϣ");
        	return true;
        }else{
        	sender.sendMessage("[��6���������ϵͳ��r] ��c�����ṩ�ı����������룺/fakechat (help) ����ȡ����");
        	return true;
        }
			/**
			 * �������Ϊ��/fakechat join XXX
			 */
		}if(args[0].equalsIgnoreCase("join")) {
	        if (args.length == 3) {
	        	if(args[2].equalsIgnoreCase("old")) {
	        		Bukkit.broadcastMessage("��e" + args[1] +" ��������Ϸ");
	        		sender.sendMessage("[��6���������ϵͳ��r] ��2�ɹ�������Ϣ");
	        		return true;
	        	}if(args[2].equalsIgnoreCase("op")) {
	            	Bukkit.broadcastMessage("��6��l��m ��f��l��m                          ��6��l��m ");
	            	Bukkit.broadcastMessage(" ��7[��4����Ա��7] ��4 "+args[1]+" ��e��������Ϸ��");
	            	Bukkit.broadcastMessage("��6��l��m ��f��l��m                          ��6��l��m ");
	            	sender.sendMessage("[��6���������ϵͳ��r] ��2�ɹ�������Ϣ");
	            	return true;
	        	}
	        }if (args.length == 2) {
	        	Bukkit.broadcastMessage("��6��l��m ��f��l��m                          ��6��l��m ");
	        	Bukkit.broadcastMessage("  ��7[��2��ҡ�7] ��a" +args[1]+" ��e��������Ϸ��");
	        	Bukkit.broadcastMessage("��6��l��m ��f��l��m                          ��6��l��m ");
	        	sender.sendMessage("[��6���������ϵͳ��r] ��2�ɹ�������Ϣ");
	        	return true;
	        }else{
	        	sender.sendMessage("[��6���������ϵͳ��r] ��c�����ṩ�ı����������룺/fakechat (help) ����ȡ����");
	        	return true;
	        }
			/**
			 * �������Ϊ��/fakechat help [XXX]
			 */
		}if(args[0].equalsIgnoreCase("help")) {
					sender.sendMessage("��6��l��m ��f��l           ���������ϵͳ����        ��6��l��m ");
					sender.sendMessage("��b �����9/fakechat say [�������] [˵������]");
					sender.sendMessage("��3 ����ģ�����˵�� ˵�������в�׼�пո�");
					sender.sendMessage("��b �����9/fakechat join [�������]");
					sender.sendMessage("��3 ����ģ����ҽ�����Ϸ");
					sender.sendMessage("��b �����9/fakechat say [�������]");
					sender.sendMessage("��3 ����ģ������˳���Ϸ");
					sender.sendMessage("��b �����9/fakechat join [�������] old");
					sender.sendMessage("��3 ����ģ����ҽ�����Ϸ����Ϸԭ�棩");
					sender.sendMessage("��b �����9/fakechat  leave [�������] old");
					sender.sendMessage("��3 ����ģ������˳���Ϸ����Ϸԭ�棩");
					sender.sendMessage("��b �����9/fakechat join [�������] op");
					sender.sendMessage("��3 ����ģ�����Ա������Ϸ");
					sender.sendMessage("��b �����9/fakechat leave [�������] op");
					sender.sendMessage("��3 ����ģ�����Ա�˳���Ϸ");
						return true;
						/**
						 * ������������ķ�Χ��
						 */
					}else {
						sender.sendMessage("[��6���������ϵͳ��r] ��c���������������ڣ����룺/fakechat (help) ����ȡ����");
						return true;
			}
		}return true;
	}
}