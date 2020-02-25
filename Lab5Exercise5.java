package labbook;

import java.util.Scanner;

public class Lab5Exercise5 {
	
	public static void main(String []args) throws AgeBelow15Exception
	{
		Scanner in=new Scanner (System.in);
		int age;
		System.out.print("Enter the age: ");
		age=in.nextInt();
		
		
		
		if (age<=15)
		{
			AgeBelow15Exception exception =new AgeBelow15Exception("Age is below 15");
			throw exception;
		}
		else
		System.out.println("Age is "+age);	
		
	}

}
