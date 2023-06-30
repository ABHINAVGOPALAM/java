
//Program to demonstrate User Input in an array

import java.util.*;
class BubbleSort
{
	public static void main(String args[]) {
	int temp,n;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter size of array :");
			n=s.nextInt();
	
	int a[]= new int[n];	
	
	System.out.println("Ente r the elements : ");
	for(int i=0;i<n;i++)
		a[i]=s.nextInt();
	System.out.print("\nArray before Sorting : ");
	for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
	for(int i=0;i<n;i++){
		for(int j=0;j<n-1;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	System.out.print("\nArray after Sorting : ");
	for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
	System.out.println("");
	}	
}	
