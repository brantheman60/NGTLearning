package ngtlearning;

public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Arrays arrays = new Arrays();
		arrays.printMultiDimTable();
	}
	public void printMultiDimTable()
	{
		int[] data = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i=0; i<10;i++){
			for (int j=0; j<10;j++){
				System.out.print(data[j]*data[i]+ " ");
			}
			System.out.println();
		}
	}

}
