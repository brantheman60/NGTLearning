package ngtlearning;

import java.util.Arrays;

public class ArraySorting {

	/**
	 * a program to sort numbers in an array (from smallest to largest)
	 * this is based of a method within java.util.Arrays
	 */
	public static void main(String[] args) {
		ArraySorting arrSorting = new ArraySorting();
		arrSorting.sortNumbers();
	}
	public void sortNumbers(){
		int numberArray[] = {2,5,11,7,89,54,22,67};
		System.out.println("Printing Unsorted numberArray...");
		for (int i = 0; i < numberArray.length; i++){
			System.out.print(numberArray[i]+" ");
		}
		Arrays.sort(numberArray); //this is where the magic is
		System.out.println();
		System.out.println("Printing Sorted numberArray...");
		for (int i = 0; i < numberArray.length; i++){
			System.out.print(numberArray[i]+" ");
		}
	}

}