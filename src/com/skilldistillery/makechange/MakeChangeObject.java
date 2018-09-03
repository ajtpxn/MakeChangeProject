package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeObject {

	public void change() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello! How much is your purchase?");
		double price = 0.0;
		price = scanner.nextDouble();
		System.out.println("My purchase costs $" + price + ".");
		double change = 0.0;
		int intChange = 0;
		double payment = 0.0;
		int dVal = 0;
		int dNum = 1;
		boolean last = false;
		int denom = 0;

		boolean stay = true;
		while (stay) {

			System.out.println("How much are you paying?");
			payment = scanner.nextDouble();
			System.out.println("I am paying $" + payment + ".");
			change = payment - price;
			if (change == 0) {
				System.out.print("Thank you for the exact change! ");
				stay = false;
			} else if (change < 0) {
				System.out.println("Sorry, you owe more than that.");
			} else if (change >= 100) {
				System.out.println("Sorry, we don't make change for $100 or more.");
			} else {
				System.out.println("Thank you! Your change is $" + change + ".");
				change = change * 100;
				System.out.print("( The clerk hands you ");
				intChange = (int) change;
				stay = false;

				while (dNum <= 8) {
					dVal = setDenomValue(dNum);
					denom = intChange / dVal;
					last = (intChange - dVal * denom == 0) && (dNum > 1) ;
					System.out.print(printAnd(last && false));
					System.out.print(isZero(denom));
					System.out.print(singular(denom, dVal));
					intChange = intChange - dVal * denom;
					System.out.print(printComma(last || denom == 0 || dNum == 1));
					dNum = dNum + 1;

				}
				System.out.println(". )");
			}
		}
	}

	public static String singular(int inputNum, int inputDenom) {
		String output = "error";
		if (inputNum == 1) {
			switch (inputDenom) {
			case 2000:
				output = " twenty";
				break;
			case 1000:
				output = " ten";
				break;
			case 500:
				output = " five";
				break;
			case 100:
				output = " one dollar bill";
				break;
			case 25:
				output = " quarter";
				break;
			case 10:
				output = " dime";
				break;
			case 5:
				output = " nickel";
				break;
			case 1:
				output = " penny";
			}
		} else if (inputNum > 1) {
			switch (inputDenom) {
			case 2000:
				output = " twenties";
				break;
			case 1000:
				output = " tens";
				break;
			case 500:
				output = " fives";
				break;
			case 100:
				output = " one dollar bills";
				break;
			case 25:
				output = " quarters";
				break;
			case 10:
				output = " dimes";
				break;
			case 5:
				output = " nickels";
				break;
			case 1:
				output = " pennies";
			}
		} else {
			output = "";
		}
		return output;
	}

	public static String isZero(int inputNum) {
		String output = "error";
		switch (inputNum) {
		case 0:
			output = "";
			break;
		case 1:
			output = "1";
			break;
		case 2:
			output = "2";
			break;
		case 3:
			output = "3";
			break;
		case 4:
			output = "4";
			break;
		case 5:
			output = "5";
			break;
		case 6:
			output = "6";
			break;
		case 7:
			output = "7";
			break;
		case 8:
			output = "8";
			break;
		case 9:
			output = "9";
		}
		return output;
	}

	public static int setDenomValue(int denomNumber) {
		int output = 0;

		switch (denomNumber) {

		case 1:
			output = 2000;
			break;
		case 2:
			output = 1000;
			break;
		case 3:
			output = 500;
			break;
		case 4:
			output = 100;
			break;
		case 5:
			output = 25;
			break;
		case 6:
			output = 10;
			break;
		case 7:
			output = 5;
			break;
		case 8:
			output = 1;
		}
		return output;
	}

	public static String printAnd(boolean doPrint) {
		String output = "error";
		if (doPrint) {
			output = "and ";
		} else {
			output = "";
		}
		return output;
	}

	public static String printComma(boolean doNotPrint) {
		String output = "error";
		if (doNotPrint) {
			output = "";
		} else {
			output = ", ";
		}

		return output;
	}

}
