package com.Rafaelzin.Jrmca2;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.dpohvar.powernbt.PowerNBT;
import me.dpohvar.powernbt.api.NBTCompound;
import me.dpohvar.powernbt.api.NBTManager;


public class Command implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("jrmca2")) {
			if (!sender.hasPermission("jrmca2.use")){
				SemPerm(sender);
				return true;
			} else{
				if(args.length == 0) {
					Ajuda(sender);
					return true;
				}
				if(args.length == 1) {
					Ajuda(sender);
					return true;
				}
				if(args.length == 2) {
					Ajuda(sender);
					return true;
				}
				if(!(args[0].equalsIgnoreCase("add")) && (!args[0].equalsIgnoreCase("remove"))) {
					Ajuda(sender);
					return true;
				}
				Player p;
				if(args[0].equalsIgnoreCase("add")) {
					if (args.length == 3) {
						if (!(sender instanceof Player)) {
						     sender.sendMessage("§7[§a!§7] §bAcho que você esqueceu do nick de um player no final né!");
						     return true;
						     }
						p = (Player)sender;
						int adicao = Integer.valueOf(args[2]);
						NBTManager manager = PowerNBT.getApi();
						
			            NBTCompound PlayerData = manager.read(p);
			            NBTCompound ForgeData = (NBTCompound)PlayerData.get("ForgeData");
			            NBTCompound PlayerPersisted = (NBTCompound)ForgeData.get("PlayerPersisted");
			            int strR = PlayerPersisted.getInt("jrmcStrI");
			            int dexR = PlayerPersisted.getInt("jrmcDexI");
			            int conR = PlayerPersisted.getInt("jrmcCnsI");
			            int wilR = PlayerPersisted.getInt("jrmcWilI");
			            int mndR = PlayerPersisted.getInt("jrmcIntI");
			            int spiR = PlayerPersisted.getInt("jrmcCncI");
			            
			            
			            if(args[1].equalsIgnoreCase("str")) {
			            	int strSoma;
			            	strSoma = strR + adicao;
			            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + strR + " de STR, §ee agora tem §c" + strSoma);
			            	PlayerPersisted.put("jrmcStrI", (int)strSoma);
			            	manager.write(p, PlayerData);
			            	return true;
			            }
	
			            if(args[1].equalsIgnoreCase("dex")) {
			            	int dexSoma;
			            	dexSoma = dexR + adicao;
			            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + dexR + " de DEX, §ee agora tem §c" + dexSoma);
			            	PlayerPersisted.put("jrmcDexI", (int)dexSoma);
			            	manager.write(p, PlayerData);
			            	return true;
			            }
	
			            if(args[1].equalsIgnoreCase("con")) {
			            	int conSoma;
			            	conSoma = conR + adicao;
			            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + conR + " de CON, §ee agora tem §c" + conSoma);
			            	PlayerPersisted.put("jrmcCnsI", (int)conSoma);
			            	manager.write(p, PlayerData);
			            	return true;
			            }
	
