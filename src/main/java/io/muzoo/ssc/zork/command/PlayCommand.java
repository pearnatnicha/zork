package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.map.Map1;
import io.muzoo.ssc.zork.map.Maps;

import java.util.List;

public class PlayCommand implements Command{


    @Override
    public int numArgs() {
        return 1;
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
    public void execute(Game game, List<String> args) {

        for (int i=0; i<args.size();i++){
            if (args.get(i).equals("Map1")){
                game.createMap(new Map1());
            }
        }
        game.setStart(true);
        game.getOutput().println("You are in front of the room");
    }
}
