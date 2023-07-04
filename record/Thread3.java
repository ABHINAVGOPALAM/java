import java.util.*;
class Thread1 extends Thread
{
	Thread1()
	{
		start();
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			Random r=new Random();
			int n=r.nextInt(100);
			System.out.print("\nThread 1 : ");
			System.out.println("Random number generated : "+n);
			if(n%2==0)
			{
				new Thread2(n);
			}
			else
			{
				new Thread03(n);
			}
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread 1 interupted "+e);
			}
		}
	}
}

class Thread2 extends Thread
{
	int val;
	Thread2(int x)
	{	
		val=x;
		start();
	}
	public void run()
	{
		System.out.print("Thread 2 : ");
		System.out.println("Even Number,Square of "+val+" : "+val*val);
	}
}

class Thread03 extends Thread
{
	int val;
	Thread03(int x)
	{	
		val=x;
		start();
	}
	public void run()
	{
		System.out.print("Thread 3 : ");
		System.out.println("Odd Number,Cube of "+val+" : "+val*val*val);
	}
}
class Thread3
{
	public static void main(String args[])
	{
		
		new Thread1();
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main interrupted"+e);
		}
		System.out.println("Main Thread exited");
	}
}

