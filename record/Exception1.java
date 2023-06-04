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
