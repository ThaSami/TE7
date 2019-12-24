package com.te7.model.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Key extends Item implements TradeAble {
    @Getter
    private String name;
    @Getter
    private double Price;


}
