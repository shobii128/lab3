/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ressystem;


/**
 *
 * @author Shoaib
 */
public class reservation {

protected long ReservationId;
protected table table;
protected customer customer;
protected int startTime;
protected int endTime;

public reservation(table table, customer customer, int startTime, int endTime) {
this.table = table;
this.customer = customer;
this.startTime = startTime;
this.endTime = endTime;
}

public table getTable() { return table;}
public int getstartTime() { return startTime;}
public int getendTime() { return endTime;}
}
    
    
    

