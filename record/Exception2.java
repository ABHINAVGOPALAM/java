class Exception2
{
	public static void main(String args[]) 
	{
		try
		{
			int arr[]= new int[5];
			arr[6]=10;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Caught exception : \n"+e);
		}
	}
}	
