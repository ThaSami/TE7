package com.te7.Commands;

import com.te7.model.Navigator;

import java.util.ArrayList;
import java.util.List;

public class Trade implements Command {
    private Navigator nav;
    private List<Command> subCommands;
    //TODO check if i need items in sellCommand.

    public Trade() {
        this.nav = Navigator.getInstance();
        this.subCommands = new ArrayList<>();
    }

    private void addSubCommand(Command subCommand) {
        this.subCommands.add(subCommand);
    }

    @Override
    public void execute() {

    }
}
