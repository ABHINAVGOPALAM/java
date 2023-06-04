
//Program to demonstrate this keyword

class T
{
  int x,y;
  T(int x,int y)
  {
  	this.x=x;
  	this.y=y;
  }
  void display(int x)
  {
  	System.out.println("Value of local variable x : "+x);
  	System.out.println("Value of instance variable x : "+this.x);
  }
}

class ThisDemo
{
	public static void main(String args[]) 
	{
		T obj=new T(3,4);
		obj.display(100);
	}
}
