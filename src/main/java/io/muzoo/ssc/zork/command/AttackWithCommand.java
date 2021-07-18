package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Game;

import java.util.List;

public class AttackWithCommand implements Command{
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
        return "attack with";
    }

    @Override
    public void execute(Game game, List<String> args) {
        game.getOutput().println("damage monster: HP -...");
    }
}
