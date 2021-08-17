package ngtlearning;

import java.util.Scanner;

public class EvenOddNumbers {

	private void FindEvenOdd(int n){
		int[] evens = new int[n/2];
		int[] odds = new int[n/2 + n%2];
		for (int i=1; i<=n; i++){
			if (i%2==0)
				evens[i/2-1]=i; //starts with evens[2/2 - 1], or evens[0]
			else
				odds[i/2]=i; //starts with odds[1/2], or odds[0]
		}
		for (int i=0; i<evens.length;++i){
		  System.out.print(evens[i]+" ");
		}
		System.out.println();
		for (int i=0; i<odds.length;++i){
			  System.out.print(odds[i]+" ");
			}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please type in your number.");
		int number = s.nextInt();
		
		EvenOddNumbers myObject = new EvenOddNumbers();
		myObject.FindEvenOdd(number);
		s.close();
		}
	}