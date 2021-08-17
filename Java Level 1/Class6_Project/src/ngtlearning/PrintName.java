package ngtlearning;

import java.util.Scanner;

public class PrintName {

	/**
	 * I messed up here!!!
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Type in your name: ");
		String name = in.next();
		
		System.out.println("How many times would you like to see your name?: ");
		int times = in.nextInt();
		
		for(int x=1; x<= times; x++)
		{
			System.out.println(x+" - "+ name);
		}
		if (times<=0) {
			System.out.println("Try a positive number.");
		}
		in.close();
	}

}
