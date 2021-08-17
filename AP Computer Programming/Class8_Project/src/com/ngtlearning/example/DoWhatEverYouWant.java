package com.ngtlearning.example;
import java.util.Random;
public class DoWhatEverYouWant {

	/**
	 * Arithmetic Operators: +, -, *, /, %
	 * Assignment(?) Operators: a+=c ---> a=a+c, a-=c ---> a=a-c, etc., a%=c ---> a=a%c
	 * Unary: +, -, ++, --, !
	 * Equality and Relational Operators: ==, !=, >, >=, <, <=
	 * Conditional Operators && (and) and || (or)
	 * Bitwise and Bit Shift Operators: deals with 0s and 1s
	 * 
	 * in the while loop, typing return will get out of the loop!
	 */
	public static void main(String[] args) {
		Random r = new Random();
		for (int i=1; i<=8;i++){
			int j = r.nextInt(2);
			System.out.println(j);
		}

	}

}
