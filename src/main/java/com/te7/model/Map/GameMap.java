package com.te7.model.Map;

import com.te7.model.player.Navigator;
import com.te7.model.room.Room;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class GameMap {
  @Getter
  private List<Room> rooms;
  @Setter
  @Getter
  private Navigator nav;
  @Getter
  @Setter
  private int navCurrRoom;

  public GameMap() {
  }


  public void addRoom(Room room) {
  }

  public Room findRoom(int id) {
    return null;
  }

  public void setCurrentRoom(int id) {
  }
}
