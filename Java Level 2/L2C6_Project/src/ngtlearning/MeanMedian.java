package ngtlearning;

import java.util.Arrays;

public class MeanMedian {

	private double findMean(double[] numbers)
	{
		double mean = 0;
		for (int i = 0; i < numbers.length; i++){
			mean +=numbers[i];
		}
		return mean/ numbers.length;
	}
	
	private double findMedian(double[] numbers)
	{
		Arrays.sort(numbers);
		if (numbers.length%2 ==0) // if number of elements is even
		{
			double first = numbers[(numbers.length/2)-1];
			double second = numbers[(numbers.length/2)];
			return (first+second)/2;
		} else
		{
			return numbers[(numbers.length-1)/2];
		}
	}
	
	public static void main(String[] args) {
		double[] seq = {20,34,40.5,49,43,39,36};
		MeanMedian myObject = new MeanMedian();
		double mean = myObject.findMean(seq);
		System.out.println("Mean is: "+mean);
		
		double median = myObject.findMedian(seq);
		System.out.println("Median is: "+median);
	}

}
