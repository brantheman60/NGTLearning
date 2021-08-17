package ngtlearning;

import java.util.Scanner;

public class Square {

	/**
	 * @param args
	 */
public static void main(String[] args) {
		System.out.println("Enter side of the Square: ");
		Scanner OBEY = new Scanner(System.in);
		int size = OBEY.nextInt();
		for(int i = 1; i <= size; i++) {
			for(int j = 1; j<size; j++) {
				System.out.print("* ");
			}
			System.out.println("* ");
		}
		OBEY.close();
	}

}
