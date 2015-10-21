package magazinepublishersubscriptionsapp;

import java.util.ArrayList;
import java.util.List;

//the purpose of this DataModel is to build the data structure for the application

/**
 *
 * @author N00147653
 */


public class DataModel {

    private static DataModel instance = null;

    public static synchronized DataModel getInstance() {
        if (instance == null) {
            instance = new DataModel();
        }
        return instance;
    }
    
    private List<Customer>customers;
    
    private DataModel(){
    
        this.customers = new ArrayList<Customer>();
        
        this.customers.add(
                new Customer("1", "john smith", "123 apple grove", 35, "012321456", "johnsmith@apple.com"));
                
        this.customers.add(
                new Customer("2", "mary smith", "155 orange street", 25, "234567", "marysmith@apple.com"));  
        
        this.customers.add(
                new Customer("3", "henry eight", "213 kings street", 45, "4567834", "henry@court.com"));
        
        this.cusotmers.add(
                new Customer ("4", "mary scott", "415 queens avenue", 30, "2343632", "maryqueen@court.com"));
    
    
    
    }


    
}
