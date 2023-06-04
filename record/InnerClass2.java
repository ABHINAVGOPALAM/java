class Outer 
{
  private int outerData = 10;

  class Inner 
  {
    void display() 
    {
      System.out.println("Outer data: " + outerData);
    }
  }
}

class InnerClass2
{
  public static void main(String args[])
  {
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();
    inner.display();
  }
}

