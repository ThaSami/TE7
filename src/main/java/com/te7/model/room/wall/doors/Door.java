package com.te7.model.room.wall.doors;

import com.te7.model.Identifiable;
import com.te7.model.room.wall.Lockable;
import com.te7.model.room.wall.WallObject;
import lombok.Getter;
import lombok.Setter;

public abstract class Door extends WallObject implements Lockable, Identifiable {
    @Setter
    @Getter
    private String id;
}
