package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Game;

import java.util.List;

public class PlayCommand implements Command{


    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public int startedGame() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "play";
    }

    @Override
    public void execute(Game game, List<String> args, Boolean started) {
        game.getOutput().println("You are in front of the room");
    }
}
