package com.ngtlearning.example;

public class MathTest{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Addition add = new Addition (3,6); //transforms to Addition's variables
		System.out.println(add.getTotal()); //uses the new Addition's variables

	}
}
