package ngtlearning;

public class Principal extends Employee{
//this method is the new stuff!!!
	public String getTitle(String name)
	{
		return "Principal of SuperSchool";
	}
	private void runSchool()
	{
		System.out.println("Decide Candidates for Sunday School...");
		System.out.println("Make Sure Teachers are Performing Poorly...");
	}
	private void attendMeetings()
	{
		System.out.println("Daily beating with Vice-Principal");
		System.out.println("Go to district office for millenial meeting..");
		System.out.println("Every Friday night drinking with all the teachers...");
	}
	public static void main(String[] args) {
		Principal head = new Principal();
		head.setName("Ms. Doubtfire");
		head.setAddress("420 Blaze Street, Obabya Triple, CA");
		head.setContactNumber("666-666-6666");
		
		System.out.println(head.getName());
		System.out.println(head.getAddress());
		System.out.println(head.getContactNumber());
		
		head.runSchool();
		head.attendMeetings();
		System.out.println(head.getTitle("name"));

	}

}
