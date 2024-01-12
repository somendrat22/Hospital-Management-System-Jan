package database;

import models.Room;

import java.util.HashMap;

public class RoomDatabase {
    HashMap<String, Room> roomDB;

    public RoomDatabase(){
        this.roomDB = new HashMap<>();
    }

    public Room getUnoccupiedRoom(){
        for(String key : roomDB.keySet()){
            Room room = roomDB.get(key);
            if(room.isOccupied() == false){
                return room;
            }
        }
        return null;
    }

    public int getTotalRooms(){
        return roomDB.size();
    }

    public void addRoomToDB(Room room){
        String roomId = room.getRoomId();
        roomDB.put(roomId, room);
    }

}
