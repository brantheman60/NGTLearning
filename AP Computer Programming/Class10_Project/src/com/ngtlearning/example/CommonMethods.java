package com.ngtlearning.example;

public class CommonMethods {
	public float percent (float number, float percentage){
		return number * (percentage/100);
	}
	
	public float tip (float number, float percentage){
		return number * (percentage/100);
	}
	
	public float discount (float number, float percentage){
		return number - percent(number, percentage);
	}
	
	public float simpleInterest (float deposit, float rate, float time){
		return deposit + deposit*percent(1,rate)*time;
	}
	
	public float compoundInterest (float deposit, float rate, float time){
		return (float) (deposit * Math.pow(1+percent(1,rate),time));
	}
}
