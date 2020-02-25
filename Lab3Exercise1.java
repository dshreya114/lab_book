package labbook;

import java.util.Arrays;

public class Lab3Exercise1 {
	
	public static void main(String []args) {
		int array[]= {10,4,3,1,11,545,13};
		System.out.print(getSecondSmallest(array));
	}
	static int getSecondSmallest(int arr[])
	{
		Arrays.sort(arr);
		return arr[1];
	}
}
