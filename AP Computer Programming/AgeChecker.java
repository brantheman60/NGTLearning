package com.ngtlearning.example;
import java.util.Scanner;
public class AgeChecker {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type in your age: ");
		int age = s.nextInt();
		
		if (age<0){
			System.out.println("You are not born yet. Ask again when you are.");
		} else if (age==0){
			System.out.println("Welcome to the world!!!");
		} else if (age<2){
			System.out.println("You are a Baby.");
		} else if (age<3){
			System.out.println("You are a Kid.");
		} else if (age<18){
			if (age==15) {
				System.out.println("You are my age!");
			} else System.out.println("You are a Kid.");
		} else if (age<59){
			System.out.println("You are an Adult.");
		} else if (age>59){
			if (age<100) {
				System.out.println("You are a Senior Citizen");
			} else System.out.println("You are way too old!");
		}

	}

}
