package operators;

import vehicles.Car;

class Owner {
	public static void main(String[] args) {
		Car mycar = new Car();
		System.out.println(mycar.doors); //STATEMENT: the field Car.doors is not visible
		System.out.println(mycar.getSpeed()); //STATEMENT: the method getSpeed() from the type Car is not visible

	}

}
