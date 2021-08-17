package ngtlearning;

import java.util.Scanner;

public class TipCalculator {

	private double calculateTip(double amount, int tip)
	{
		return amount + (amount * tip/100);
	}
	private double splitAmount(double totalAmount, int numberOfPeople)
	{
		return totalAmount/numberOfPeople;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Bill Amount.");
			double amount = s.nextDouble();
		System.out.println("Enter your Tip Percentage.");
			int tip = s.nextInt();
		System.out.println("Enter the total Number of People.");
			int numberOfPeople = s.nextInt();
			
		TipCalculator Tip = new TipCalculator();
		
		System.out.println("The Total Tip is: $"+Tip.calculateTip(amount, tip));
		System.out.println("Each person gives: $"+Tip.splitAmount(Tip.calculateTip(amount, tip), numberOfPeople));
		s.close();
	}

}
