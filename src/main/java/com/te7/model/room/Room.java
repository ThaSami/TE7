package com.te7.model.room;

import com.te7.model.Identifiable;
import com.te7.model.wallObjects.WallObject;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

public class Room implements Identifiable {
    @Getter
    @Setter
    boolean isLit;
    private Map<Direction, WallObject> decrorations;
    @Getter
    private String id;

    public Room(boolean isLit) {
        decrorations = new HashMap<>();
        this.isLit = isLit;
    }

    private boolean checkIfWallIsEmpty(Direction direction) {
        return !this.decrorations.containsKey(direction);
    }

    public void setSide(Direction direction, WallObject wallObject) {
        if (checkIfWallIsEmpty(direction)) {
            this.decrorations.put(direction, wallObject);
        }
    }

    public WallObject getSide(Direction direction) {
        return null;
    }
}
