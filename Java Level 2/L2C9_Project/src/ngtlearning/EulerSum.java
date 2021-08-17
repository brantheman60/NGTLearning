package ngtlearning;

import java.util.Scanner;

public class EulerSum {

	public double Euler(int n){
		double sum=0;
		for (int i=1; i<=n; i++){
			sum += Math.pow(0.5, i-1);
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type in a number");
		int number = s.nextInt();
		
		EulerSum sum = new EulerSum();
		System.out.print("The sum of "+number+" terms of 1 + 1/2 + 1/4 + ..." +
				" is: ");
		System.out.println(sum.Euler(number));
		s.close();
	}

}
