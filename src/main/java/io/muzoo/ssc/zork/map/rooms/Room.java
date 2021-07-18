package io.muzoo.ssc.zork.map.rooms;

import io.muzoo.ssc.zork.Monster;

import java.util.ArrayList;

public class Room {
    private String roomName;
    private Monster monster;
    public Room[] directions;

    public Room(String roomName){
        this.roomName = roomName;
        monster = new Monster();

    }

    public int monsterHP(){
        return monster.getMonsterHP();
    }

    public void setExit(Room north, Room south, Room east, Room west){
        directions = new Room[]{north, south, east, west};

    }


}
