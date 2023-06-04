
//Program to demostrate Access Specifiers

class Test 
{
	int a;
	public int b;
	private int c;
	void setc(int i)
	{
		c=i;
	}
	int getc()
	{
		return c;
	}
}
class Access
{
	public static void main(String args[]) 
	{
		Test ob=new Test();
		ob.a=10;
		ob.b=20;
		ob.setc(15);
		System.out.println("deafult variable : a\nPublic variable : b\nPrivate Variable : c");
		System.out.println("a : "+ob.a+" b : "+ob.b+" c : "+ob.getc());
	}
}

	
