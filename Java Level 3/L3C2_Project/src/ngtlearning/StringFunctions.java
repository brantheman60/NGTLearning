package ngtlearning;

public class StringFunctions {

	String string1 = new String("My name is Bond..");
	StringBuilder sb1 = new StringBuilder("Java is ");
	
	public void stringFunc()
	{
		System.out.println("Length of String1: "+string1.length());
		System.out.println("Actual Length of String1: "+string1.trim().length());
		
		System.out.println("Char at 3 in String1: "+string1.charAt(3));
		
		System.out.println("Index of n in String1: "+string1.indexOf('n'));
		
		System.out.println("Index of n after 10th position in String1: "
							+string1.indexOf('n',10));
		
		System.out.println("Replace in String1: "+string1.replaceFirst("n", "N"));
		
		System.out.println("Substring from pos 10: "+string1.substring(11));
		System.out.println("Substring from pos 10 to 15: "+string1.substring(11,15));
	}
	public void stringBuilderFunc()
	{
		System.out.println("Length of sb1: "+sb1.length());
		
		System.out.println("Append to sb1: "+sb1.append("cool language"));
		
		System.out.println("Inseting string into sb1: "+sb1.insert(8, "super"));
		
		System.out.println("Deleting string into sb1: "+sb1.delete(8,14));
		
		System.out.println("Reversing sb1: "+sb1.reverse());
	}
	
	public static void main(String[] args) {
		StringFunctions myObject = new StringFunctions();
		myObject.stringFunc();
		System.out.println("\n");
		myObject.stringBuilderFunc();
	}
}
