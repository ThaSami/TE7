package com.te7.model.wallObjects.doors;

import com.te7.model.Identifiable;
import com.te7.model.room.Room;
import com.te7.model.wallObjects.Lockable;
import com.te7.model.wallObjects.WallObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public abstract class Door extends WallObject implements Lockable, Identifiable {

    @Getter
    @Setter
    private String id;
    private Room room1;
    private Room room2;
    @Getter
    @Setter
    private boolean isOpen;
}
