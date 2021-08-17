package ngt.learning;

import java.util.Scanner;
import java.lang.ArithmeticException;

public class ExceptionTest {
	
	public static void main(String[] args) {
		ExceptionTest myObject = new ExceptionTest();
		//myObject.numberDivide(); //unblock this if you want
		myObject.printNames();
	}
	private void numberDivide()
	{
		int number1 = 12;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter an integer number: ");
		try{
			int num = in.nextInt();
			int total = number1 / num;
			System.out.println("Answer is: "+total);
		}catch(ArithmeticException ae) {
			System.out.println("Invalid number"+ae.getMessage());
			main(null); //re-do the main method
			in.close();
		}
	}
	
	private void printNames()
	{
		String names[] = { "John", "Bill", "Joe", "Raj", "Kevin"};
		try{
			for(int i = 0; i<=5; i++){ //problem is that there is no names[5]
				System.out.println(names[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException oobe){ //runs if error is specifically bounds-related
			System.out.println("Array length is "+names.length + 
					" but you are trying to get element at location > "+names.length);
		}
		catch (Exception e){
			System.out.println(e); //this will give the reason for the error
		}
		finally{
			System.out.println("This code should always run");
			//Close resources like dD connection, file handler, etc
		}
	}

}
