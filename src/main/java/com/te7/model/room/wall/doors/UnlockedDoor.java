package com.te7.model.room.wall.doors;

import com.te7.model.room.Direction;

public class UnlockedDoor extends Door {

    @Override
    public boolean isLocked() {
        return false;
    }
}
