package ngtlearning;

import java.util.Scanner;
import ngtlearning.CommonService;

public class Student {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int base;
		int height;
		int side;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 1 for Area of a Triangle " +
				"or 2 for Area of a Regular Pentagon " +
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
			if (option==1){
			System.out.println("Enter Base of the Triangle: ");
			base = s.nextInt();
			System.out.println("Enter Height of the Triangle: ");
			height = s.nextInt();
		
			float triangleArea = commonClass.areaTriangle(base,height);
			System.out.println("The Area of a Triangle with Base "
							+base+ " and Height "+height+" is "+triangleArea);
			}
			
			//The following is the homework:
			if (option==2){
			System.out.println("Enter Side of the Regular Pentagon");
			side = s.nextInt();
			float pentagonArea = commonClass.areaPentagon(side);
			System.out.println("The Area of a Pentagon with Side "
							+side+ " is "+pentagonArea);
			}
		main(null);
		}
	}

}
