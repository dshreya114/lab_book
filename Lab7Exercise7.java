package  labbook;

import java.util.*;

public class Lab7Exercise7 {

	public static void main(String[]args)
	{
		int [] arr= {12,43,476,5845,3723,21};
		int[]crr=getSorted(arr);
		for(int i: crr)
		{
			System.out.println(i);
		}
	}

	private static int[] getSorted(int[] arr) {
		int []brr=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			
			StringBuilder rev=new StringBuilder("");
			while(arr[i]>0)
			{
			
			rev=rev.append(arr[i]%10);
			arr[i]=arr[i]/10;
			}
			String x=new String(rev);
			brr[i]=Integer.parseInt(x);
		}
		return brr;
	}
}
