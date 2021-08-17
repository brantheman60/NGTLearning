package ngtlearning;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner ICanSeeYou = new Scanner(System.in);
		System.out.println("Decide the right triangle's leg length: ");
		int leg = ICanSeeYou.nextInt();
		
		for(int i=1; i<=leg; i++){
			for(int j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println("");
		}		
	}

}
