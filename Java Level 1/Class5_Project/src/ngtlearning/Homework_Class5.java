package ngtlearning;

import java.util.Scanner;
	/*
	 * 
	 */
public class Homework_Class5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Tell me, good sir, what is your age? : ");
		int age = in.nextInt();
		
		if (age < 13) {
			System.out.println("You are a Kid");
		}else if (age < 19) {
				System.out.println("You are a Teenager");
		}else {
			if (age < 60) {
				System.out.println("You are an Adult");
			}
			else {
				System.out.println("You are a Senior")
			}
		}
		in.close();
	}