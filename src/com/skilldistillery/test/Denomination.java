package com.skilldistillery.test;

public class Denomination {
	
	public Denomination(String x, String y, int z) { //Constructor
		singular = x;
		plural = y;
		value = z;
	}
	
	public String singular; //twenty through penny
	
	public String plural;  //twenties through pennies
	
	public int value; //2000 through 1
	
}
