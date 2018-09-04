package com.skilldistillery.makechange;

import java.text.NumberFormat;
import java.util.Scanner;

public class MakeChangeSimpleObject {

	public void change() {

		double price = 0.0;
		double change = 0.0;
		int intChange = 0;
		double payment = 0.0;
		int dVal = 0;
		int dNum = 1;
		int denom = 0;
		boolean stay = true;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello! How much is your purchase?");
		price = scanner.nextDouble();
		System.out.println("My purchase costs $" + price + ".");

		// Payment loop
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
				change = change * 100;
				intChange = (int)(change + 0.005);
				NumberFormat formatter = NumberFormat.getCurrencyInstance();
				String moneyString = formatter.format(change/100);
				System.out.println("Thank you! Your change is " + moneyString + ". ");
				System.out.print("( The clerk hands you ");
				stay = false;

				while (dNum <= 8) {
					dVal = MakeChangeMethods.setDenomValue(dNum);
					denom = intChange / dVal;
					System.out.print(MakeChangeMethods.isZero(denom));
					System.out.print(MakeChangeMethods.singularPlural(denom, dVal));
					intChange = intChange - dVal * denom;
					dNum = dNum + 1;

				}
				System.out.println(")");
			}
		}
	}

}
