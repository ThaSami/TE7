package com.te7.Commands;

import com.te7.model.player.Navigator;

public class Forward implements Command {
    private Navigator nav;

    public Forward() {
        this.nav = Navigator.getInstance();
    }

    @Override
    public void execute() {
    }
}
