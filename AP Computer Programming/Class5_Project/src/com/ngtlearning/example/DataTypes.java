package com.ngtlearning.example;

public class DataTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 88;
		if (number > 80){
			System.out.println("The number is: "+number);
		}
		
		double percent = 99.9999999;
		if (percent > 99.99) {
			System.out.println("Good job!!, your % is: "+ percent);
		}
		
		boolean isDayTime = true;
		if (isDayTime){
			System.out.println("What a nice day it is!!! ");
		}
		
		char asciiValue = 64;
		if (asciiValue == '@'){
			System.out.println("Printing charData... "+asciiValue);
		}
		
		//Type Casting from int to double
		int i = 200;
		double d = i;
		System.out.println("Printing doubleData... "+d);
		
		//Type Casting from double to int
		double d1 = 9223372.5;
		int i1 = (int) d1;
		System.out.println("Printing intData... "+i1);
		
		//Type Casting from double to small
		short s = (short)d1;
		System.out.println("Printing shortData... "+s);

	}

}
