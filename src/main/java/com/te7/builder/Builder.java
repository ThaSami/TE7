package com.te7.builder;

import com.te7.model.Map.GameMap;
import com.te7.model.items.Item;
import com.te7.model.room.Direction;

import java.util.List;

public interface Builder {

  void buildLitRoom(int room);

  void buildDarkRoom(int room);

  void buildLockedDoor(int id, Direction room1Direction, int to, Direction room2Direction, String keyName);

  void buildUnlockedDoor(int id, int from, Direction room1Direction, int to, Direction room2Direction);

  void buildSpecialDoor(int id, int from, Direction room1Direction);

  void buildLockedChest(int id, int room, Direction lockedChestDirection, List<Item> items);

  void buildUnlockedChest(int id, int room, Direction unlockedChestDirection, List<Item> items);

  void buildMirror(int room, Direction mirrorDirection, List<Item> items);

  void buildPainting(int room, Direction mirrorDirection, List<Item> items);

  void buildSeller(int id, int room, Direction sellerDirection, List<Item> items);

  GameMap getMap();

  void newMap();
}
