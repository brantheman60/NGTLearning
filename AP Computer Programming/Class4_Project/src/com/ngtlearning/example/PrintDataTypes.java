package com.ngtlearning.example;

public class PrintDataTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int data range 2,147,483,647 to -2,147,483,648
		int intData = 2147483647;
		System.out.println("Printing intData... "+intData);
		System.out.println("Printing inData + 1 ... "+ (intData + 1));
		
		short d=200;
		byte i = (byte) d;
		System.out.println(i);
		
		double doubleData = 9223372.036854775807;
		System.out.println("Printing doubleData... " + doubleData);
		
		//boolean data can either be true of false
		boolean booleanData = true;
		System.out.println("Printing booleanData... "+ booleanData);
		
		//char data can hold single 16-bit Unicode character.
		char charData = 'A';
		char charData1 = 129; //ASCII code for a char
		System.out.println("Printing charData... "+ charData);
		System.out.println("Printing charData1... "+charData1);

	}

}
