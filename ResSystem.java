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
public class ResSystem {
    static int startTime=1100;//starting time
	static int endTime=2200;//ending time
	
	
	public ResSystem(int startTime, int endTime) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
	}

    
    
        
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ResSystem res =new ResSystem(startTime, endTime);
	table table=new table();
        customer customer = new customer();
        
        
	
		
	        table.countAll();
		table.freeTable(12, 50);
		table.addTable(table);
		table.setSize(11);
		
		
        
        
    }
    
}
