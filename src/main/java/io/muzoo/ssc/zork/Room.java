package io.muzoo.ssc.zork;

public class Room {
    private String roomName;

    public Room(String roomName){
        this.roomName = roomName;
    }

    public void setExit(Room north, Room south, Room east, Room west){
        String[] directions = new String[]{"north", "south", "east", "west"};

    }
}
