package com.te7.model.room.wall;

import com.te7.model.item.TradeAble;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class Seller extends WallObject {
    @Getter
    private List<TradeAble> items;

    public void removeItem(TradeAble item) {
        items.remove(item);
    }

    public void addItem(TradeAble item) {
        items.add(item);
    }
}
