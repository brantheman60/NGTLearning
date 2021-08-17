package ngtlearning;

public class Service {

	/**
	 * this class should be written in a secured way, so that
	 * Student.java can only see grades but cannot change grades
	 * Teacher.java should be able to both see and change grades
	 */
	private String studentName;
	private FileHandler dataFile;
	
	public Service(String student)
	{
		studentName = student;
		dataFile = new FileHandler(studentName);
	}
	void setGrades(String subject, String grade){
		dataFile.write(subject, grade);
	}
	public String getGrades(String subject){
		return dataFile.read(subject);
	}
	public String getName(){
		return studentName;
	}
}