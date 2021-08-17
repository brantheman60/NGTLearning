package ngt.learning;

public class TestWhile {

	/**
	 * Use "String name = _"
	 * name:long();
	 */
	public static void main(String[] args) {
		int x = 0;
		while(x < 10) {
			System.out.println("x is: " + x);
			x++;
		}
		int y = 0;
		
		do{
			System.out.println("y is: " + y);
			y++;
		} while(y< 10);

	}

}
