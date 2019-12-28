package com.te7.model.item;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Flashlight extends Item implements TradeAble {

    @Getter
    @Setter
    boolean isOn;


    @Override
    public double getPrice() {
        return Prices.FLASH_LIGHT;
    }


}
