package com.te7.builder;

import com.te7.model.Map.GameMap;

public class MapBuilder extends Builder {

    private GameMap map;

    @Override
    public void buildLitRoom(int room) {

    }

    @Override
    public void buildDarkRoom(int room) {

    }

    @Override
    public void buildLockedDoor(int id, String keyName) {

    }

    @Override
    public void buildUnlockedDoor(int id) {

    }

    @Override
    public void buildSpecialDoor(int id) {

    }

    @Override
    public void buildLockedChest(int id) {

    }

    @Override
    public void buildUnlockedChest(int id) {

    }

    @Override
    public void buildMirror() {

    }

    @Override
    public void buildPainting() {

    }

    @Override
    public void buildSeller(int id) {

    }

    @Override
    public void connectDoors(int id, int from, int to) {

    }

    @Override
    public GameMap getMap() {
        return map;
    }

    @Override
    public void newMap() {

    }
}
