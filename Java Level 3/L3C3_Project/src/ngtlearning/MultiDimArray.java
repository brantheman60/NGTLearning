package ngtlearning;

public class MultiDimArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MultiDimArray mda = new MultiDimArray();
		mda.printMultiDimArray();
	}
	public void printMultiDimArray()
	{
		String[][] names = {{"Mr. ", "Mrs. ", "Ms. "},
				{"Snyder", "Greens"}};
		System.out.println(names[0][0]+names[1][0]);//Mr. Snyder
		System.out.println(names[0][2]+names[1][1]);//Ms. Greens
		}
	}
