package ngtlearning;

public class ScienceTeacher extends Employee{

	private void teachScience()
	{
		System.out.println("Every Physic class...");
		System.out.println("Everyday is for teaching life science...");
		System.out.println("Friday is the weekly Nazi Selection Day...");
	}
	
	public static void main(String[] args) {
		ScienceTeacher teacher = new ScienceTeacher();
		teacher.setName("Mrs. Woman");
		teacher.setAddress("123 Sesame Street, Whodidit, ME");
		teacher.setContactNumber("999-513-8008");
		
		System.out.println(teacher.getName());
		System.out.println(teacher.getAddress());
		System.out.println(teacher.getContactNumber());
		
		teacher.teachScience();
		System.out.println(teacher.getTitle());
	}

}
