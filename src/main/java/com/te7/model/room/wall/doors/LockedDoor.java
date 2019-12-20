package com.te7.model.room.wall.doors;

import com.te7.model.item.Key;
import com.te7.model.room.Direction;
import com.te7.model.room.wall.Locked;
import lombok.Setter;

public class LockedDoor extends Door implements Locked {
    private boolean locked;
    @Setter
    private Key key;


    public LockedDoor() {
        this.locked = true;
    }

    @Override
    public boolean isLocked() {
        return locked;
    }

    @Override
    public String getKeyName() {
        return key.getName();
    }
}
