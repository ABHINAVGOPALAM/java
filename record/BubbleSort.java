class BubbleSort
{
	public static void main(String args[]) 
	{
	int temp,n;
	int a[]={1,45,8,99,34,0,-34,86};
	n=a.length;
	System.out.print("Array before Sorting : ");
	for(int i=0;i<n;i++)
	{
		System.out.print(a[i]+" ");
	}
	for(int i=0;i<n;i++)
	{
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
	{
		System.out.print(a[i]+" ");
	}
	System.out.println("");
	}	
}	