package com.te7.Commands;

import com.te7.model.Navigator;

public class GoLeft implements Command {
    private Navigator nav;

    public GoLeft() {
        this.nav = Navigator.getInstance();
    }

    @Override
    public void execute() {

    }
}
