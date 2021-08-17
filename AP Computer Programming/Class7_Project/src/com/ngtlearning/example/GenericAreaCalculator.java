package com.ngtlearning.example;
import java.util.Scanner;
public class GenericAreaCalculator{
	public static void main(String[] args) {
		double area;
		Scanner in = new Scanner(System.in);
		int selection = 1;
		while (selection != 0)
		{
			System.out.println("Select Option:");
			System.out.println("1. Area of Circle");
			System.out.println("2. Area of Rectangle");
			System.out.println("0. Exit");
			selection = in.nextInt();
			if (selection ==1){ //area of the circle
				System.out.println("Enter radius of the circle: ");
				int radius = in.nextInt();
				if (radius > 0)
				{
					area = (3.14 * radius * radius);
					System.out.println("The Area of a cricle with "
					+radius+" radius is "+area);
					System.out.println();
				}
				else
				{
					System.out.println("Invalid Radius!!, "+
					"Please enter a positive number.");
				}
			}
			
			if (selection ==2)
			{
				System.out.println("Enter width of Rectangle: ");
				int width = in.nextInt();
				System.out.println("Enter length of Rectangle: ");
				int length = in.nextInt();
				if (width >0 && length >0)
				{
					area = width * length;
					System.out.println("The Area of a Rectangle with " +
					width+" width and "+length+" length is: "+area);
				}
				else
				{
					System.out.println("Invalid Value/s!!!, "+
					"Please enter positive values for both.");
				}
			}
		} System.out.println("Thank you for using this program!!! :D");
		in.close();
	}
}
