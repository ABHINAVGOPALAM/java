
//Program to demonstrate Multilevel Inheritance

class C1
{
	int a=1;
}
class C2 extends C1
{
	int b=2;
}
class C3 extends C2
{
	int c=3;
	void display()
	{
		System.out.println("Values of : ");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
	}
}
class MultliLevelInheritance
{
	public static void main(String args[]) 
	{
		C3 obj=new C3();
		obj.display();
	}
}