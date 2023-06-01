class StaticTest
{
	static int a=3;
	static void dispA()
	{
		System.out.println("Value of a : "+a);
	}
}

class StaticDemo
{
	public static void main(String args[]) 
	{
		StaticTest.dispA();
		StaticTest.a=11;
		StaticTest.dispA();
	}
}
