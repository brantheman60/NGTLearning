package ngtlearning;

import java.util.ArrayList;

public class GradeHandler {

	private ArrayList myGradesArray;
	public GradeHandler()
	{
		myGradesArray = new ArrayList();
	}
	public void add(int newGrade)
	{
		if (newGrade <= -1)
			throw new IllegalArgumentException("no negative grades allowed");
		else
			myGradesArray.add(new Integer(newGrade));
		
	}
	public double computeAverage()
	{
		int sum = 0;
		for (int i = 0; i<myGradesArray.size(); i++)
		{
			sum += ((Integer) myGradesArray.get(i)).intValue();
		}
		if(myGradesArray.size() <= 0)
			throw new ArithmeticException("cannot divide by zero, " +
					"at least one grade must be entered");
		return (double) sum/myGradesArray.size();
	}
}
