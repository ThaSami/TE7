package com.te7;

import com.te7.builder.Builder;
import com.te7.builder.SimpleMapBuilder;
import com.te7.model.Map.GameMap;
import com.te7.model.items.Flashlight;
import com.te7.model.items.Item;
import com.te7.model.items.Key;
import com.te7.model.room.Direction;

import java.util.ArrayList;
import java.util.List;

public class GameBuilder {

  public static GameMap newMap(Builder builder) {
    builder.newMap();
    builder.buildLitRoom(1);
    builder.buildDarkRoom(2);

    List<Item> loot = new ArrayList<>();
    loot.add(new Key("Skull", 20));

    builder.buildMirror(1, new Direction(Direction.EAST), loot); //build mirror that has a lootable key in room 1

    builder.buildLockedDoor(1, new Direction(Direction.NORTH), 2, new Direction(Direction.SOUTH), "Skull"); //build locked in room 1,2 located NORTH in room 1, south in room2

    loot = new ArrayList<>();
    loot.add(new Flashlight());

    builder.buildUnlockedChest(1, 1, new Direction(Direction.WEST), loot);//build unlocked chest that has lootable flash light

    builder.buildSpecialDoor(2, new Direction(Direction.NORTH)); // build special exit door in room 2

    return builder.getMap();
  }

  public static void main(String[] args) {
    GameMap maze;
    Builder builder;

    builder = new SimpleMapBuilder();
    maze = newMap(builder);
    maze.setCurrentRoom(1);
  }
}
