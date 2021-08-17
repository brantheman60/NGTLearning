package ngt.learning;

public class DayOfWeek {

	/**
	 * The "switch" section goes down the list of the cases until one is true
	 * The "break" will get out of the "switch" section
	 9*/
	public static void main(String[] args) {
		int dayOfWeek = 5;
		String day;
		switch (dayOfWeek ) {
			case 1: day = "Monday";
					break;
			case 2: day = "Tuesday";
					break;
			case 3: day = "Wednesday";
					break;
			case 4: day = "Thursday";
					break;
			case 5: day = "Friday";
					break;
			case 6: day = "Saturday";
					break;
			case 7: day = "Sunday";
					break;
			default: day = "Invalid Day";
					break;
		}
		System.out.println(day);
	}

}
