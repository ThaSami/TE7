package com.te7.model.builder;

import com.te7.model.item.Item;
import com.te7.model.item.Key;
import com.te7.model.room.Direction;
import com.te7.model.room.Room;
import com.te7.model.room.wall.WallObject;

import java.util.List;
import java.util.Map;

abstract public class MapBuilder {

    List<Room>[] rooms;

    public abstract void buildLitRoom(int room, Map<Direction, WallObject> decorations);

    public abstract void buildDarkRoom(int room, Map<Direction, WallObject> decorations);

    public abstract void buildLockedDoor(int id, String keyName);

    public abstract void buildUnlockedDoor(int id);

    public abstract void buildSpecialDoor(int id);

    public abstract void buildLockedChest(int id, String keyName, List<Item> items);

    public abstract void buildUnlockedChest(int id, String keyName, List<Item> items);

    public abstract void buildMirror(List<Item> items);

    public abstract void buildPainting(List<Item> items);

    public abstract void buildSeller(int id, List<Item> items);

    public abstract void connectDoors(int id, int from, int to);

}
