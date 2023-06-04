class E1
{
	void m1() throws ArithmeticException
	{
		try
		{
			throw new ArithmeticException("thrown in E1 class handled in main");
		}
		finally
		{
			System.out.println("Inside E1 finnaly block");
		}
	}
}

class E2
{
	void m2()
	{
		try
		{
			System.out.println("Inside try of E1");
			return;
		}
		finally
		{
			System.out.println("Inside Finally Block of E2");
		}		
	}
}

class Exception4
{
	public static void main(String args[]) 
	{
		E1 obj1=new E1();
		E2 obj2=new E2();
		
		try
		{
			obj1.m1();
		}	
		catch(Exception e)
		{
			System.out.println("Caught Exception : "+e);
		}
		obj2.m2();
	}
}
