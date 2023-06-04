
//Program to demonstrate Final class and methods

final class Math
{
  public final int add(int a, int b)
  {
    return a + b;
  }
}

class FinalClass 
{
  public static void main(String args[]) 
  {
    Math obj = new Math();
    int sum = obj.add(5, 3);
    System.out.println("Sum of 5 and 3 is : " + sum);
  }
}

