package com.ngtlearning.example;

public class Addition {
	int firstNumber;
	int secondNumber;
	
	public Addition(int num1, int num2){ //constructor because it creates new things with arguments
		firstNumber = num1;
		secondNumber = num2;
	}
	
	public int getTotal(){
		return (firstNumber + secondNumber); //method because will do an action
	}
}
