package ngt.learning;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	/**
	 *&& means Conditional-AND, and || means Conditional-OR, both for two boolean expressions.
	 *Can also create several of these conditions using parentheses to cover each pair.
	 */
	public static void main(String[] args) {
		int guessesLeft=10;
		Random ran = new Random();
		int number = ran.nextInt(501);
		System.out.println("I'm thinking of a number between 0 and 500.");
		Scanner s = new Scanner(System.in);
		
		while(guessesLeft>0) {
			System.out.println("You have "+guessesLeft+" guesses left.");
			int a = s.nextInt();
			if(a == number) {
				System.out.println("Correct. Your score is "+guessesLeft+" point(s).");
				return;
			} else if (a > number) {
				System.out.println("Too high.");
				guessesLeft--;
			} else{
				System.out.println("Too low.");
				guessesLeft--;
			}
			if(guessesLeft==0) {
				System.out.println("You ran out of guesses. The actual number was "+number);
			}
		}

	}

}
