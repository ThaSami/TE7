package com.te7.Commands;

import com.te7.model.item.TradeAble;
import com.te7.model.room.wall.Seller;

public class Buy implements Command {
    private Seller seller;
    private TradeAble item;

    public Buy(Seller seller, TradeAble item) {
        this.seller = seller;
        this.item = item;
    }

    @Override
    public void execute() {

    }
}
