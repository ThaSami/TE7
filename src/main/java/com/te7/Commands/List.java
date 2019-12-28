package com.te7.Commands;

import com.te7.model.item.TradeAble;
import com.te7.model.room.wall.Seller;

public class List implements Command {
    private Seller seller;

    public List(Seller seller, TradeAble item) {
        this.seller = seller;
    }

    @Override
    public void execute() {

    }
}
