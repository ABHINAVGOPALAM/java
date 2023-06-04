
//Program to demonstrate use of Constructor in java

class Rectangle
{
  float length,breadth;
  Rectangle(float x,float y)
  {
    length=x;
    breadth=y;
	}
	void display()
	{
		System.out.println("Lenght of the rectangle : "+length);
		System.out.println("Breadth of the rectangle : "+breadth);
		System.out.println("Area = "+(length*breadth));
	}
}

class Constructor
{
	public static void main(String args[]) 
	{
		Rectangle ob=new Rectangle(11,8);
		ob.display();
	}
}
