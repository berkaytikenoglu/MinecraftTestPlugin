package testplugin.test;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    private static Test plugin;

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new listener(), this);
        plugin = this;
        commands komutlar = new commands();
        getCommand("rambo").setExecutor(komutlar);
        Bukkit.getLogger().info("Aktiff");

    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("DeAktif");
    }

    public static Test getPlugin(){
        return plugin;
    }

}
