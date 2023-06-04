class Circle 
{
  private final double PI = 3.14159;
  private final int radius;

  Circle(int radius) 
  {
        this.radius = radius;
  }

  double calculateArea() 
  {
    return PI * radius * radius;
  }
}
public class FinalVar
{
  public static void main(String args[]) 
  {
    Circle circle = new Circle(5);
    System.out.println("Area of the circle of radius 5 is : " + circle.calculateArea());
  }
}

