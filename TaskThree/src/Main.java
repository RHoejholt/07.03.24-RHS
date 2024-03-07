import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //private int countLampsInBuilding(Building);
        List<Room> rooms = new ArrayList<>();

        Room r1 = new Room(14, 24, 23);
        Room r2 = new Room(1, 2, 3);
        Room r3 = new Room(4, 5, 6);

        Building b1 = new Building(rooms, 1, 2, false);

        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);


        System.out.println("How many lamps does the building have? " + countLampsInBuilding(b1));
        System.out.println("Is it odd? "  + isNormal(b1));
    }

    public static int countLampsInBuilding(Building b) {
        int totalLamps = 0;
        for (Room r : b.getRooms()) {
            totalLamps += r.getNumberOfLamps();
        }
        return totalLamps;
    }

    public static boolean isNormal(Building b) {
        if (b.getNumberOfFloors() > b.getRooms().size()) {
            return true;
        } else {
            return false;
        }
    }
}



