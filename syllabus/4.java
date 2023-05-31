
abstract class Shape
{
  int x,y;
  abstract void printArea();
}

class Rectangle extends Shape
{
  Rectangle(int len,int bre)
  {
    x=l;
    y=bre;
  }
  void printArea()
  {
    System.out.println("Area of rectangle of length "+x+" breadth "+y+" is :"+(x*y));
  }
}

class 4
{
  public static void main(String args[])
  {
    Rectangle ob=new Rectangle(10,5);
    ob.printArea();
  }
}
