package ngt.learning;
import java.util.Scanner;
public class PrintNameHW {

	public static void main(String[] args) {
		Scanner Hello = new Scanner (System.in); 
		System.out.println("Hello! Please type in your name: ");
		String name = Hello.next();
		
		int nameCount = name.length();
		
		while (nameCount >0) {
		System.out.println(name);
		nameCount= nameCount - 1;
		}
 		

	}

}
