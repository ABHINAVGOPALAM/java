import java.util.*;

class Calc
{
	int add(int x,int y)
	{
		return x+y;
	}
	int sub(int x,int y)
	{
		return x-y;
	}
	int mul(int x,int y)
	{
		return x*y;
	}
}

class UserInput
{
	public static void main(String args[]) 
	{
		int x,y;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First Number : ");
		x=s.nextInt();
		System.out.println("Enter Second Number : ");	
		y=s.nextInt();
		Calc ob=new Calc();
		System.out.println("Sum of "+x+" and "+y+" is : "+ob.add(x,y));
		System.out.println("Difference of "+x+" and "+y+" is : "+ob.sub(x,y));
		System.out.println("Product of "+x+" and "+y+" is : "+ob.mul(x,y));
		
	}
	
}	
	
