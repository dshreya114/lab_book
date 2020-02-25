package labbook;

public class Lab4 {
	
	public static void main(String []args) {
		int a = 25;
		System.out.print(digitSumCube(a));
	}
	
	static int digitSumCube(int arr)
	{
		int c=0,digit;
		while(arr>0)
		{
			digit = arr%10;
			arr  =   arr/10;
			c   =  c+(digit*digit*digit);		
		}
	
		return c;
	}
	

}
