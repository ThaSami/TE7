package com.te7.Commands;

import com.te7.model.player.Navigator;

public class SwitchLights implements Command {
    private Navigator nav;

    public SwitchLights() {
        this.nav = Navigator.getInstance();
    }

    @Override
    public void execute() {
    }
}
