package me.astero.companionsapi.api;

import java.util.function.Consumer;
import org.bukkit.entity.Player;

public class CAPI {
    private static SpawnListener spawnListener = null;

    public static SpawnListener getSpawnListener() {
        return spawnListener;
    }

    public static void setSpawnListener(SpawnListener listener) {
        spawnListener = listener;
    }

    public static abstract class SpawnListener {
        public void onCompanionDespawn(Player p, String companionID) {}
        public void onCompanionSpawn(Player p, String companionID) {}
        public void onCompanionToggle(Player p, String companionID, boolean active) {}
        public void onCompanionDataLoad(Player p, String companionID) {}
        public void onCompanionDataSave(Player p, String companionID) {}
    }
}
