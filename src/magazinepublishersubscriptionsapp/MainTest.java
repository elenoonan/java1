package magazinepublishersubscriptionsapp;
//import java.util.Scanner;
//import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author N00147653
 */
public class MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Data d1 = Data.getInstance();
        
        List<Customer>customers = d1.getCustomers();
        
        for(int i=0; i<customers.size(); i++){
            System.out.println(customers.get(i).toString());
        }
    }
}
