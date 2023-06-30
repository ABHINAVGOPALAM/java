
//Program to demonstrate Exception Handling 3
//Using throw and throws keyword

class ThrowEx
{
	void f() throws NullPointerException
	{
		throw new NullPointerException("weiufvbbvf");
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
