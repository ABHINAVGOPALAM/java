class Vector
{
	int x,y;
	Vector(int a,int b)
	{
		x=a;
		y=b;
	}
	void displayVec()
	{
		System.out.print("("+x+","+y+")\n");
	}
	Vector sum(Vector obj)
	{
		Vector robj=new Vector(0,0);
		robj.x=this.x+obj.x;
		robj.y=y+obj.y;
		return robj;
	}
}

class PassingAndReturningObjects
{
	public static void main(String args[]) 
	{
		Vector v1=new Vector(10,20);
		Vector v2=new Vector(31,18);
		System.out.print("v1 : ");
		v1.displayVec();
		System.out.print("v2 : ");
		v2.displayVec();
		Vector v3;
		v3=v1.sum(v2);
		System.out.print("Sum of v1 and v2 : ");
		v3.displayVec();
	}	
	
}
