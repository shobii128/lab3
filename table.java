/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ressystem;
import java.util.*;
import java.util.Enumeration;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shoaib
 */
public class table {
 protected long tableId;
protected int size;
public table() {
	super();
	}
public table(int size) 
{ this.size = size;}
public int getSize() 
{ return size; }

static final List<table> tables = new ArrayList<>();

List<Double> reservationDuration = new ArrayList<>();

public void addTable (table table) 
{
	if (tables!=null){
		tables.add(table);
		System.out.println("Table added in the reservation of "+table.getSize()+" customers");
}
}
public void removeTable (table table) 
{
	if (tables!=null){
		tables.remove(table);
		System.out.println("Table removed in the reservation of "+table.getSize()+" customers");
}
}

public List<table> freeTable(int time, int openfor){
	List<table> free = new ArrayList<>();
	free=(List<table>)free;
	for(double i=0;i>1100&&i<2200;i++){
		reservationDuration.add(i);
		reservationDuration.add(i+30);
	}
	return free; //returns all free tables available	
}
}



    

