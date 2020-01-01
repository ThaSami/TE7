package com.te7.model.wallObjects.doors;

import com.te7.model.items.Key;
import com.te7.model.room.Room;
import com.te7.model.wallObjects.Locked;
import lombok.Setter;

public class LockedDoor extends Door implements Locked {
    private boolean locked;
    @Setter
    private Key key;

    public LockedDoor(String id, Room from, Room to, Key key) {
        super(id, from, to, false);
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