			            if(args[1].equalsIgnoreCase("wil")) {
			            	int wilSoma;
			            	wilSoma = wilR + adicao;
			            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + wilR + " de WIL, §ee agora tem §c" + wilSoma);
			            	PlayerPersisted.put("jrmcWilI", (int)wilSoma);
			            	manager.write(p, PlayerData);
			            	return true;
			            }
	
			            if(args[1].equalsIgnoreCase("mnd")) {
			            	int mndSoma;
			            	mndSoma = mndR + adicao;
			            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + mndR + " de MND, §ee agora tem §c" + mndSoma);
			            	PlayerPersisted.put("jrmcIntI", (int)mndSoma);
			            	manager.write(p, PlayerData);
			            	return true;
			            }
	
			            if(args[1].equalsIgnoreCase("spi")) {
			            	int spiSoma;
			            	spiSoma = spiR + adicao;
			            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + spiR + " de SPI, §ee agora tem §c" + spiSoma);
			            	PlayerPersisted.put("jrmcCncI", (int)spiSoma);
			            	manager.write(p, PlayerData);
			            	return true;
			            }
			            if(args[1].equalsIgnoreCase("all")) {
			            	Bukkit.dispatchCommand(p, "jrmca2 add str " + args[2]);
			            	Bukkit.dispatchCommand(p, "jrmca2 add dex " + args[2]);
			            	Bukkit.dispatchCommand(p, "jrmca2 add con " + args[2]);
			            	Bukkit.dispatchCommand(p, "jrmca2 add wil " + args[2]);
			            	Bukkit.dispatchCommand(p, "jrmca2 add mnd " + args[2]);
			            	Bukkit.dispatchCommand(p, "jrmca2 add spi " + args[2]);
			            }
				}
					if (args.length == 4) {
							p = Bukkit.getPlayer(args[3]);
							int adicao = Integer.valueOf(args[2]);
							NBTManager manager = PowerNBT.getApi();
				            NBTCompound PlayerData = manager.read(p);
				            NBTCompound ForgeData = (NBTCompound)PlayerData.get("ForgeData");
				            NBTCompound PlayerPersisted = (NBTCompound)ForgeData.get("PlayerPersisted");
				            int strR = PlayerPersisted.getInt("jrmcStrI");
				            int dexR = PlayerPersisted.getInt("jrmcDexI");
				            int conR = PlayerPersisted.getInt("jrmcCnsI");
				            int wilR = PlayerPersisted.getInt("jrmcWilI");
				            int mndR = PlayerPersisted.getInt("jrmcIntI");
				            int spiR = PlayerPersisted.getInt("jrmcCncI");
				            
				            
				            if(args[1].equalsIgnoreCase("str")) {
				            	int strSoma;
				            	strSoma = strR + adicao;
				            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + strR + " de STR, §ee agora tem §c" + strSoma);
				            	PlayerPersisted.put("jrmcStrI", (int)strSoma);
				            	manager.write(p, PlayerData);
				            	return true;
				            }
	
				            if(args[1].equalsIgnoreCase("dex")) {
				            	int dexSoma;
				            	dexSoma = dexR + adicao;
				            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + dexR + " de DEX, §ee agora tem §c" + dexSoma);
				            	PlayerPersisted.put("jrmcDexI", (int)dexSoma);
				            	manager.write(p, PlayerData);
				            	return true;
				            }
	
				            if(args[1].equalsIgnoreCase("con")) {
				            	int conSoma;
				            	conSoma = conR + adicao;
				            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + conR + " de CON, §ee agora tem §c" + conSoma);
				            	PlayerPersisted.put("jrmcCnsI", (int)conSoma);
				            	manager.write(p, PlayerData);
				            	return true;
				            }
	
				            if(args[1].equalsIgnoreCase("wil")) {
				            	int wilSoma;
				            	wilSoma = wilR + adicao;
				            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + wilR + " de WIL, §ee agora tem §c" + wilSoma);
				            	PlayerPersisted.put("jrmcWilI", (int)wilSoma);
				            	manager.write(p, PlayerData);
				            	return true;
				            }
	
				            if(args[1].equalsIgnoreCase("mnd")) {
				            	int mndSoma;
				            	mndSoma = mndR + adicao;
				            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + mndR + " de MND, §ee agora tem §c" + mndSoma);
				            	PlayerPersisted.put("jrmcIntI", (int)mndSoma);
				            	manager.write(p, PlayerData);
				            	return true;
				            }
	
				            if(args[1].equalsIgnoreCase("spi")) {
				            	int spiSoma;
				            	spiSoma = spiR + adicao;
				            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + spiR + " de SPI, §ee agora tem §c" + spiSoma);
				            	PlayerPersisted.put("jrmcCncI", (int)spiSoma);
				            	manager.write(p, PlayerData);
				            	return true;
				            }
				            if(args[1].equalsIgnoreCase("all")) {
				            	Bukkit.dispatchCommand(p, "jrmca2 add str " + args[2] + " " + args[3]);
				            	Bukkit.dispatchCommand(p, "jrmca2 add dex " + args[2] + " " + args[3]);
				            	Bukkit.dispatchCommand(p, "jrmca2 add con " + args[2] + " " + args[3]);
				            	Bukkit.dispatchCommand(p, "jrmca2 add wil " + args[2] + " " + args[3]);
				            	Bukkit.dispatchCommand(p, "jrmca2 add mnd " + args[2] + " " + args[3]);
				            	Bukkit.dispatchCommand(p, "jrmca2 add spi " + args[2] + " " + args[3]);
				            	return true;
				            }
					}    
				}
				
				
				

				if(args[0].equalsIgnoreCase("remove")) {
					if (args.length == 3) {
						if (!(sender instanceof Player)) {
						     sender.sendMessage("§7[§a!§7] §bAcho que você esqueceu de adicionar o nick de um player no final!");
						     return true;
						     }
						p = (Player)sender;
						int adicao = Integer.valueOf(args[2]);
						NBTManager manager = PowerNBT.getApi();
						
			            NBTCompound PlayerData = manager.read(p);
			            NBTCompound ForgeData = (NBTCompound)PlayerData.get("ForgeData");
			            NBTCompound PlayerPersisted = (NBTCompound)ForgeData.get("PlayerPersisted");
			            int strR = PlayerPersisted.getInt("jrmcStrI");
			            int dexR = PlayerPersisted.getInt("jrmcDexI");
			            int conR = PlayerPersisted.getInt("jrmcCnsI");
			            int wilR = PlayerPersisted.getInt("jrmcWilI");
			            int mndR = PlayerPersisted.getInt("jrmcIntI");
			            int spiR = PlayerPersisted.getInt("jrmcCncI");
			            
			            
			            if(args[1].equalsIgnoreCase("str")) {
			            	int strSoma;
			            	strSoma = strR - adicao;
			            	if(strSoma <= 1) {
			            		sender.sendMessage("§cIsso ultrapassa os stats minimos");
			            		return true;
			            	}
			            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + strR + " de STR, §ee agora tem §c" + strSoma);
			            	PlayerPersisted.put("jrmcStrI", (int)strSoma);
			            	manager.write(p, PlayerData);
			            	return true;
			            }
	
			            if(args[1].equalsIgnoreCase("dex")) {
			            	int dexSoma;
			            	dexSoma = dexR - adicao;
			            	if(dexSoma <= 1) {
			            		sender.sendMessage("§cIsso ultrapassa os stats minimos");
			            		return true;
			            	}
			            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + dexR + " de DEX, §ee agora tem §c" + dexSoma);
			            	PlayerPersisted.put("jrmcDexI", (int)dexSoma);
			            	manager.write(p, PlayerData);
			            	return true;
			            }
	
			            if(args[1].equalsIgnoreCase("con")) {
			            	int conSoma;
			            	conSoma = conR - adicao;
			            	if(conSoma <= 1) {
			            		sender.sendMessage("§cIsso ultrapassa os stats minimos");
			            		return true;
			            	}
			            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + conR + " de CON, §ee agora tem §c" + conSoma);
			            	PlayerPersisted.put("jrmcCnsI", (int)conSoma);
			            	manager.write(p, PlayerData);
			            	return true;
			            }
	
			            if(args[1].equalsIgnoreCase("wil")) {
			            	int wilSoma;
			            	wilSoma = wilR - adicao;
			            	if(wilSoma <= 1) {
			            		sender.sendMessage("§cIsso ultrapassa os stats minimos");
			            		return true;
			            	}
			            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + wilR + " de WIL, §ee agora tem §c" + wilSoma);
			            	PlayerPersisted.put("jrmcWilI", (int)wilSoma);
			            	manager.write(p, PlayerData);
			            	return true;
			            }
	
			            if(args[1].equalsIgnoreCase("mnd")) {
			            	int mndSoma;
			            	mndSoma = mndR - adicao;
			            	if(mndSoma <= 1) {
			            		sender.sendMessage("§cIsso ultrapassa os stats minimos");
			            		return true;
			            	}
			            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + mndR + " de MND, §ee agora tem §c" + mndSoma);
			            	PlayerPersisted.put("jrmcIntI", (int)mndSoma);
			            	manager.write(p, PlayerData);
			            	return true;
			            }
	
			            if(args[1].equalsIgnoreCase("spi")) {
			            	int spiSoma;
			            	spiSoma = spiR - adicao;
			            	if(spiSoma <= 1) {
			            		sender.sendMessage("§cIsso ultrapassa os stats minimos");
			            		return true;
			            	}
			            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + spiR + " de SPI, §ee agora tem §c" + spiSoma);
			            	PlayerPersisted.put("jrmcCncI", (int)spiSoma);
			            	manager.write(p, PlayerData);
			            	return true;
			            }
			            if(args[1].equalsIgnoreCase("all")) {
			            	Bukkit.dispatchCommand(p, "jrmca2 remove str " + args[2]);
			            	Bukkit.dispatchCommand(p, "jrmca2 remove dex " + args[2]);
			            	Bukkit.dispatchCommand(p, "jrmca2 remove con " + args[2]);
			            	Bukkit.dispatchCommand(p, "jrmca2 remove wil " + args[2]);
			            	Bukkit.dispatchCommand(p, "jrmca2 remove mnd " + args[2]);
			            	Bukkit.dispatchCommand(p, "jrmca2 remove spi " + args[2]);
			            	return true;
			            }
				}
					if (args.length == 4) {
							p = Bukkit.getPlayer(args[3]);
							int adicao = Integer.valueOf(args[2]);
							NBTManager manager = PowerNBT.getApi();
				            NBTCompound PlayerData = manager.read(p);
				            NBTCompound ForgeData = (NBTCompound)PlayerData.get("ForgeData");
				            NBTCompound PlayerPersisted = (NBTCompound)ForgeData.get("PlayerPersisted");
				            int strR = PlayerPersisted.getInt("jrmcStrI");
				            int dexR = PlayerPersisted.getInt("jrmcDexI");
				            int conR = PlayerPersisted.getInt("jrmcCnsI");
				            int wilR = PlayerPersisted.getInt("jrmcWilI");
				            int mndR = PlayerPersisted.getInt("jrmcIntI");
				            int spiR = PlayerPersisted.getInt("jrmcCncI");
				            
				            
				            if(args[1].equalsIgnoreCase("str")) {
				            	int strSoma;
				            	strSoma = strR - adicao;
				            	if(strSoma <= 1) {
				            		sender.sendMessage("§cIsso ultrapassa os stats minimos");
				            		return true;
				            	}
				            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + strR + " de STR, §ee agora tem §c" + strSoma);
				            	PlayerPersisted.put("jrmcStrI", (int)strSoma);
				            	manager.write(p, PlayerData);
				            	return true;
				            }
	
				            if(args[1].equalsIgnoreCase("dex")) {
				            	int dexSoma;
				            	dexSoma = dexR - adicao;
				            	if(dexSoma <= 1) {
				            		sender.sendMessage("§cIsso ultrapassa os stats minimos");
				            		return true;
				            	}
				            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + dexR + " de DEX, §ee agora tem §c" + dexSoma);
				            	PlayerPersisted.put("jrmcDexI", (int)dexSoma);
				            	manager.write(p, PlayerData);
				            	return true;
				            }
	
				            if(args[1].equalsIgnoreCase("con")) {
				            	int conSoma;
				            	conSoma = conR - adicao;
				            	if(conSoma <= 1) {
				            		sender.sendMessage("§cIsso ultrapassa os stats minimos");
				            		return true;
				            	}
				            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + conR + " de CON, §ee agora tem §c" + conSoma);
				            	PlayerPersisted.put("jrmcCnsI", (int)conSoma);
				            	manager.write(p, PlayerData);
				            	return true;
				            }
	
				            if(args[1].equalsIgnoreCase("wil")) {
				            	int wilSoma;
				            	wilSoma = wilR - adicao;
				            	if(wilSoma <= 1) {
				            		sender.sendMessage("§cIsso ultrapassa os stats minimos");
				            		return true;
				            	}
				            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + wilR + " de WIL, §ee agora tem §c" + wilSoma);
				            	PlayerPersisted.put("jrmcWilI", (int)wilSoma);
				            	manager.write(p, PlayerData);
				            	return true;
				            }
	
				            if(args[1].equalsIgnoreCase("mnd")) {
				            	int mndSoma;
				            	mndSoma = mndR - adicao;
				            	if(mndSoma <= 1) {
				            		sender.sendMessage("§cIsso ultrapassa os stats minimos");
				            		return true;
				            	}
				            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + mndR + " de MND, §ee agora tem §c" + mndSoma);
				            	PlayerPersisted.put("jrmcIntI", (int)mndSoma);
				            	manager.write(p, PlayerData);
				            	return true;
				            }
	
				            if(args[1].equalsIgnoreCase("spi")) {
				            	int spiSoma;
				            	spiSoma = spiR - adicao;
				            	if(spiSoma <= 1) {
				            		sender.sendMessage("§cIsso ultrapassa os stats minimos");
				            		return true;
				            	}
				            	sender.sendMessage("§f" + p.getName() + " §eTinha §c" + spiR + " de SPI, §ee agora tem §c" + spiSoma);
				            	PlayerPersisted.put("jrmcCncI", (int)spiSoma);
				            	manager.write(p, PlayerData);
				            	return true;
				            }
				            if(args[1].equalsIgnoreCase("all")) {
				            	Bukkit.dispatchCommand(p, "jrmca2 remove str " + args[2] + " " + args[3]);
				            	Bukkit.dispatchCommand(p, "jrmca2 remove dex " + args[2] + " " + args[3]);
				            	Bukkit.dispatchCommand(p, "jrmca2 remove con " + args[2] + " " + args[3]);
				            	Bukkit.dispatchCommand(p, "jrmca2 remove wil " + args[2] + " " + args[3]);
				            	Bukkit.dispatchCommand(p, "jrmca2 remove mnd " + args[2] + " " + args[3]);
				            	Bukkit.dispatchCommand(p, "jrmca2 remove spi " + args[2] + " " + args[3]);
				            	return true;
				            }
					}    
				}
				
			}
		}
		return false;
	}
	
	public static void SemPerm(CommandSender p) {
		p.sendMessage("§eComando disponível apenas para §c§lADMINS §eou superiores");
	}
	public static void Ajuda(CommandSender p) {
		p.sendMessage("§6§l[JRMCA2]§e§l----------------------------------§6§l[JRMCA2]");
		p.sendMessage("");
		p.sendMessage("§eOlá administrador, Tudo bem ?");
		p.sendMessage("§eAqui vai uma ajuda!");
		p.sendMessage("§eUtilize o comando nesse formato:");
		p.sendMessage("§9/Jrmca2 add/remove §a[nome:STR,DEX] §3[Stats] §5[Jogador]");
		p.sendMessage("§eVocê também pode usar all no lugar de STR, DEX, WIL");
		p.sendMessage("§6Qualquer dúvida, chame o dev desse plugin no discord");
		p.sendMessage("§9§lRafaelzin#0595");
		p.sendMessage("");
		p.sendMessage("§6§l[JRMCA2]§e§l----------------------------------§6§l[JRMCA2]");
	}
	
	
	

	
	
	
	
	
}

	
