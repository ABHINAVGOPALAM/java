interface Calculator 
{
    int add(int a, int b);
    int subtract(int a, int b);
}

class BasicCalculator implements Calculator
{
    public int add(int a, int b) 
    {
        return a + b;
    }

    public int subtract(int a, int b) 
    {
        return a - b;
    }
}

class Interfaces2 
{
  public static void main(String[] args) 
  {
  
    Calculator calculator = new BasicCalculator();
    
    int sum = calculator.add(5, 3);
    System.out.println("Sum: " + sum);

    int difference = calculator.subtract(10, 4);
    System.out.println("Difference: " + difference);
  }
}

