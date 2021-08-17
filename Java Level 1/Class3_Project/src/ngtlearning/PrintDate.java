package ngtlearning;

import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
public class PrintDate {

	/**
	 * Hello! Did you forget the time already. Well, if you are too lazy to move your eyes down and look at the time on your computer, you can run this
	 * complicated program instead. Furthermore, I have implemented new American format functions that look more pleasing to the eye. Enjoy!!! 
	 */
	public static void main(String[] args) {
		Date currentDate;
		DateFormat df;
		
		currentDate = new Date();
		System.out.print ("Today's date in Default US format is: ");
		System.out.println(currentDate);
		
		df = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
		System.out.print("Today's date in long US format is: ");
		System.out.println(df.format(currentDate));
		
		df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
		System.out.print("Today's date in short US format is: ");
		System.out.println(df.format(currentDate));
	}

}
