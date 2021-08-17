package ngtlearning;

import java.util.Scanner;

public class Rectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int width;
		int height;
		
		System.out.println("Create your own rectangle! Type in the Width:");
		  width = s.nextInt();
		System.out.println("Type in the Height:");
		  height = s.nextInt();
		
		if (width<1 || height<1){
			System.out.println("This rectangle cannot be created.");
			System.exit(0);
		} else {
			for (int i=1;i<=height;i++){
				for (int j=1;j<width;j++){
					System.out.print("* ");
				}
				System.out.println("*");
			}
			s.close();
		}
	}

}
