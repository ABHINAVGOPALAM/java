
//Program to demonstrate Static Block

class Stati
{
	static int a;
	static void display()
	{
		System.out.println("Value of a = "+a);
	}
	static
	{
		System.out.println("This is static block executed first setting a value to 10");
		a=10;
	}
}

class StaticBlock
{
	public static void main(String args[]) 
	{
		Stati.display();
	}		
}
