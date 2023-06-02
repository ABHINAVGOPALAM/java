class X1
{
	void display()
	{
		System.out.println("Method defined Inside thw class X1");
	}
}

interface X2
{
	void callMe();
}
interface X3
{
	void callMe();
}

class X4 extends X1 implements X2,X3
{
	public void callMe()
	{
		System.out.println("Method for Interfaces");
	} 
	
	void f()
	{
		System.out.println("Method declared inside X4 class");
	}
}

class HybridInheritance
{
	public static void main(String args[]) 
	{
		X4 ob=new X4();
		ob.callMe();
		ob.f();
		ob.display();
	}
}
