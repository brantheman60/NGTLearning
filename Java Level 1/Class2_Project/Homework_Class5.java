package ngtlearning;

import java.util.Scanner;

public class Homework_Class5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Tell me, good sir, what is your age? : ");
		int age = in.nextInt();
		
		if (age < 13) {
			if (age > 0) {
				System.out.println("You are a kid.");
			}
			else {
				System.out.println("Don't lie to me.");
			}}
		if (age <= 18) {
			if (age >= 13) {
				System.out.println("You are a teenager.");
			}}
		if (age <= 59) {
			if (age >= 19) {
				System.out.println("You are an adult.");
			}}
		if (age >= 60){
			if (age < 130) {
				System.out.println("You are a senior citizen.");
				}
			else {
				System.out.println("You are dead.");
			}}

	}

}
