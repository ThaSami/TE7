package com.te7.model.room.wall.chests;

import com.te7.model.item.Key;
import com.te7.model.room.wall.Locked;
import lombok.Getter;
import lombok.Setter;

public class LockedChest extends Chest implements Locked {
    @Setter
    @Getter
    private boolean locked;
    @Setter
    @Getter
    private Key key;

    public LockedChest() {
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
