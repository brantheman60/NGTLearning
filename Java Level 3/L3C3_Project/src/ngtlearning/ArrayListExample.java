package ngtlearning;

import java.util.ArrayList;

public class ArrayListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Math");
		arrayList.add("History");
		arrayList.add("Science");
		arrayList.add("PE");
		System.out.println(arrayList);
		
		System.out.println("Element at index 1: "+arrayList.get(1));
		System.out.println("Is there PE in the list? "+arrayList.contains("PE"));
		System.out.println("Size of the arraylist is "+arrayList.size());
		
		arrayList.add(1, "English");
		System.out.println(arrayList);
		System.out.println("Index of Science is "+arrayList.indexOf("Science"));

	}

}
