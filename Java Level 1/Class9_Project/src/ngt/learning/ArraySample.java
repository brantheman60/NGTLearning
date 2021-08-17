package ngt.learning;

public class ArraySample {

	/**
	 * int numbers[] = new int[] {100,90,67,44,56,67,72,81,56,19}
	 */
	public static void main(String[] args) {
		//assign array
		int [] myArray;
		
		//set length of array, or how much it can contain
		myArray = new int[10];
		//assign a value to each array element one by one
		for (int i = 0; i < myArray.length; i++)
		{
			myArray[i] = i;
		}
		//print a value for entire array
		for (int i = 0; i < myArray.length; i++)
		{
			System.out.println(myArray[i]);
		}
		System.out.println();
		

	}

}
