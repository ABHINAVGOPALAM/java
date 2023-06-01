class S1
{
	int x,y;
	S1(int a,int b)
	{
		x=a;
		y=b;
	}
}
class S2 extends S1
{
	int x;
	S2(int p,int q,int r)
	{
		super(p,q);
		x=r;
	}
	void display()
	{
		System.out.println("Values of x,y and x(base class member) are :"+super.x+" , "+y+" , "+x);
	}
}

class Super
{
	public static void main(String args[]) 
	{
		S2 obj=new S2(1,2,3);
		obj.display();
	}
}
	
