package ngtlearning;

import java.util.Scanner;
import ngtlearning.CommonService;

public class RestaurantUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int cost;
		int rate;
		Scanner s = new Scanner(System.in);
		CommonService commonClass = new CommonService();
		
		System.out.println("Enter Inital Cost of your Meal: ");
		cost = s.nextInt();
		System.out.println("Enter Rate of your Tip: ");
		rate = s.nextInt();
		
		float totalCost = commonClass.Tip(cost, rate);
		System.out.println("The Total Cost of your Meal with Inital Cost $" +
						+cost+" and Tip Rate "+rate+"% is $"+totalCost);
		
		s.close();
		
	}

}
