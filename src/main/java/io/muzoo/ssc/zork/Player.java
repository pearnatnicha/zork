package io.muzoo.ssc.zork;


import io.muzoo.ssc.zork.items.Item;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public int HP;
    public int maxHP;
    public List<Item> bag = new ArrayList<>();

    public Player() {
        this.HP = 100;
        this.maxHP = 100;
    }
    // get items
    public void take(Item item){
        if (bag != null) {
            bag.add(item);
        }
    }




}
