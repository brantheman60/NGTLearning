package ngtlearning;

public class NOTES {

	/**
	 * Object Life Cycle:::
	 * 1: created from a class when you use "new"
	 *   -Car myCar = new Car();
	 * 2: after created, it can be accessed using its reference variable
	 *   -int speed = myCar.getSpeed(); <--in this case, reference variable is myCar
	 * 3: remains accessible until out of scope, its reference variable is null, or assigned to a new object
	 *   -myCar = null;   or   myCar = new Car(10000); <--old myCar disappears!
	 * 4: when it becomes inaccessible, it's marked as eligible for garbage collection
	 *   -garbage collector = part of Java runtime that destroys all objects that are no longer referenced and reclaims their memory
	 * 5: a reference variable w/o the reference is like an uninitialized reference variable
	 *   -Car myCar=new Car(); & myCar=null;   ===   new Car();   ===   Car myCar;
	 *   -like a house without an address
	 *   -if this occurs, Java's garbage collector removes the "address-less houses"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
