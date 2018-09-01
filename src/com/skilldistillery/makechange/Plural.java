package com.skilldistillery.makechange;

public class Plural {
	
	public static String plural(int inputNum, String inputDenom) {
		String output = "error";
		
		if (inputNum < 1) {
			switch (inputDenom){
			case "twenty": output = "twenties";
			case "ten": output = "tens";
			case "five": output = "fives";
			case "one": output = "ones";
			case "quarter": output = "quarters";
			case "dime": output = "dimes";
			case "nickle": output = "nickles";
			case "penny": output = "pennies";
			}
		}
		else {
			output = inputDenom;
		}
		
		return output;
	}

}
