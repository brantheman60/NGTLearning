package com.ngtlearning.example;

public class AddNumbers {

	/**
	 * If you skipped elementary school and do not know how to add numbers, then this program is for you!
	 */
	public static void main(String[] args) {
		int number1 = 4;
		int number2 = 1;
		int number3 = 2;
		
		int total1and2 = number1 * number2;
		int total1and3 = number1 + number3;
		int total2and3 = number2 + number3;
		System.out.println("The Addition of "+number1+" and "+number2+" is = "+total1and2);
		System.out.println("The Addition of "+number1+" and "+number3+" is = "+total1and3);
		System.out.println("The Addition of "+number2+" and "+number3+" is = "+total2and3);
	}

}
