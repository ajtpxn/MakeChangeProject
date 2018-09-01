package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeObject {
	
	
	public void change() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello! How much is your purchase?");
		double price;
		price = scanner.nextDouble();
//		price = 2.26;
		System.out.println("My purchase costs $" + price + ".");
		System.out.println("How much are you paying?");
		double payment = scanner.nextDouble();
		System.out.println("I am paying $" + payment + ".");
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int ones=0;
		int quarters=0;
		int dimes=0;
		int nickles=0;
		int pennies=0;
		double change = 0.0;
		change = payment - price;
		System.out.println("Thank you! Your change is $" + change + ".");
		change = change * 100;
		int intChange;
		intChange = (int)change;
		twenties = intChange / 2000;
		intChange = intChange - 2000*twenties;
		tens = intChange / 1000;
		intChange = intChange - 1000*tens;
		fives = intChange / 500;
		intChange = intChange - 500*fives;
		ones = intChange / 100;
		intChange = intChange - 100*ones;
		quarters = intChange / 25;
		intChange = intChange - 25*quarters;
		dimes = intChange / 10;
		intChange = intChange - 10*dimes;
		nickles = intChange / 5;
		intChange = intChange - 5*nickles;
		pennies = intChange / 1;
		intChange = intChange - 1*pennies;
		
		
		
		
		
		System.out.println("(The clerk hands you " + twenties + " twenty(ies) "  + tens + " ten(s) " + fives + " five(s) " 
													+ ones + " ones(s)\n" + quarters + " quarter(s) " + dimes 
													+ " dime(s) " + nickles + " nickle(s) " + pennies + " pennie(s).)");
		
		
	}
	
	public void print(double dollars) {
		System.out.println(dollars);
	}

}
