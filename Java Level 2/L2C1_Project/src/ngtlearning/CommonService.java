package ngtlearning;

public class CommonService {
	private float percent (float number, float percentage){
		return number * (percentage/100);
	}
	
	public float simpleInterest (float deposit, float rate, float time){
		return deposit + deposit*percent(1,rate)*time;
	}
	
	public float CompoundInterest (float deposit, float rate, float time){
		return (float) (deposit * Math.pow(1+ percent(1,rate),time));
	}
	
	public float areaTriangle (float base, float height){
		return (base*height)/2;
	}
	
	//The following is the homework:
	public float areaPentagon (float side){
		return (5/2 * (float) Math.pow(side, 2) * (float) Math.tan(54));
	}
	
	
	public float Tip (float cost, float rate){
		return (float) (cost* percent(1,rate));
	}
}
