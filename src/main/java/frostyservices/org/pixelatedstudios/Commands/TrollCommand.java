package frostyservices.org.pixelatedstudios.Commands;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import frostyservices.org.pixelatedstudios.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.*;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class TrollCommand implements TabExecutor {

    private final Main main;

    public TrollCommand(Main main) {
        this.main = main;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        return null;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        if (randomNum == 1) {
            Player player = (Player) sender;
            Location loc = player.getLocation();
            for(int i = 0; i < 25; ++i)
                loc.getWorld().spawnEntity(loc, EntityType.CREEPER);
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aTroll #1"));
        }
        if (randomNum == 2) {
            Player player = (Player) sender;
            Location loc = player.getLocation();
            loc.setY(loc.getY() + 25);
            player.teleport(loc);
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bTroll #2"));
        }
        if (randomNum == 3) {
            Player player = (Player) sender;
            player.getWorld().strikeLightning(player.getLocation());
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cTroll #3"));
        }
        return true;
    }
}

