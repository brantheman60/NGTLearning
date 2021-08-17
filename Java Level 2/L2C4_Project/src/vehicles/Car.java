package vehicles;
/**Before, I did not add modifiers anywhere, so Owner could not access Car, but 
 * Dealer could.
 * -After adding 'public' in front of 'class' and the 2 'int's, both worked.
 * -After adding 'protected' in front of the 2 'int's, only Dealer worked.
 * -After adding nothing in front of the 2 'int's, only Dealer worked.
 * -After adding private in front of 'int doors', neither one worked!
 */
public class Car {
	private int doors = 4;
	int getSpeed()
	{
		return 50;
	}
/**And after adding everything underneath (the main method) to this code with
 * private still in front of 'int doors', only this subclass is able to run
 * and access the class above!
 */
public static void main (String[] args) {
	Car mycar = new Car();
	System.out.println(mycar.doors);
	System.out.println(mycar.getSpeed());
}
}
