package com.skilldistillery.makechange;

public class PluralMethodTest {

	public static void main(String[] args) {
		
		
		int inputNum = 0;
		String inputDenom = "one";
		

		
		String output = "error";
		
		if (inputNum > 1 || inputNum < 1) {
			switch (inputDenom){
			case "twenty": output = "twenties";
			break;
			case "ten": output = "tens";
			break;
			case "five": output = "fives";
			break;
			case "one": output = "ones";
			break;
			case "quarter": output = "quarters";
			break;
			case "dime": output = "dimes";
			break;
			case "nickle": output = "nickles";
			break;
			case "penny": output = "pennies";
			}
		}
		else {
			output = inputDenom;
		}
		
		System.out.println("Output: " + output);
		

	}

}
