class ThrowEx
{
	void f() throws NullPointerException
	{
		throw new NullPointerException("Exception thrown in ThrowEx class manually");
	}
}

class Exception3
{
	public static void main(String args[]) 
	{
		ThrowEx obj=new ThrowEx();
		try
		{
			obj.f();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught : \n"+e);
		}
		
	}
}
