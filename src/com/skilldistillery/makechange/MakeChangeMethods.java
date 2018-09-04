package com.skilldistillery.makechange;



public class MakeChangeMethods {

	public static String singularPlural(int inputNum, int inputDenom) {
		String output = "error";
		if (inputNum == 1) {
			switch (inputDenom) {
			case 2000:
				output = " twenty ";
				break;
			case 1000:
				output = " ten ";
				break;
			case 500:
				output = " five ";
				break;
			case 100:
				output = " one dollar bill ";
				break;
			case 25:
				output = " quarter ";
				break;
			case 10:
				output = " dime ";
				break;
			case 5:
				output = " nickel ";
				break;
			case 1:
				output = " penny ";
			}
		} else if (inputNum > 1) {
			switch (inputDenom) {
			case 2000:
				output = " twenties ";
				break;
			case 1000:
				output = " tens ";
				break;
			case 500:
				output = " fives ";
				break;
			case 100:
				output = " one dollar bills ";
				break;
			case 25:
				output = " quarters ";
				break;
			case 10:
				output = " dimes ";
				break;
			case 5:
				output = " nickels ";
				break;
			case 1:
				output = " pennies ";
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
	

    
}


