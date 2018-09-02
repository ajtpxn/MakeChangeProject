package com.skilldistillery.test;

import java.util.Scanner;

public class TestAnd {

	public static void main(String[] args) {
	



				
				Scanner scanner = new Scanner(System.in);
				System.out.println("Hello! How much is your purchase?");
				double price = 2.31;
//				price = scanner.nextDouble();
				System.out.println("My purchase costs $" + price + ".");
				double change = 0.0;
				int escape = 1;
				int twenties = 0;
				int tens = 0;
				int fives = 0;
				int ones=0;
				int quarters=0;
				int dimes=0;
				int nickels=0;
				int pennies=0;
				int intChange=0;
				while (escape != 0) {
					
				System.out.println("How much are you paying?");
				double payment = 32.31; //scanner.nextDouble();
				System.out.println("I am paying $" + payment + ".");
				change = 21.66;
				if (change == 0) {
					System.out.print("Thank you for the exact change! ");
					escape = intChange;
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
				
				int last = intChange;
				
				twenties = intChange / 2000;
				System.out.print(isZero(twenties) + singular(twenties, "twenties"));
				intChange = intChange - 2000*twenties;
				if (intChange > 0) {
					System.out.print(", ");
				}
				
				//**************** tens **********************
				tens = intChange / 1000;
				last = intChange - 1000*tens;
				if (last == 0 && tens > 0) {
					System.out.println("and ");
				}
				System.out.print(isZero(tens) + singular(tens, "tens"));
				if (intChange > 0) {
					System.out.print(", ");
				}
				
				//***************** fives *********************
				fives = intChange / 500;
				last = intChange - 500*fives;
				if (last == 0 && fives > 0) {
					System.out.print("and ");
				}
				System.out.print(isZero(fives) + singular(fives, "fives"));
				intChange = intChange - 500*fives;
				if (intChange > 0) {
					System.out.print(", ");
				}
				
				//**************** ones **********************
				ones = intChange / 100;
				last = intChange - 100*ones;
				if (last == 0 && ones > 0) {
					System.out.print("and ");
				}
				System.out.print(isZero(ones) + singular(ones, "one dollar bills"));
				if (intChange > 0) {
					System.out.print(", ");
				}
				intChange = intChange - 100*ones;
				
				//**************** quarters **********************
				quarters = intChange / 25;
				last = intChange - 25*quarters;
				if (last == 0 && quarters > 0) {
					System.out.print("and ");
				}
				System.out.print(isZero(quarters) + singular(quarters, "quarters"));
				if (intChange > 0) {
					System.out.print(", ");
				}
				intChange = intChange - 25*quarters;
				
				//*************** dimes ***********************
				dimes = intChange / 10;
				last = intChange - 10*dimes;
				if (last == 0 && dimes > 0) {
					System.out.print("and ");
				}
				if (intChange > 0) {
					System.out.print(isZero(dimes) + singular(dimes, "dimes"));
				}
				intChange = intChange - 10*dimes;
				
				//*************** nickels ***********************
				nickels = intChange / 5;
				last = intChange - 5*nickels;
				if (last == 0 && nickels > 0) {
					System.out.print("and ");
				}
				if (intChange > 0) {
					System.out.print(isZero(nickels) + singular(nickels, "nickels"));
				}
				intChange = intChange - 5*nickels;
				
				//*************** pennies ***********************
				pennies = intChange / 1;
				last = intChange - 1*pennies;
				if (last == 0 && pennies > 0) {
					System.out.print("and ");
				}
				if (intChange > 0) {
					System.out.print(isZero(pennies) + singular(pennies, "pennies"));
				}
				intChange = intChange - 1*pennies;
				
				
					
				
				System.out.println(". )");
				escape = intChange;
				}
				}
			}
			public static String singular(int inputNum, String inputDenom) {
				String output = "error";
				
				if (inputNum == 1) {
					switch (inputDenom){
					case "twenties": output = " twenty";
					break;
					case "tens": output = " ten";
					break;
					case "fives": output = " five";
					break;
					case "one dollar bills": output = " one dollar bill";
					break;
					case "quarters": output = " quarter";
					break;
					case "dimes": output = " dime";
					break;
					case "nickels": output = " nickel";
					break;
					case "pennies": output = " penny";
					}
				}
				else if (inputNum == 0) {
					output = "";
				}
				else {
					output = (" " + inputDenom);
				}
				
				
				return output;
				
			}
			public static String isZero(int inputNum) {
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


	


