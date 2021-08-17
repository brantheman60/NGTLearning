package com.ngtlearning.example;
import java.util.Random;
import java.util.Scanner;
public class GuessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int guessesLeft = 15;
		Random ran = new Random();
		int number = ran.nextInt(1001);
		System.out.println("I'm thinking of a number between 0 and 1000.");
		Scanner s = new Scanner(System.in);
		
		while (guessesLeft>0){
			System.out.println("Type in your guess:");
			int guess = s.nextInt();
			if (guess > number){
				System.out.println("Your guess is too high.");
				guessesLeft--;
			} else if (guess < number){
				System.out.println("Your guess is too low.");
				guessesLeft--;
			} else if(guess == number){
				System.out.println("Congratulations! You got it right!");
				System.out.println("Your score is "+guessesLeft+" point(s)!!");
				return;
			}
			if (guessesLeft==0){
				System.out.println("GAME OVER. YOu ran out of guesses. " +
						"The number was: "+number);
			}}
			s.close();
	}

}
