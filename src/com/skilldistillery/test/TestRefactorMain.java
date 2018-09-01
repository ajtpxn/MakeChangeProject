package com.skilldistillery.test;

import java.util.Scanner;

public class TestRefactorMain {

	public static void main(String[] args) {
		
		Denomination twenties = new Denomination();
		Denomination tens = new Denomination();
		Denomination fives = new Denomination();
		Denomination ones = new Denomination();
		Denomination quarters = new Denomination();
		Denomination dimes = new Denomination();
		Denomination nickels = new Denomination();
		Denomination pennies = new Denomination();
		
		twenties.amount = 2000;
		tens.amount = 1000;
		fives.amount = 500;
		ones.amount = 100;
		quarters.amount = 25;
		dimes.amount = 10;
		nickels.amount = 5;
		pennies.amount = 1;
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello! How much is your purchase?");
		double price = 2.31;
//		price = scanner.nextDouble();
		System.out.println("My purchase costs $" + price + ".");
		double change = 0.0;
		int intChange=0;
		double payment = 0.0;
		
		boolean stay = true;
		while (stay) {
			
			System.out.println("How much are you paying?");
			payment = 32.31; //scanner.nextDouble();
			System.out.println("I am paying $" + payment + ".");
			change = 21.66;
			if (change == 0) {
				System.out.print("Thank you for the exact change! ");
				stay = false;
			}
			else if (change < 0) {
				System.out.println("Sorry, you owe more than that.");
			}
			else if (change >= 100) {
				System.out.println("Sorry, we don't make change for $100 or more.");
			}
			else {
				System.out.println("Thank you! Your change is $" + change + ".");
				change = change * 100;
				System.out.print("( The clerk hands you ");
				intChange = (int)change;
				System.out.println("intChange: " +intChange);
				stay = false;
				
				
				
				
				
				
				
				
			}
			
		}
		

	}

}
