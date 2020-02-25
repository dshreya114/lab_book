package labbook;
import java.util.Arrays;

public class Lab7Exercise5 {
	
	public static void main(String []args) {
		int array[]= {5,10,23,1,121};
		System.out.print(getSecondSmallest(array));
	}
	
	static int getSecondSmallest(int arr[])
	{
		Arrays.sort(arr);
		return arr[1];
	}
	
}
