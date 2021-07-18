package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Game;

import java.util.List;

public class ExitCommand implements Command{

    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public int startedGame() {
        return 2;
    }

    @Override
    public String getCommand() {
        return "exit";
    }

    @Override
    public void execute(Game game, List<String> args, Boolean started) {
        game.getOutput().println("Game exit");
        game.exit();
    }
}
