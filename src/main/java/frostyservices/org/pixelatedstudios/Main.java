package frostyservices.org.pixelatedstudios;

import frostyservices.org.pixelatedstudios.Commands.TrollCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("troll").setExecutor(new TrollCommand(this));
        getLogger().info("PixelatedStudios plugin has enabled.");

    }

    @Override
    public void onDisable() {
        getLogger().info("PixelatedStudios plugin has enabled.");
    }
}
