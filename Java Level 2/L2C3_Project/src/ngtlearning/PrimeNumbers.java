package ngtlearning;

import java.util.Scanner;

public class PrimeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean isPrime = true;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Show all the prime numbers less than or equal to ");
		int number = s.nextInt();
		
		if (number > 1) {
			System.out.println("All the prime numbers <= " +number+ " are :-");
			System.out.println(2);
		} else {
			System.out.println("Please enter a number greater than 1");
			System.exit(0); //this'll exit the System smoothly
		}
		
		//the following 5 lines are the REAL method for finding primes:
		
		for (int count=3; count<=number; count++){ //count is all the numbers from 3 to number
			for (int j=2; j<count;j++){ //j is all the numbers from 2 to count-1
				if (count%j ==0){ //If count is divisible by j...; this condition WON'T include when j becomes count
					isPrime=false; //..then move on to the next count.
					break;
				}}
			if (isPrime){ //And if the count passes, hooray! Print it.
				System.out.println(count);
			}
			isPrime=true;
		}
		s.close();
	}

}
