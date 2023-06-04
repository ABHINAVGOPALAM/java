interface Animal 
{
  void makeSound();
}

class Dog implements Animal 
{
  public void makeSound() 
  {
    System.out.println("Woof!");
  }
}

class Cat implements Animal 
{
	public void makeSound() 
  {
		System.out.println("Meow!");
  }
}

class Interfaces1
	{
    public static void main(String args[]) 	
    {
        Animal dog = new Dog();
        dog.makeSound();

        Animal cat = new Cat();
        cat.makeSound();
    }
}

