package me.astero.companions.companiondata.packets;

import org.bukkit.entity.Player;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;

/**
 * Stub for 1.17 R1 - Mojang namespaced packets
 */
public class CompanionPacket_1_17_R1 {
    private ArmorStand armorStand;
    
    public CompanionPacket_1_17_R1(String companionName, Location loc, String owner, String dataPath, String uuid, String slot) {}
    public void show(Player player) {}
    public void hide(Player player) {}
    public void update(Player player, String slot, String companionName, String dataPath) {}
    public void setSlot(int slot) {}
    public void updatePosition(float yaw, float pitch, Location origin, Player player, int property, String dataPath) {}
    public void remove(Player player) {}
    public void teleport(Location loc, Player player) {}
    public void headRotation(Player player, float yaw, float pitch) {}
}
