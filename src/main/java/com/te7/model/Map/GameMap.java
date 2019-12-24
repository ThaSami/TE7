package com.te7.model.Map;

import com.te7.model.Navigator;
import com.te7.model.room.Room;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


public class GameMap {
    private List<Room>[] rooms;
    private Navigator nav;
    @Setter
    @Getter
    private int currentRoom;

    public GameMap(List<Room>[] rooms, Navigator nav) {
        this.rooms = rooms;
        this.nav = nav;
    }


}
