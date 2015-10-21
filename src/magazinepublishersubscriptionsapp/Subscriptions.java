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
public class Subscriptions {
    
    private String customerId;
    private String magazineId;
    private String startDate;
    private String endDate;
    

public Subscriptions(String customerId, String magazineId, String startDate, String endDate){
        this.customerId = customerId;
        this.magazineId = magazineId;
        this.startDate = startDate;
        this.endDate = endDate;
}

/*Get Methods - Accessors*/
public String getCustomerId(){
    return customerId;
}

public String getMagazineId(){
    return magazineId;
}
public String getStartDate(){
    return startDate;
}
public String getEndDate(){
    return endDate;
}

/*Set Methods - Mutators*/
public void setCustomerId(){
    this.customerId = customerId;
}

public void setMagazineId(){
    this.magazineId = magazineId;
}

public void setStartDate(){
    this.startDate = startDate;
}

public void setEndDate(){
    this.endDate = endDate;
}




}
