package labbook;
import java.util.*;
public class Lab5Exercise4 {
	
	public static void main(String []args) throws ValueNullException
	{
		Scanner in=new Scanner (System.in);
		String firstname,lastname;
		System.out.print("Enter the firstname: ");
		firstname=in.nextLine();
		
		System.out.print("Enter the lastname: ");
		lastname=in.nextLine();
		
		if (lastname.isEmpty()||firstname.isEmpty())
		{
			ValueNullException exception =new ValueNullException("first name or last name is empty");
			throw exception;
		}
		
		System.out.println(firstname);
		System.out.println(lastname);
		}

}
