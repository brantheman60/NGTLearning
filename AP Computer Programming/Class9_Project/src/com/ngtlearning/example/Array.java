package com.ngtlearning.example;
import java.util.Scanner;
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int[] Array = new int[10];
		for (int i=0;i<Array.length;i++){
			System.out.println("Type in your number: ");
			Array[i]= s.nextInt();
		}
		s.close();
		
		System.out.println("Your numbers are: ");
		for (int i=0;i<Array.length;i++){
			System.out.println(Array[i]);
		}

	}

}
