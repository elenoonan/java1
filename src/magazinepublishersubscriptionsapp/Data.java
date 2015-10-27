package magazinepublishersubscriptionsapp;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

//the purpose of this DataModel is to build the data structure for the application

/**
 *
 * @author N00147653
 */


public class Data{

    private static Data instance = null;

    public static synchronized Data getInstance() {
        if (instance == null) {
            instance = new Data();
        }
        return instance;
    }
    
    private List<Customer> customers;
    
    private Data(){

    //public class Customer{
        //public static void main(String[] args){
            //ArrayList<Customer> customers = new ArrayList<Customer>();
    
        this.customers = new ArrayList<Customer>();
        
        customers.add(new Customer("1", "john smith", "123 apple grove", 35, "012321456", "johnsmith@apple.com"));
                
        customers.add(new Customer("2", "mary smith", "155 orange street", 25, "234567", "marysmith@apple.com"));  
        
        customers.add(new Customer("3", "henry eight", "213 kings street", 45, "4567834", "henry@court.com"));
        
        customers.add(new Customer ("4", "mary scott", "415 queens avenue", 30, "2343632", "maryqueen@court.com"));
    
    
    
    }
    public List<Customer>getCustomers(){
          return new ArrayList<Customer>(this.customers);
    }
    

    public void addCustomer(Customer c) {
        this.customers.add(c);
    }
    
    public boolean removeCustomer(Customer c) {
        return this.customers.remove(c);
    }

    public Customer findCustomerByIdNumber(String customerID) {
        Customer c = null;
        int i = 0;
        boolean found = false;
        while (i < this.customers.size() && !found) {
            c = this.customers.get(i);
            if (c.getCustomerId() .equals(customerID)){
                found = true;
            } else {
                i++;
            }
        }
        if (!found) {
            c = null;
        }
        return c;
    }
}

