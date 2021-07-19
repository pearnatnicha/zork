package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.items.Item;
import io.muzoo.ssc.zork.items.ItemFactory;

import java.util.List;

public class TakeCommand implements Command{
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
        return "take";
    }

    @Override
    public void execute(Game game, List<String> args) {
        Item item = ItemFactory.stringToItem(args.get(0));
        game.player.take(item);
        game.getOutput().println("picked " + args.get(0));
        game.setItemToNull();
    }
}
