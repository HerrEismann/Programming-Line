package de.cade.pool;

import org.bukkit.plugin.java.JavaPlugin;

public class Pool extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Plugin ist aktiviert");
    }

    @Override
    public void onLoad() {
        System.out.println("Plugin wurde geladen");
    }

    @Override
    public void onDisable() {
        System.out.println("Plugin ist deaktiviert");
    }

}
