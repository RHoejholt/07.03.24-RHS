import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customersList = new ArrayList<>();

        customersList.add(new Customer("John", "Doe", "john.doe"));
        customersList.add(new Customer("Jane", "Smith", "jane.smith"));

        Customer c1 = new Customer("Rasmus", "Sørensen", "raaanef");

        System.out.println(c1);

        printCustomers(customersList);
    }
    static void printCustomers (ArrayList<Customer> list){
        for (Customer i : list) {
            System.out.println(i);
        }
    }
}