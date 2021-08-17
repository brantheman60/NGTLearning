package com.ngtlearning.example;
import java.util.Scanner;
public class CircleAreaCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		do{System.out.println("Enter radius of the circle:");
		int radius = in.nextInt();
		if (radius>0){
			double area = Math.PI * Math.pow(radius, 2);
			System.out.println("The area of the circle is: "+area+".");
		} else {
			System.out.println("ERROR: This is not a valid input.");
			System.out.println("Please enter a positive number.");
		}} while (true);
	}

}
