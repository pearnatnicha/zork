package io.muzoo.ssc.zork.map;

import io.muzoo.ssc.zork.map.rooms.Room;

public interface Maps {

//    public void createRoom();

    public String getExit();

    public String getItemName();

    public int getItemAttackpower();

    public Room getRoom();

    public void setItemToNull();

    public int getRoomNum(Room room);

    public boolean setNewRoom(String direction);
}
