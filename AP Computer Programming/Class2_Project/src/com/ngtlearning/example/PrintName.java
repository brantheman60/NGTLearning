package com.ngtlearning.example;
import java.util.Scanner;
public class PrintName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = s.next();
		System.out.println("Hello "+name+". You are Awesome.");
		s.close();
	}

}
