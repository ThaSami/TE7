package com.te7.model;

import com.te7.model.item.Gold;
import com.te7.model.item.Item;

import java.util.List;

public class Player implements Collector {
    private List<Item> items;
    private Gold goldAmount;


    @Override
    public void collect(Item item) {

    }
}
