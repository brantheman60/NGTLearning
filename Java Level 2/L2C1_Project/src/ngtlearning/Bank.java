package ngtlearning;

import java.util.Scanner;
import ngtlearning.CommonService;

public class Bank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int deposit;
		int rate;
		int time;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1 for Simple Interest " +
								"or 2 for Compound Interest " +
								"or 0 to quit.");
		int option = s.nextInt();
		
		if (option==0){
			System.out.println("Thank you for using our service...");
			s.close();
			System.exit(0);
		}
		else if (option>2)
			System.out.println("Invalid Selection!!");
		else{
			CommonService commonClass = new CommonService();
			System.out.println("Enter Initial Deposit Amount: ");
				deposit = s.nextInt();
			System.out.println("Enter Interest Rate: ");
				rate = s.nextInt();
			System.out.println("Enter Duration (Years): ");
				time = s.nextInt();
			if (option==1){
				float simpleInterest = commonClass.simpleInterest(deposit, rate, time);
				System.out.println("Total amount with Simple Interest in account after" +
						time+ " years = $"+simpleInterest);
			} else if (option==2){
				float compoundInterest = commonClass.simpleInterest(deposit, rate, time);
				System.out.println("Total amount with Compound Interest in account after" +
						time+ " years = $"+compoundInterest);
			}
		}
		main(null); // this means the main method will be called again, then after that, again
	}

}
