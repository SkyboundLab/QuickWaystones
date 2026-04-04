package fun.pozzoo.quickwaystones.data;

import fun.pozzoo.quickwaystones.QuickWaystones;
import org.bukkit.Location;

import java.util.UUID;

public class WaystoneData {
    private final String id;
    private String name;
    private final UUID owner;
    private final Location location;

    public WaystoneData(Location location, UUID owner) {
        id = UUID.randomUUID().toString();
        name = "Waystone " + QuickWaystones.getAndIncrementLastWaystoneID();
        this.location = location;
        this.owner = owner;
    }
    public WaystoneData(String name, Location location, UUID owner) {
        id = UUID.randomUUID().toString();
        this.name = name;
        this.location = location;
        this.owner = owner;
    }
    public WaystoneData(String id, String name, Location location, UUID owner) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getOwner() {
        return owner;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "WaystoneData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location=" + location +
                ", owner='" + owner + '\'' +
                '}';
    }
}
