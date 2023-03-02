package testplugin.test;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commands implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        Player oyuncu = (Player) sender;


        if (cmd.getName().equalsIgnoreCase("rambo")) {
            oyuncu.sendMessage("Ramazan");
        }


        return true;
    }

}
