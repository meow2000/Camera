package main.java.hust.soict.hedspi.app;

import java.util.HashMap;
import java.util.Map;

import main.java.hust.soict.hedspi.model.room.Room;

public class App {
    
    public Map<Integer, Room> rooms = new HashMap<Integer, Room>();

    public Integer indexCount = 1;

    public Room currentRoom;

    public boolean running;
}
