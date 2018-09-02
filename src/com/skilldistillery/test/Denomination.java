package com.skilldistillery.test;

public class Denomination {
	
	public int amount;
	
	public int value;
	
	public boolean last;
	
	public boolean isZero;
	
	public int number;
	
	public void printDenom() {
		System.out.println();
	}
	
	public void printAnd() {
		if (last) {
			System.out.println("and ");
		}
	}
	
}
