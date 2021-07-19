package io.muzoo.ssc.zork;

import io.muzoo.ssc.zork.command.Command;
import io.muzoo.ssc.zork.items.Item;
import io.muzoo.ssc.zork.map.Maps;
import io.muzoo.ssc.zork.map.rooms.Room;

import java.util.List;
import java.util.Scanner;

public class Game {
    public Player player = new Player();

    public boolean started = false;

    private GameOutput output = new GameOutput();

    private CommandParser commandParser = new CommandParser();

    private Maps maps;

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
    public String getExit(){
        return maps.getExit();
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

    public int getPlayerHPInfo(){
        return player.HP;
    }

    public int getPlayerMaxHPInfo(){
        return player.maxHP;
    }

    public void createMap(Maps maps){
        this.maps = maps;
    }

//    public int getMonsterInfo(){
//        return
//    }

    public GameOutput getOutput() {
        return output;
    }

    public String getItemName(){
        return maps.getItemName();
    }

    public int getItemAttackpower(){
        return maps.getItemAttackpower();
    }

//    public void take(String item){
//        player.take(item);
//    }

    public Room getRoom(){
        return maps.getRoom();
    }

    public void setItemToNull(){
        maps.setItemToNull();
    }


    public void exit() {
        System.exit(0);
    }
}
