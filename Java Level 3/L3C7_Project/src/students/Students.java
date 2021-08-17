package students;
import java.util.Scanner;
import ngtlearning.Service;

public class Students {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter student name: ");
		String student = s.nextLine();
		Service commonClass = new Service(student);
		while(true){
			System.out.println("Enter Subject/(Math,Core,Science,PE/) or Q to quit: ");
			String subject = s.nextLine();
			if (subject.toLowerCase().equals("q")){
				System.out.println("Thanks for using the system!");
				s.close();
				System.exit(0);
			}
			String grade = commonClass.getGrades(subject);
			System.out.println("Your Grade for "+subject+" is "+grade);
		}
	}
	
}