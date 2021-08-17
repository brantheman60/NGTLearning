package ngtlearning;

public class Employee {
	String name;
	String address;
	String contactNumber;
	
	public String getName(){
		return name;
	}
	public void setName(String empName){
		name = empName;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String empAdd){
		address = empAdd;
	}
	public String getContactNumber(){
		return contactNumber;
	}
	public void setContactNumber(String empContact){
		contactNumber = empContact;
	}
	public String getTitle(){
		return "Employee of SuperSchool";
	}
}
