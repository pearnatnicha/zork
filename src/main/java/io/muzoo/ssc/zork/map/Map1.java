package io.muzoo.ssc.zork.map;

import io.muzoo.ssc.zork.map.rooms.Room;

import java.util.List;

public class Map1 {
    List<Room> roomList;
    public Map1() {
        roomList.add(new Room("room1"));
        roomList.add(new Room("room2"));
        roomList.add(new Room("room3"));
        roomList.add(new Room("room4"));
        roomList.add(new Room("exit"));

        roomList.get(0).setExit(null,roomList.get(2),roomList.get(1),null);
        roomList.get(1).setExit(null,roomList.get(3),null,roomList.get(0));
        roomList.get(2).setExit(roomList.get(0),null,null,null);
        roomList.get(3).setExit(roomList.get(1),null,roomList.get(4),null);

    }

}
