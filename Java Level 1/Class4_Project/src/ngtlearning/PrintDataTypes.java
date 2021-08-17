package ngtlearning;

public class PrintDataTypes {

	/**
	 * The purpose of this project is to use data types, as you may expect.
	 * I think we are going to use numbers. What do you think?
	 * WOW!!! These are a lot of numbers. What on earth is going on!?!?
	 * I dunno Brandon, but this sure is epic. Where on earth are the negatives coming from?
	 * 
	 * REMEMBER THESE: float= 32-bit decimal or fraction
	 * AND: double= twice the size of a float; 64-bit
	 * AND: boolean= only 1 bit that tells true (1) and false (0)
	 * AND: char= 16-bit unicode character; any symbol and special characters (@,#,&,%,etc)
	 */
	public static void main(String[] args) {
		// byte data range 127 to -128
		byte byteData = 127;
		System.out.println("Printing byteData... " +byteData);
		
		// short data range 32767 to -32768
		short shortData = 32767;
		System.out.println("Printing shortData... " +shortData);
		
		// int data range 2,147,483,647 to -2,147,483,648
		int intData = 2147483647;
		System.out.println("Printing intData... " +intData);
		System.out.println("Printing intData + 1 ... " + (intData+ 1));
		
		// long data range 9,223,372,036,854,775,807 (2^63 -1)
		// to -9,223,372,036,854,775,808 (-2^63)
		long longData = 9223372036854775807L;
		System.out.println("Printing longData... " +longData);
		System.out.println("Printing longData + 1 ... " + (longData+ 1));
	}

}
