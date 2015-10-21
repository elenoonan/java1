/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package magazinepublishersubscriptionsapp;

/**
 *
 * @author N00147653
 */
public class Customer {
    
        private String customerId;
        private String name;
        private String address;
        private int age;
        private String phone;
        private String email;
        
        

    public Customer(String customerId, String name, String address, int age, String phone, String email){
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }
/*Get Methods - Accessors*/
    public String getCustomerId(){
        return customerId;
    }
     public String getName(){
        return name;
    } 
     public String getAddress(){
        return address;
    } 
     public int getAge(){
        return age;
    } 
     public String getPhone(){
        return phone;
    } 
     public String getEmail(){
        return email;
    }
    
     
     
     
/*Set Methods - Mutators*/    
    public void setCustomerId(){
        this.customerId = customerId;
    }
    
    public void setName(){
        this.name = name;
    }
    
    public void setAddress(){
        this.address = address;
    }
    
    public void setAge(){
        this.age = age;
    }
    
    public void setPhone(){
        this.phone = phone;
    }
    
    public void setEmail(){
        this.email = email;
    }

    




}
