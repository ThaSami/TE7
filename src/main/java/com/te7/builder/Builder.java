package com.te7.builder;

import com.te7.model.Map.GameMap;
import com.te7.model.item.Item;
import com.te7.model.room.Direction;
import com.te7.model.room.wall.Mirror;

import java.util.List;

abstract public class Builder {

    private GameMap map;

    public abstract void buildLitRoom(int room);

    public abstract void buildDarkRoom(int room);

    public abstract void buildLockedDoor(int id, Direction room1Direction, int to, Direction room2Direction, String keyName);

    public abstract void buildUnlockedDoor(int id, int from, Direction room1Direction, int to, Direction room2Direction);

    public abstract void buildSpecialDoor(int id, int from, Direction room1Direction, int to, Direction room2Direction);

    public abstract void buildLockedChest(int id, int room, Direction lockedChestDirection, List<Item> items);

    public abstract void buildUnlockedChest(int id, int room, Direction unlockedChestDirection, List<Item> items);

    public abstract void buildMirror(int room, Direction mirrorDirection, List<Item> items);

    public abstract void buildPainting(int room, Direction mirrorDirection, List<Item> items);

    public abstract void buildSeller(int id, int room, Direction sellerDirection, List<Item> items);

    public abstract void connectDoors(int id, Direction room1Direction, int to, Direction room2Direction);

    public abstract GameMap getMap();

    public abstract void newMap();


}
