package com.te7.Commands;

import com.te7.model.Navigator;

public class Check implements Command {
    private Navigator nav;

    public Check() {
        this.nav = Navigator.getInstance();
    }

    @Override
    public void execute() {

    }
}
