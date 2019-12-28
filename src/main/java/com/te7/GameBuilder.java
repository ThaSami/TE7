package com.te7;

import com.te7.builder.Builder;
import com.te7.builder.SimpleMapBuilder;
import com.te7.model.Map.GameMap;

public class GameBuilder {

    public static GameMap newMap(Builder builder) {
        builder.newMap();
        builder.buildLitRoom(1);


        return builder.getMap();
    }

    public static void main(String[] args) {
        GameMap maze;
        Builder builder;

        builder = new SimpleMapBuilder();
        maze = newMap(builder);
        maze.setCurrentRoom(1);
    }

}