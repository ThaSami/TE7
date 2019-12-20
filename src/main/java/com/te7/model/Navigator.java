package com.te7.model;

import com.te7.model.item.Item;
import com.te7.model.room.Direction;
import com.te7.model.room.Room;

public class Navigator {
    private Collector player;
    private Direction direction;
    private Room room;

    public void onCollect(Item item) {
        player.collect(item);
    }

    private void goRight() {
        direction.goRight();
    }

    private void goLeft() {
        direction.goLeft();
    }


}
