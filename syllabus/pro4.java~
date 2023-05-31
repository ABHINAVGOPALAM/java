import java.util.*;

abstract class Shape
{
  float x,y;
  abstract void printArea();
}

class Rectangle extends Shape
{
  Rectangle(float len,float bre)
  {
    x=len;
    y=bre;
  }
  void printArea()
  {
    System.out.println("Area of rectangle of length "+x+" breadth "+y+" is :"+(x*y));
  }
}

class Triangle extends Shape
{
  Triangle(float base,float height)
  {
    x=base;
    y=height;
  }
  void printArea()
  {
  	System.out.println("Area of triangle with base "+x+" height "+y+" is :"+(0.5*x*y));
  }
}

class Circle extends Shape
{
  Circle(float radius)
  {
    x=radius;
  }
  void printArea()
  {
  	System.out.println("Area of Circle with radius "+x+" is :"+(3.14*x*x));
  }
}
class pro4
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter values of x and y");
    System.out.println("x : ");
    float a= s.nextFloat();
    System.out.println("y : ");
    float b= s.nextFloat();
    Shape ob;
    ob=new Rectangle(a,b);
    ob.printArea();
    ob=new Triangle(a,b);
    ob.printArea();
    ob=new Circle(a);
    ob.printArea();
  }
}
    
    
    

