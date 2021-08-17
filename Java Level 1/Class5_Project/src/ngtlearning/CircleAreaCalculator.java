package ngtlearning;

import java.util.Scanner;

public class CircleAreaCalculator {

	/**
	 * boolean is used in parentheses by itself b/c already true or false
	 * x == y means x equals y; does not need to be numbers
	 * x != y means x does not equal y; does not need to be numbers
	 * x > y 
	 * x < y
	 * x >= y
	 * x <= y
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter radius of the circle: ");
		int radius = in.nextInt();
		double area;
		
		if (radius > 0)
		{
			System.out.println("Valid Input...");
			System.out.println("The area of a circle with radius " +radius+ " is " + 3.14 * radius * radius);
		}
		else if (radius <= 0)
		{
			System.out.println("Invalid Input...");
		}

	}

}
