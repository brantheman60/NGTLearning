package vehicles;
/**Unlike Owner, this one runs and works! This is because this and Car are of the
 * same package.
 */
public class Dealer {

	public static void main(String[] args) {
		Car dealerCar = new Car();
		System.out.println(dealerCar.doors);
		System.out.println(dealerCar.getSpeed());

	}

}
