package labbook;

interface Power3{
	void power(String x,String y);
}

public class Lab10Exercise3 {
	public static void main(String[]args)
	{
		
	 Power3 fobj = (x,y) -> {
		 if (x=="SHREYA" && y=="DUBEY") 
			 System.out.println(true);
		 else
			 System.out.println(false);
	 };
	 
	 fobj.power("NAVDEEP","TRIPATHI");
     }
}