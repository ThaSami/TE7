package com.te7.model.room;

import com.sun.org.apache.xpath.internal.functions.Function;
import com.te7.model.Identifiable;
import com.te7.model.room.wall.WallObject;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class Room implements Identifiable {
  private Map<Direction, WallObject> decrorations;

  @Getter
  private String id;

  public Room() {
    decrorations = new HashMap<>();
  }

  public void addDecoration(Direction direction, WallObject wallObject) {
    if (checkIfWallIsEmpty(direction)) {
      this.decrorations.put(direction, wallObject);
    }
  }

  private boolean checkIfWallIsEmpty(Direction direction) {
    return !this.decrorations.containsKey(direction);
  }
}
