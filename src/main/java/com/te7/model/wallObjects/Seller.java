package com.te7.model.wallObjects;

import com.te7.model.items.TradeAble;
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
