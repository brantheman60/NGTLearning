package ngtlearning;

public class Student {
	String name;
	int grade;
	int id;
	
	public Student(String name){
		this.name = name; //this variable "this" means "the <variable> that belongs to me"
						  //so this variable calls the variable "name" in the lines above
						  //this is done because there could be a conflict with the two "name" variables
	}
	public void studentGrade(int studentGrade){
		grade = studentGrade; //"this" not needed here because parameter variable causes no conflict
	}
	public void studentId(int studentId){
		id = studentId;
	}
	public void printDetails(){
		System.out.println("Name: "+name);
		System.out.println("Grade: "+grade);
		System.out.println("ID: "+id);
	}
	
}
