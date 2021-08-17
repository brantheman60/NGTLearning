package ngtlearning;

public class TestEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e = new Principal(); //"e" can be any subclass! This is polymorphism
		System.out.println("Title : "+e.getTitle());
		
		e = new ScienceTeacher();
		System.out.println("Title : "+e.getTitle());

	}

}
