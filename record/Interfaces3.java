interface Drawable 
{
  void draw();
}

class Circle implements Drawable
{
  public void draw()
  {
    System.out.println("Drawing a circle");
  }
}

class Rectangle implements Drawable 
{
  public void draw()
  {
    System.out.println("Drawing a rectangle");
  }
}

class Interfaces3 
{
  public static void main(String[] args)
  {
    Drawable circle = new Circle();
    circle.draw();

    Drawable rectangle = new Rectangle();
    rectangle.draw();
  }
}

