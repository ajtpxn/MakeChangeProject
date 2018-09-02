package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeMainApp {

	public static void main(String[] args) {
		
		boolean quit = false;
		
		while (quit != true) {
			
			MakeChangeObject shopping = new MakeChangeObject();
			
			shopping.change();
			
			String input = "error";
			Scanner scanner = new Scanner(System.in);
			System.out.print("Would you like to make another purchase? (Y)es: ");
			input = scanner.nextLine();
			System.out.println();
			
			if ( input.equals("Y") | input.equals("y") ) {
				System.out.println("New purchase: ");
			}
			else {
				quit = true;
				System.out.println("Good bye! Have a good day!");
			}
			
			
			
		}
		
		
	}

}
