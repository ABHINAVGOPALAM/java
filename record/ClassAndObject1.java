
//Program to demonstrate Class creation and Object creation

class Coordinate
{
  int x,y;
  void display()
  {
    System.out.println("Coordinates are : ("+x+","+y+")");
  }
}

class ClassAndObject1
{
  public static void main(String[] args)
  {
    Coordinate ob1;
    ob1=new Coordinate();

    ob1.x=10;
    ob1.y=5;

    ob1.display();
  }
}