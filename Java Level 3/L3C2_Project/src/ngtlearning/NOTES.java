package ngtlearning;

public class NOTES {

	/**
	 * *NOTE* TAKE THE JAVA CERTIFICATION TEST
	 * 
	 * String, StringBuilder, and String Buffer:::
	 * String class is immutable (=contents of an object of the class String can't be modified)
	 * -modifying a string creates new string objects instead of modifying existing ones
	 * Written as so:
	 * -String str1 = new String("John")
	 * -String str2 = "Raj";
	 * -System.out.println("Kevin");
	 * 
	 * Commonly Used Methods of String class:
	 * -charAt(int index): returns char value at the specified index of a string
	 * -indexOf (string str) : returns the index of the first occurrence 
	 * -indexOf(String str, int fromIndex): returns the index of the first occurrence, starting at the specified index
	 * -substring(int beginIndex) : returns a new string starting from beginIndex till the end of the given string
	 * -substring(int beginIndex, int endIndex) : returns a new string starting from beginIndex till the endIndex of the given string
	 * -trim() : returns a copy of the string, with leading and trailing whitespace omitted
	 * -replace(char oldChar, char newChar) : returns a new string by replacing all occurrences of oldChar in this string with newChar
	 * -length() : returns the length of this string
	 * - You may combine a couple of them together (str2.trim().indexOf(3))
	 * 
	 * Comparing 2 strings
	 * use the equals method defined in the string class
	 * -if(str1.equals(str2))
	 * -NOT if(str1 = str2)     (this compares String objects, not their contents)
	 * 
	 * StringBuilder Class
	 * Shares lots of methods from class String, as well as...:
	 * -append(String str) : appends (adds to) the specified string
	 * -insert(int offset, String str) : inserts string into this character sequence at specified location
	 * -delete(int start, int end) : removes characters in a substring from start to finsih
	 * -deleteCharAt(int index) : removes the char at the specified position
	 * -reverse() : reverses the string
	 * 
	 * StringBuilder vs StringBuffer
	 * offer the same functionality except w/ one difference
	 * the methods of StringBuffer are synchronized where necessary
	 * -code thread is safer
	 *   -only one "use" at a time; other threads wait; meant to prevent hackers
	 *   -only one tread our of multiple treads can execute a method of StringBuffer instance at one point of time
	 *   -this arrangements prevents inconsistencies in values of instance variables that are modified by these method of StringBuffer class instance
	 * 
	 */
	public static void main(String[] args) {
		String name = "     Cali fo rnia     ";
		String str1 = new String("John");
		String str2 = new String("John");
		
		name = name.trim(); //removes all white spaces at the ends
		name = name.replace(" ",""); //replaces all spaces in California with nothing
		if (str1.equals(str2)) //and they are
			System.out.println(name.substring(3,7)); //4 char total; from 3rd to 6th inclusive
		System.out.println(name.length() + str2.trim().indexOf("n")); //length = 10 and index=3

	}

}
