package com.te7.Commands;

import com.te7.model.items.TradeAble;
import com.te7.model.wallObjects.Seller;

public class Sell implements Command {
    private Seller seller;
    private TradeAble item;

    public Sell() {
    }

    @Override
    public void execute() {
    }
}
