package io.muzoo.ssc.zork.map;

import io.muzoo.ssc.zork.map.rooms.Room;

import java.util.ArrayList;
import java.util.List;

public class Map1 implements Maps{
    List<Room> roomList = new ArrayList<>();
    int currentIndex;
    public Map1() {
        currentIndex = 0;
        roomList.add(new Room("room1"));
        roomList.add(new Room("room2"));
        roomList.add(new Room("room3"));
        roomList.add(new Room("room4"));
        roomList.add(new Room("exit"));

        roomList.get(0).setExit(null,roomList.get(2),roomList.get(1),null);
        roomList.get(1).setExit(null,roomList.get(3),null,roomList.get(0));
        roomList.get(2).setExit(roomList.get(0),null,null,null);
        roomList.get(3).setExit(roomList.get(1),null,roomList.get(4),null);
        roomList.get(4).setExit(null,null,null,null);

    }

    @Override
    public String getExit(){
        return roomList.get(currentIndex).getExit();
    }

    @Override
    public String getItemName(){
        return roomList.get(currentIndex).getItemName();
    }

    @Override
    public int getItemAttackpower() {
        return roomList.get(currentIndex).getItemAttackpower();
    }

    @Override
    public Room getRoom(){
        return roomList.get(currentIndex);
    }

    @Override
    public void setItemToNull() {
        roomList.get(currentIndex).setItemToNull();
    }

    @Override
    public int getRoomNum(Room room){
        int roomNum = Integer.parseInt(room.getRoomName().substring(room.getRoomName().length() - 1));
        return roomNum - 1;
    }

    @Override
    public boolean setNewRoom(String direction){
        if (direction.equals("North") && (roomList.get(currentIndex).directions[0] != null)){
            currentIndex = getRoomNum(roomList.get(currentIndex).directions[0]);
        }
        else if (direction.equals("South") && (roomList.get(currentIndex).directions[1] != null)){
            currentIndex = getRoomNum(roomList.get(currentIndex).directions[1]);
        }
        else if (direction.equals("East") && (roomList.get(currentIndex).directions[2] != null)){
            currentIndex = getRoomNum(roomList.get(currentIndex).directions[2]);
        }
        else if (direction.equals("West") && (roomList.get(currentIndex).directions[3] != null)){
            currentIndex = getRoomNum(roomList.get(currentIndex).directions[3]);
        }else{
            return false;
        }
        return true;
    }

}
