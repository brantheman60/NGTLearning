package ngtlearning;

public class NOTES {

	/**
	 * 
	 * 3 TYPES OF JAVA NON-ACCESS MODIFIERS (ways to change the default Java class's properties):::
	 * static...
	 *  -Variables; belongs to an entire class, not to individual objects
	 *    -shared across all objects i.e. objects don't have a separate copy of the class variables
	 *    -local variables cannot be declared static
	 *    -like Google Doc; when one object changes, all objects change!
	 *  -Methods; are not associated with objects
	 *    -cannot use any of the instance variables of the class
	 *    -must only use static variables
	 *    -are usually used to access or manipulate static variables
	 *    -can also define utility methods i.e. methods that usually manipulate the method parameters to compute and return an appropriate value
	 *  -class and interface CANNOT be declared static
	 * final...
	 *  -Variables; cannot be reassigned a value
	 *    -can be assigned a value only once
	 *    -useful when variable is to stay the same all the time when running
	 *  -Method; when defined in a super class, cannot be overridden by a sub-class
	 *    -the method will never be blocked/removed in a subclass; it's permanent
	 *  -Class; cannot be sub-classed
	 *    -no "inheritance"
	 *  -interface CANNOT be declared final
	 * abstract...
	 *  -variables CANNOT be declared abstract
	 *  -Method; doesn't contain a body, and usually implemented by the sub-class
	 *    -eg. public abstract void doors();  <--as you can see, no additional code
	 *    -subclasses are forced to have this method
	 *    -parameters are determined by the subclass
	 *  -Class; cannot be instantiated i.e. cannot become an object
	 *    -eg. abstract class Car {
	 *         ...
	 *         }
	 *         class Shop{
	 *                   Car c = new Car ();   <--- compiler will throw error
	 *         }
	 *    -Interface; it is default abstract
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
