package com.te7.model;

import com.te7.model.item.Item;
import com.te7.model.room.Direction;
import com.te7.model.room.Room;
import lombok.Getter;
import lombok.Setter;

public class Navigator {
    @Setter
    @Getter
    private Collector player;
    @Setter
    @Getter
    private Direction direction;
    @Setter
    @Getter
    private Room currentRoom;
    @Getter
    public static Navigator instance = new Navigator();

    private Navigator() {
    }

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
