package com.te7.Commands;

import com.te7.model.Navigator;
import com.te7.model.item.Key;

public class UseKey implements Command {
    private Navigator nav;
    private Key key;

    public UseKey(Key key) {
        this.nav = Navigator.getInstance();
        this.key = key;
    }

    @Override
    public void execute() {

    }
}
