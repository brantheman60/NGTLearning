package com.ngtlearning.example;

public class AddNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;
		int number3 = 30;
		
		int total12 = number1 + number2;
		int total23 = number2 + number3;
		int total13 = number1 + number3;
		
		System.out.println("The Addition of "+number1+
				" and "+number2+" is = "+total12);
		System.out.println("The Addition of "+number2+
				" and "+number3+" is = "+total23);
		System.out.println("The Addition of "+number1+
				" and "+number3+" is = "+total13);

	}

}
