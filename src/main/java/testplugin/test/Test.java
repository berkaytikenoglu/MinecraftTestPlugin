package testplugin.test;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new listener(), this);

        commands komutlar = new commands();

        getCommand("rambo").setExecutor(komutlar);
    }

    @Override
    public void onDisable() {

    }
}
