package com.skilldistillery.test;

import java.text.NumberFormat;
import java.util.Scanner;

public class TestRefactorMain {

	public static void main(String[] args) {

		Denomination denomArr[] = {
				new Denomination("twenty", "twenties", 2000),
				new Denomination("ten", "tens", 1000),
				new Denomination("five", "fives", 500),
				new Denomination("one dollar bill", "one dollar bills", 100),
				new Denomination("quarter", "quarters", 25),
				new Denomination("dime", "dimes", 10),
				new Denomination("nickel", "nickels", 5),
				new Denomination("penny", "pennies", 1),
		};

		double price = 0.0;
		double change = 0.0;
		int intChange = 0;
		double payment = 0.0;
		int denom = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello! How much is your purchase?");
		price = scanner.nextDouble();
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String formattedPrice = formatter.format(price);
		System.out.println("Your purchase costs " + formattedPrice + ".");

		boolean stay = true;
		while (stay) {

			System.out.println("How much are you paying?");
			payment = scanner.nextDouble();
			String formattedPayment = formatter.format(payment);
			System.out.println("You are paying " + formattedPayment + ".");
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
				intChange = (int) (change + 0.005);
				int denomCountOutside = 0;
				int denomCountIntChange = intChange;
				for (int i = 0; i < denomArr.length; i++) {
					denom = denomCountIntChange / denomArr[i].value;
					denomCountIntChange = denomCountIntChange - denomArr[i].value * denom;
					if (denom != 0) {
						denomCountOutside++;
					}
				}
				String moneyString = formatter.format(change / 100);
				System.out.println("Thank you! Your change is " + moneyString + ". ");
				System.out.print("( The clerk hands you ");
				stay = false;

				int denomCountInside = 0;
				boolean notFirst = false;
				boolean last = false;
				for (int i = 0; i < denomArr.length; i++) {
					denom = intChange / denomArr[i].value;
					last = intChange - denomArr[i].value * denom == 0;
					notFirst = denomCountInside >= 1;
					if (denom != 0) {
						if (last && denomCountOutside >= 2) {
							System.out.print(" and");
						}
						if (denomCountOutside >= 3 && notFirst) {
							System.out.print(", ");
						}
						if (denom == 1) {
							System.out.print(denom + " " + denomArr[i].singular);
						} else {
							System.out.print(denom + " " + denomArr[i].plural);
						}
						denomCountInside++;
					}
					intChange = intChange - denomArr[i].value * denom;
				}
				System.out.println(". )");
			}
		}
	}

}
