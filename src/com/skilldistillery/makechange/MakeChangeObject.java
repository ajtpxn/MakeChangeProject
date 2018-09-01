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
		double change = 0.0;
		int escape = 1;
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int ones=0;
		int quarters=0;
		int dimes=0;
		int nickles=0;
		int pennies=0;
		int intChange=0;
		while (escape != 0) {
			
		System.out.println("How much are you paying?");
		double payment = scanner.nextDouble();
		System.out.println("I am paying $" + payment + ".");
		change = payment - price;
		if (change == 0) {
			System.out.print("Thank you! ");
			escape = intChange;
		}
		else if (change < 0) {
			System.out.println("Sorry, you owe more than that.");
		}
		else {
		System.out.println("Thank you! Your change is $" + change + ".");
		change = change * 100;
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
		System.out.println("(The clerk hands you " + isZero(twenties) + singular(twenties, "twenties")  + isZero(tens) + singular(tens, "tens") + isZero(fives)
													+ singular(tens, "fives") + isZero(ones) + singular(ones, "one dollar bills") + isZero(quarters)
													+ singular(quarters, "quarters") + isZero(dimes) + singular(dimes, "dimes") + isZero(nickles)
													+ singular(nickles, "nickles") + isZero(pennies) + singular(pennies, "pennies") + ")");
		escape = intChange;
		}
		}
	}
	public String singular(int inputNum, String inputDenom) {
		String output = "error";
		
		if (inputNum == 1) {
			switch (inputDenom){
			case "twenties": output = " twenty ";
			break;
			case "tens": output = " ten ";
			break;
			case "fives": output = " five ";
			break;
			case "one dollar bills": output = " one dollar bill ";
			break;
			case "quarters": output = " quarter ";
			break;
			case "dimes": output = " dime ";
			break;
			case "nickles": output = " nickle ";
			break;
			case "pennies": output = " penny ";
			}
		}
		else if (inputNum == 0) {
			output = "";
		}
		else {
			output = (" " + inputDenom + " ");
		}
		
		
		return output;
		
	}
	public String isZero(int inputNum) {
		String output = "";
		
		
			switch (inputNum) {
			case 0: output = "";
			break;
			case 1: output = "1";
			break;
			case 2: output = "2";
			break;
			case 3: output = "3";
			break;
			case 4: output = "4";
			break;
			case 5: output = "5";
			break;
			case 6: output = "6";
			break;
			case 7: output = "7";
			break;
			case 8: output = "8";
			break;
			case 9: output = "9";
			}
		
		
		return output;
		
	}
}
