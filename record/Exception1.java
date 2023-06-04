
//Program to demonstrate Exception Handling 1
//Using Try and catch block

class Exception1
{
	public static void main(String args[]) 
	{
		try
		{
			int x;
			x=12/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught exception "+e);
		}
	}
}	
