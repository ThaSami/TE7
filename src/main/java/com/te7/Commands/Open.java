package com.te7.Commands;

import com.te7.model.Navigator;

public class Open implements Command {
    private Navigator nav;

    public Open() {
        this.nav = Navigator.getInstance();
    }

    @Override
    public void execute() {

    }
}
