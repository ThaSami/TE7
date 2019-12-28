package com.te7.Commands;

import com.te7.model.Navigator;

public class Backward implements Command {
    private Navigator nav;

    public Backward() {
        this.nav = Navigator.getInstance();
    }

    @Override
    public void execute() {

    }
}
