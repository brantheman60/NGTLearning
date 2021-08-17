package ngtlearning;

public class Counseler extends Employee{

	public String getTitle(String name)
	{
		return "The Chosing One";
	}
	private void provideCounseling()
	{
		System.out.println("Counseling Meetings with students every Mon, Wed & Fri...");
		System.out.println("Tuesday & Thursday Counseling Meetings with Staff...");
	}
	
	public static void main(String[] args) {
		Counseler schoolCounseler = new Counseler();
		schoolCounseler.setName("Mr. Snyder");
		schoolCounseler.setAddress("2000 Magic Street, Cool City, CA");
		schoolCounseler.setContactNumber("111-222-5555");
		
		System.out.println(schoolCounseler.getName());
		System.out.println(schoolCounseler.getAddress());
		System.out.println(schoolCounseler.getContactNumber());
		
		schoolCounseler.provideCounseling();
		System.out.println(schoolCounseler.getTitle("pickle"));
	}

}
