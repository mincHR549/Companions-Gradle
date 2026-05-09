package me.astero.companions.companiondata.packets;
import org.bukkit.entity.Player;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
public class CompanionPacket_1_16_R2 {
    private ArmorStand armorStand;
    public CompanionPacket_1_16_R2(String companionName, Location loc, String owner, String dataPath, String uuid, String slot) {}
    public void show(Player player) {}
    public void hide(Player player) {}
    public void update(Player player, String slot, String companionName, String dataPath) {}
    public void setSlot(int slot) {}
    public void updatePosition(float yaw, float pitch, Location origin, Player player, int property, String dataPath) {}
    public void remove(Player player) {}
    public void teleport(Location loc, Player player) {}
    public void headRotation(Player player, float yaw, float pitch) {}
}
