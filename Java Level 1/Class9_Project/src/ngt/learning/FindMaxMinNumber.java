package ngt.learning;
import java.util.Scanner;
public class FindMaxMinNumber {

	public static void main(String[] args) {
		int numbers [];
		numbers = new int [10];
		
		Scanner Calculator = new Scanner(System.in);
		System.out.println("Enter the first number:");
		numbers[0] = Calculator.nextInt();
		
		for (int i=1; i<9; i++) {
			System.out.println("Enter the next number:");
			numbers[i] = Calculator.nextInt();
		}
		
		System.out.println("Enter the last number:");
		numbers[9] = Calculator.nextInt();
		
		int maximum = -2147483646;
		int minimum = 2147483647;
		
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] > maximum) {
				maximum = numbers[i];
			}
		} System.out.println("The maximum of the set is " +maximum);
		
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] < minimum) {
				minimum = numbers[i];
			}
		} System.out.println("The minimum of the set is " +minimum);
		
		

	}

}
