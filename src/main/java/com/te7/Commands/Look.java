package com.te7.Commands;

import com.te7.model.Navigator;

public class Look implements Command {
    private Navigator nav;

    public Look() {
        this.nav = Navigator.getInstance();
    }

    @Override
    public void execute() {

    }
}
