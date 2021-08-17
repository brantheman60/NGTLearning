package ngtlearning;

public class NOTES {

	/**
	 * Calling/Invoking a Method:::
	 * non-static and static always have different ways of calling static methods:
	 * -for static, no need to create a new instance; may call original class or use an object
	 * -for non-static, create an instance of method, then call the method from the object
	 * for non-static methods within the same class:
	 * -for both static and non-static, must create an instance and call the method from the object
	 * 
	 * Return Type and Return Statement:::
	 * return type
	 * -method may or may not return a value
	 * -can either return a java primitive data type/value (int, char) or an object of a class
	 * -if doesn't return a value, then it should use a return type void
	 *  -eg. public void printSpeed() { System.out.println(getSpeed()) }
	 * return statement
	 * -used to exit from a method
	 * -as soon as computer reaches a return line, it'll break out of the method
	 * -if method defines a return type, statement must be immediately followed by a return value of the same type
	 * -if method doesn't define a return type, statement can be used w/o return value to exit a method
	 *  -usually as a conditional exit to exit prematurely 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
