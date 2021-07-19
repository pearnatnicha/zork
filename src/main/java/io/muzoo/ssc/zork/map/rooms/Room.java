package io.muzoo.ssc.zork.map.rooms;

import io.muzoo.ssc.zork.Monster;
import io.muzoo.ssc.zork.items.Item;
import io.muzoo.ssc.zork.items.ItemFactory;

import java.util.ArrayList;

public class Room {
    private String roomName;
    private Monster monster;
    public Room[] directions;
    private Item item;

    public Room(String roomName){
        this.roomName = roomName;
        monster = new Monster();
        ItemFactory items = new ItemFactory();
        item = items.getItem();
    }

    public int monsterHP(){
        return monster.getMonsterHP();
    }

    public void setExit(Room north, Room south, Room east, Room west){
        directions = new Room[]{north, south, east, west};

    }

    public String getExit(){
        String exit = "";
        if (directions[0] != null){
            exit += "North ";
        }if (directions[1] != null){
            exit += "South ";
        }
        if (directions[2] != null){
            exit += "East ";
        }
        if (directions[3] != null){
            exit += "West ";
        }
        return exit;
    }

    public String getItemName(){
        if (item != null){
            return item.getItemName();
        }
        return null;
    }

    public int getItemAttackpower(){
        if (item != null){
            return item.attackPower();
        }
        return 0;
    }

    public void setItemToNull(){
        item = null;
    }

    public String getRoomName(){
        return roomName;
    }

}
