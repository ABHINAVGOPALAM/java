
//Program to demonstrate Multiple Inheritance
//Using Interface and a class

interface A1{
	void display();
}
class M1{
	int x;
	void showX()
	{
		System.out.println("x : "+x);
	}
}

class M2 extends M1 implements A1{
	public void display()
	{
		System.out.println("Inside class M2");
	}
}

class MultipleInheritance{
	public static void main(String args[]) {
		M2 ob=new M2();
		ob.x=10;
		ob.display();
		ob.showX();
	}
}
