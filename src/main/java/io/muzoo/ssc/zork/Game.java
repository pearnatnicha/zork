package io.muzoo.ssc.zork;

import io.muzoo.ssc.zork.command.Command;

import java.util.List;
import java.util.Scanner;

public class Game {
    public Player player = new Player();

    public boolean started = false;

    private GameOutput output = new GameOutput();

    private CommandParser commandParser = new CommandParser();

    public void run(){
        while(true){
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            List<String> words = commandParser.parse(s);
            Command command = CommandFactory.get(words.get(0));
            if (command != null) {
                if (useCommand(command) == true){
                    command.execute(this, words.subList(1, words.size()));

                }
                else{
                    System.out.println("Unable to use this command");
                }
            }
        }
    }

    public boolean useCommand(Command eachCommand){
        if (getStart() == false && eachCommand.startedGame() == 1){
            return false;
        }else if (getStart() == true && eachCommand.startedGame() == 0){
//            System.out.println("Unable to use this command");
            return false;
        }else{
            return true;
        }
    }

    public boolean getStart(){
        return started;
    }

    public void setStart(boolean started){
        this.started = started;
    }

    public int getPlayerInfo(){
        return player.HP;
    }

    public GameOutput getOutput() {
        return output;
    }

    public void exit() {
        System.exit(0);
    }
}
