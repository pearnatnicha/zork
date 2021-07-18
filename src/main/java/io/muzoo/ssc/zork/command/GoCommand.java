package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Game;

import java.util.List;

public class GoCommand implements Command{
    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public int startedGame() {
        return 1;
    }

    @Override
    public String getCommand() {
        return "go";
    }

    @Override
    public void execute(Game game, List<String> args) {
        //if next room exist
        game.getOutput().println("enter room...");
        // else
        game.getOutput().println("no room exist");
    }
}
