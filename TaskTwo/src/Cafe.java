import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<>();

    public Cafe() {

    }

    public void getCoffeeMenu (){
        for (String c: this.coffeeMenu)
            System.out.println(c);
    }


    public void loadMenuData() {
        File file = new File("C:\\Users\\ranef\\IdeaProjects\\TaskTwo\\src\\coffees.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                coffeeMenu.add(data);
            }
        } catch (FileNotFoundException e) {

            System.out.println("File not found. Check path and filename");

        }

    }

}
