package ngtlearning;
import java.util.Scanner;
public class MathFunctionsTest extends MathFunctions {

	public static void main(String[] args) {
		Scanner job = new Scanner (System.in);
		System.out.println("Will you be doing Substraction, Multiplication, or Simple Interest?");
		System.out.println("Please type in \"Subtraction\", \"Multiplication\", or \"SimpleInterest\".");
		String Method = job.next();
		if (Method.equals("Subtraction")) {
			System.out.println("Type the first number.");
			int number1 = job.nextInt();
			System.out.println("Type the second number.");
			int number2 = job.nextInt();
			MathFunctions Value = new MathFunctions();
			System.out.println(Value.Subtraction(number1, number2));
			
		} else if (Method.equals("Multiplication")) {
			System.out.println("Type the first number.");
			int number1 = job.nextInt();
			System.out.println("Type the second number.");
			int number2 = job.nextInt();
			MathFunctions Value = new MathFunctions();
			System.out.println(Value.Multiplication(number1, number2));
			
		} else if (Method.equals("SimpleInterest")) {
			System.out.println("Type the principle amount.");
			int number1 = job.nextInt();
			System.out.println("Type the interest rate.");
			float number2 = job.nextFloat();
			System.out.println("Type the length of time.");
			int number3 = job.nextInt();
			MathFunctions Value = new MathFunctions();
			System.out.println(Value.SimpleInterest(number1,number2,number3));
			
		} else {
			System.out.println("This is not an acceptable mathematical operation.");
		}

	}

}
