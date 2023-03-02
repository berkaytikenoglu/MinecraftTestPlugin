package testplugin.test;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.List;


public class listener extends  commands implements  Listener {


    @EventHandler
    public void hareketetme(PlayerMoveEvent e) {
        Player player = e.getPlayer();
        player.sendMessage("Harekete edemezsin dayii");

        e.setCancelled(true);
    }



}
