package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.CommandFactory;
import io.muzoo.ssc.zork.Game;

import java.util.List;

public class HelpCommand implements Command{


    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public int startedGame() {
        return 3;
    }

    @Override
    public String getCommand() {
        return "help";
    }

    @Override
    public void execute(Game game, List<String> args, Boolean started) {
        for (int i=0; i<CommandFactory.getAllCommands().size(); i++){
            String eachStringCommand = CommandFactory.getAllCommands().get(i);
            Command eachCommand = CommandFactory.get(eachStringCommand);
            if (started == false && (eachCommand.startedGame() == 0 || eachCommand.startedGame() == 2)){
                game.getOutput().println(eachStringCommand);
            }else if (started == true && (eachCommand.startedGame() == 1 || eachCommand.startedGame() == 2)){
                game.getOutput().println(eachStringCommand);
            }


        }
    }

}
