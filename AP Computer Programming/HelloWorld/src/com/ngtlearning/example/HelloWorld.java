package com.ngtlearning.example;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!!");
		
		
		System.out.println("=> ");
		for (int i=1; i<=10; i++) {
			
			for (int j=1; j<=i; j++) {
				System.out.print(":) ");
			}System.out.println(" => ");
		}
		for (int i=10;i>=1;i--){
			for (int j=1;j<=i;j++){
				System.out.print(":) ");
			} System.out.println(" => ");			
		} System.out.println("=> ");
	}
}
