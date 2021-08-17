package ngtlearning;

import java.util.Scanner;
import java.util.Random;

public class RollDice {

	private int diceRoll(){
		Random r = new Random();
		return r.nextInt(6) + 1;
	}
	public int[] multiDiceRoll(int times)
	{
		int[] output=new int[times];
		for (int i=0;i<times;i++)
			output[i] = diceRoll();
		return output;
	}
	public int sumMultiDiceRoll(int[] val){
		int sum = 0;
		for(int i=0; i<val.length; i++)
			sum += val[i];
		return sum;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How many times you want to roll the dice?");
		int times = s.nextInt();
		
		RollDice dice = new RollDice();	
		int[] values = dice.multiDiceRoll(times);
		System.out.println("Dice roll results are:");
		for (int i=0;i<values.length;i++)
			System.out.print(values[i] + " ");
		
		System.out.println();
		System.out.println("Sum of all the dice rolls is: ");
		System.out.print(dice.sumMultiDiceRoll(values));
		s.close();
		
		
	}

}
