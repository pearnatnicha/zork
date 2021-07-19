package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.Player;
import io.muzoo.ssc.zork.items.Item;
import io.muzoo.ssc.zork.items.ItemFactory;

import java.util.List;

public class InfoCommand implements Command{
    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public int startedGame() {
        return 1;
    }

    @Override
    public String getCommand() {
        return "info";
    }

    @Override
    public void execute(Game game, List<String> args) {
        game.getOutput().println("Player HP Max: " + Integer.toString(game.getPlayerMaxHPInfo()));
        game.getOutput().println("Player HP: " + Integer.toString(game.getPlayerHPInfo()));
        if (game.getItemName() != null){
            game.getOutput().println("Item Provided : " + game.getItemName() + " with " + game.getItemAttackpower() + " Attack Power");
        }

        String exit = game.getExit();
        game.getOutput().println("Doors: " + exit);
    }
}
