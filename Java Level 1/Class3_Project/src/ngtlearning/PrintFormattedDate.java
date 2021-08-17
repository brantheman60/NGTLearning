package ngtlearning;
import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;

public class PrintFormattedDate {
	/* Hello World!
	 * YOLO!!!!!!!!!!!!!!!!!!!!!!!!!
	 */
	public static void main(String[] args) {
		Date currentDate;
		DateFormat df;
		
		currentDate = new Date;
		df = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
		System.out.print("Today's date in long US format is: ");
		System.out.println(df.format(currentDate));
		
		df = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
		System.out.print ("Today's date in long EU format is: ");
		System.out.println(df.format(currentDate));
		
		df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
		System.out.print("Today's date in short US format is: ");
		System.out.println(df.format(currentDate));

		df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.UK);
		System.out.print("and today's date in short UK format is: ");
		System.out.println(df.format(currentDate));
	}

}
