package com.te7.model.room.wall.chests;

public class UnlockedChest extends Chest {

    @Override
    public boolean isLocked() {
        return false;
    }
}
