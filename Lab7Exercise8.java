package  labbook;

import java.util.*;

public class Lab7Exercise8 {

	public static void main(String[]args)
	{
		int [] arr= {33,621,11,11,2323,55,55,3,89};
		int[]crr=modifyArray (arr);
		for(int i: crr)
		{
			System.out.println(i);
		}
	}

	private static int[] modifyArray (int[] arr) 
	{
		
		ArrayList list=new ArrayList();
		for(int i=0;i<arr.length;i++)
		{
			if(!list.contains(arr[i]))
			list.add(arr[i]);
			else 
				continue;
			
		}
		Collections.sort(list);
		int []brr=new int[list.size()];
		int j=list.size()-1;
		for(Object i:list)
		{
			brr[j]=(int)i;
			j--;
		}
		return brr;
	}
}
