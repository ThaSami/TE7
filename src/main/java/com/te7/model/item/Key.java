package com.te7.model.item;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Key extends Item implements TradeAble {
    @Getter
    private String name;

    @Override
    public double getPrice() {
        return 0;
    }
}
