package ngtlearning;

public class NOTES {

	/**
	 * 4 TYPES OF VARIABLES BASED ON SCOPES:::
	 * Local variables: method level variables, often storing its temporary state (eg. int number1;)
	 * -always declared b/w opening and closing braces of a method
	 * -only visible to methods in which they're declared; not accessible from rest of the class
	 * -created when method is invoked, and destroyed when the method ends
	 * 
	 * Method parameters/ Method arguments: variables that accept values in a method (eg. print(name);)
	 * -accessible *only* in the method that defines them
	 * 
	 * Instance variables: object level variables unique to each instance of a class
	 * -eg: public class MathGame { 
	 *        int score = 0; //score is instance variable
	 *        Scanner s; //s is also instance variable
	 * -declared inside a class, but not outside any method
	 * -cannot be declared as static or accessed outside of static area
	 * -"instance variables" b/c variables with certain values in certain cases
	 *
	 * Class variables: variables defined by using the keyword "static" (eg. static int totalAttempts = 10;)
	 * -belongs to a class, not to individual objects of the class
	 * -shared across all objects without a separate copy of the variable
	 * -tells to compiler that there's exactly 1 copy of this variable in existence, regardless of how many times the class has been instantiated
	 * -can be accessed directly by using the name of the class in which it's defined
	 * 
	 * EXAMPLE OF SCOPING OF VARIABLES:
	 * Class Variable                          (Class)
	 * -Instance Variable                      (Object 1: Instance)
	 *   -Local Variable1, Method Parameter    (Method 1)
	 *   -Local Variable2                      (Method 2)
	 * -Instance Variable                      (Object 2: Instance)
	 *   -Local Variable1, Method Parameter
	 *   -Local Variable1
	 *   
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
