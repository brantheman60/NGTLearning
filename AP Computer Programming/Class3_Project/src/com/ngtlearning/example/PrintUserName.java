package com.ngtlearning.example;
import java.util.Scanner;
public class PrintUserName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner hi = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String firstName = hi.nextLine();
		System.out.println("Good. Now enter your last name:");
		String lastName = hi.nextLine();
		
		System.out.println("Your name is: ");
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println("Your name is: ");
		System.out.println(firstName +" "+ lastName);
		hi.close();
	}

}
