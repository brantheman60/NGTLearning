package com.ngtlearning.example;

public class RestaurantCustomer {

	public static void main(String[] args) {
		int price = 50;
		int tip = 15;
		CommonMethods commonClass = new CommonMethods(); //this passes down all the function of the class CommonMethods
		
		System.out.println("The food costed $"+price);
		
		float tipAmount = commonClass.tip(price, tip);
		System.out.println("A "+tip+"% tip would be $"+tipAmount+" more");
		System.out.println("That is a total of $"+(price+tipAmount));

	}

}
