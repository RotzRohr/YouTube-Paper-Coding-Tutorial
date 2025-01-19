package de.linushuck.helloWorld;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class HelloWorld extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Hello World onEnable");
        getCommand("hello").setExecutor((commandSender, command, s, strings) -> {
            Player player = (Player) commandSender;
            String nameOfPlayer = player.getName();
            player.sendMessage("Hello " + nameOfPlayer + "!");
            return true;
        });
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Hello World onDisable");
    }
}
