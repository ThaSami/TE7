package com.te7.Commands;

import com.te7.model.Navigator;

public class GoRight implements Command {
    private Navigator nav;

    public GoRight() {
        this.nav = Navigator.getInstance();
    }

    @Override
    public void execute() {

    }
}
