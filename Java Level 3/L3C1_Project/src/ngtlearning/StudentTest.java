package ngtlearning;

public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student studentOne = new Student("John King");
		Student studentTwo = new Student("Raj Patel");
		
		studentOne.studentGrade(10);
		studentOne.studentId(314159265);
		
		studentOne.studentGrade(9);
		studentOne.studentId(101499);
		
		studentOne.printDetails();
		studentTwo.printDetails();
		
		/**the following code would also work in this case:
		 * Student studentOne = new Student("John King");
		 * Student studentTwo = new Student("Raj Patel");
		 * studentOne.grade=10;
		 * studentOne.id=314159265;
		 * studentTwo.grade=9;
		 * studentTwo.id=101499;
		 * studentOne.printDetails();
		 * studentTwo.printDetails();
		 */
		

	}

}
