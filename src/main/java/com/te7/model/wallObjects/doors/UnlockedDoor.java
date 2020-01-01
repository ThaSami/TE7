package com.te7.model.wallObjects.doors;

import com.te7.model.room.Room;

public class UnlockedDoor extends Door {

    public UnlockedDoor(String id, Room from, com.te7.model.room.Room to) {
        super(id, from, to, false);
    }

    @Override
    public boolean isLocked() {
        return false;
    }
}
