package magazinepublishersubscriptionsapp;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author eleanornoonan
 */
public class MainTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        Data data1 = Data.getInstance();
        
        Customer c;
        
        int option;
        //I want to be able to program this menu differently in line with CRUD but still learning
        do {
            System.out.println("1. Create new Customer");
            System.out.println("2. Delete existing Customer");
            System.out.println("3. View all Customers");
            System.out.println("4. Update all Customers");
            System.out.println("5. Exit");
            System.out.println();

            System.out.print("Enter option: ");
            String line = keyboard.nextLine();
            option = Integer.parseInt(line);

            System.out.println("You chose option " + option);
            switch (option) {
                case 1: {
                    System.out.println("Creating a customer");
                    c = readCustomer(keyboard);
                    data1.addCustomer(c);
                    break;
                }
                case 2: {
                    System.out.println("Deleting a customer");
                    deleteCustomer(keyboard, data1);
                    break;
                }
                case 3: {
                    System.out.println("Viewing all customers");
                    viewCustomer(data1);
                    break;
                }
            }
        }
        while (option != 4);
        System.out.println("Goodbye");
    }
    
    private static Customer readCustomer(Scanner keyb) {
        String customerID, name, address, phone, email;
        int age;
        String line;

        customerID = getString(keyb, "Enter ID: ");
        name = getString(keyb, "Enter name: ");
        address = getString(keyb, "Enter address: ");
        phone = getString(keyb, "Enter phone: ");
        email = getString(keyb, "Enter email: ");
        line = getString(keyb, "Enter age: ");
        age = Integer.parseInt(line);
        

        Customer c = 
                new Customer(customerID, name, address, age, phone, email);
        
        return c;
    }
    
    private static void deleteCustomer(Scanner kb, Data data2) {
        System.out.print("Enter the ID of the customer to delete:");
        
        Customer c;

        c = data2.findCustomerByIdNumber(customerID);
        if (c != null) {
            if (data2.removeCustomer(c)) {
                System.out.println("Customer deleted");
            }
            else {
                System.out.println("Customer not deleted");
            }
        }
        else {
            System.out.println("Customer not found");
        }
    }
    
    private static void viewCustomer(Data data1) {
        List<Customer> customers = data1.getCustomers();
        for (Customer cr : customers) {
            System.out.println("Name: " + cr.getName());
        }
    }

    private static String getString(Scanner keyboard, String prompt) {
        System.out.print(prompt);
        return keyboard.nextLine();
    }
}
