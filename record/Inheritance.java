class I1
{
	int i,j;
	void showij()
	{
		System.out.println("i : "+i+"\nj : "+j);
	}
}
class I2 extends I1
{
	int k;
	void showk()
	{
		System.out.println("k : "+k);
	}
	void sum()
	{
		System.out.println("Sum of i,j,k is : "+(i+j+k));
	}
}

class Inheritance
{
	public static void main(String args[]) 
	{
		I2 obj=new I2();
		obj.i=10;
		obj.j=20;
		obj.k=30;
		obj.showij();
		obj.showk();
		obj.sum();
	}
}
