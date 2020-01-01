package com.te7.builder;

import com.te7.model.Map.GameMap;
import com.te7.model.items.Item;
import com.te7.model.room.Direction;

import java.util.List;

public class SimpleMapBuilder implements Builder {

  private GameMap map;

  @Override
  public void buildLitRoom(int room) {
  }

  @Override
  public void buildDarkRoom(int room) {
  }

  @Override
  public void buildLockedDoor(
          int id, Direction room1Direction, int to, Direction room2Direction, String keyName) {
  }

  @Override
  public void buildUnlockedDoor(
          int id, int from, Direction room1Direction, int to, Direction room2Direction) {
  }

  @Override
  public void buildSpecialDoor(
          int id, int from, Direction room1Direction) {
  }

  @Override
  public void buildLockedChest(
          int id, int room, Direction lockedChestDirection, List<Item> items) {
  }

  @Override
  public void buildUnlockedChest(
          int id, int room, Direction unlockedChestDirection, List<Item> items) {
  }

  @Override
  public void buildMirror(int room, Direction mirrorDirection, List<Item> items) {
  }

  @Override
  public void buildPainting(int room, Direction mirrorDirection, List<Item> items) {
  }

  @Override
  public void buildSeller(int id, int room, Direction sellerDirection, List<Item> items) {
  }

  @Override
  public GameMap getMap() {
    return null;
  }

  @Override
  public void newMap() {
  }
}
