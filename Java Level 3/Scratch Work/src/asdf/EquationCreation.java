package asdf;
import java.util.Scanner;
public class EquationCreation {
	
	public static void findFunc(String z){
		char[] y = z.toCharArray();
		for(int i=0;i<z.length();i++){
			System.out.print(y[i]);
		}
	}
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		String z = s.next();
		findFunc(z);
		

	}

}
