import java.util.ArrayList;
import java.util.List;
public class Building {
    private List<Room> rooms = new ArrayList<>();
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;



    public Building(List<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding){
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public void addRoom(Room room){
        rooms.add(room);
    }
    public List<Room> getRooms() {
        return rooms;
    }



    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public boolean isOfficeBuilding(){
        return isOfficeBuilding;
    }
}
