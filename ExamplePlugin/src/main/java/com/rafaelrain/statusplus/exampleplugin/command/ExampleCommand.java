package com.rafaelrain.statusplus.exampleplugin.command;

import com.rafaelrain.statusplus.core.api.StatusAPI;
import com.rafaelrain.statusplus.core.status.StatusType;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ExampleCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Pegar STR do player
        if (args.length == 0) {
            if (sender instanceof Player) {
                Player player = ((Player) sender);
                int str = StatusAPI.getStatus(player, StatusType.STR);
                sender.sendMessage("Você tem " + str + " de STR");
                return true;
            }
        }
        if (args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if (target == null) {
                sender.sendMessage("Este player não está online");
                return true;
            }
            int str = StatusAPI.getStatus(target, StatusType.STR);
            sender.sendMessage(target.getDisplayName() + " Tem " + str + " de STR");
        }
        return false;
    }
}
