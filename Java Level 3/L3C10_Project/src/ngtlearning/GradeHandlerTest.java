package ngtlearning;

import java.util.Scanner;

public class GradeHandlerTest {
	
	public static void main(String[] args) {
		GradeHandler myGrades = new GradeHandler();
		Scanner in = new Scanner(System.in);
		String value = "0";
		while(!(value.equalsIgnoreCase("q"))){
			System.out.println("Enter your grade between 0 and 100 [q to quit]");
			value = in.next();
			try{
				if(!value.equalsIgnoreCase("q")){
					try{
						myGrades.add(Integer.parseInt(value));
					} catch(NumberFormatException e){
						System.out.println("NumberFormatException!");
					}
				}
			} catch(NullPointerException o){
				System.out.println("NullPointerException - only numbers allowed");
			}
		}
		try
		{
			System.out.println("The grade average is "+myGrades.computeAverage());
					
		} catch(ArithmeticException exception3)
		{
			System.out.println(exception3);
		}
		in.close();
		System.exit(0);
	}

}
