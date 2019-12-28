package com.te7.model.Map;

import com.te7.model.Navigator;
import com.te7.model.room.Room;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;


public class GameMap {
    private List<Room>[] rooms;
    @Setter
    @Getter
    private Navigator nav;
    int numOfRooms;

    @Getter
    @Setter
    private int currentRoom;

    public GameMap(int numOfRooms) {
        this.rooms = (ArrayList[]) new ArrayList[numOfRooms];
        for (int k = 0; k < numOfRooms; k++)
            rooms[k] = new ArrayList<Room>();
    }

    public List<Room>[] getRooms() {
        return this.rooms;
    }

    public void addRoom(Room room) {

    }


}
