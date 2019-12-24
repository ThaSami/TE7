package com.te7.builder;

import com.te7.model.Map.GameMap;

abstract public class Builder {

    private GameMap map;

    public abstract void buildLitRoom(int room);

    public abstract void buildDarkRoom(int room);

    public abstract void buildLockedDoor(int id, String keyName);

    public abstract void buildUnlockedDoor(int id);

    public abstract void buildSpecialDoor(int id);

    public abstract void buildLockedChest(int id);

    public abstract void buildUnlockedChest(int id);

    public abstract void buildMirror();

    public abstract void buildPainting();

    public abstract void buildSeller(int id);

    public abstract void connectDoors(int id, int from, int to);

    public abstract GameMap getMap();

    public abstract void newMap();


}
