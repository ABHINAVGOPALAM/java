
//Program to show Abstract class and methods

abstract class Figure 
{
	abstract void shape();
	void show()
	{
		System.out.println("Inside Figure");
	}
}

class Circle extends Figure
{
	void shape()
	{
		System.out.println("inside shape circle");
	}
}

class Abstract
{
	public static void main(String args[]) 
	{
		Circle obj=new Circle();
		obj.shape();
		obj.show();
	}
}
