package io.muzoo.ssc.zork.items;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ItemFactory {
    public static List<Item> itemList = new ArrayList<>();
    public ItemFactory(){
        itemList.add(new Item("sword",20));
        itemList.add(new Item("knife", 12));
        itemList.add(new Item("Axe", 15));
        itemList.add(new Item("rock", 10));
        itemList.add((new Item("crossbow", 15)));
    }

    public Item getItem(){
        Random random = new Random();
        int i = random.nextInt(5);
        return itemList.get(i);
    }

    public static Item stringToItem(String itemName){
        for (Item item : itemList){
            if (item.getItemName().equals(itemName)){
                return item;
            }
        }
        return null;
    }

}
