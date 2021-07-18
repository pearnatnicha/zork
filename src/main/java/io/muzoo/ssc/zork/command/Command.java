package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Game;

import java.util.List;

public interface Command {

    int numArgs();

    int startedGame(); // 0=before play, 1=after play, 2=both, 3=none

    String getCommand();

    void execute(Game game, List<String> args, Boolean started);
}
