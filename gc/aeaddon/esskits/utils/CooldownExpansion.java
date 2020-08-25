package gc.aeaddon.esskits.utils;

import gc.aeaddon.esskits.Core;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;

public class CooldownExpansion extends PlaceholderExpansion {

    @Override
    public String getIdentifier() {
        return "cooldown";
    }

    @Override
    public String getAuthor() {
        return "";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public String onRequest(OfflinePlayer player, String identifier) {
        try {
            return Core.getKitsManager().getCooldownMessage(player.getUniqueId(), identifier);
        } catch (Exception e) {
            return "";
        }
    }


}
