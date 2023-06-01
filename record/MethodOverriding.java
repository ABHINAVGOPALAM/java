class MO1
{
	void f()
	{
		System.out.println("inside MO1");
	}
}
class MO2 extends MO1
{
	void f()
	{
		System.out.println("Inside MO2");
	}
}

class MethodOverriding
{
	public static void main(String args[]) 
	{
		MO1 ob1=new MO1();
		MO2 ob2=new MO2();
		ob1.f();
		ob2.f();
	}
}
	
