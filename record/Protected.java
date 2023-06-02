class P1
{
	protected void disp()
	{
		System.out.println("Declared inside Protected Method");
	}
	protected int x=10;
}

class P2 extends P1
{
	void f()
	{
		System.out.println("inside p2");
	}
}

class Protected
{
	public static void main(String args[]) 
	{
		P2 obj=new P2();
		obj.disp();
		System.out.println("value of protected var x : "+obj.x);
	}
}
