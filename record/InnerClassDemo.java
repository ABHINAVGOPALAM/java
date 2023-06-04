
//Program to desmostrate Inner class 1

class Outer
{
	int outerx=10;
	void instantiateInner()
	{
		Inner obj=new Inner();
		obj.display();
	}
	class Inner
	{
		void display()
		{
			System.out.println("Value od outerx : "+outerx);
		}
	}
}

class InnerClassDemo
{
	public static void main(String args[]) 
	{
		Outer ob=new Outer();
		ob.instantiateInner();
	}
}
