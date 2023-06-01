class A
{
  int x,y;
  A()
  {
    x=y=0;
  }
  
  A(int z)
  {
    x=y=z;
  }
  A(int a,int b)
  {
    x=a;
    y=b;
  }

  void display()
  {
    System.out.println("Values of x:"+x+",y:"+y);
  }

}
class ConstructorOverloading
{
  public static void main(String[] args) 
  {
		A ob1=new A();
		A ob2=new A(118);
		A ob3=new A(31,11);
	  ob1.display();
		ob2.display();
	  ob3.display();
  }
}
