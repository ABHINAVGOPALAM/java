class StringDemo
{
	public static void main(String args[]) 
	{
		String a="Helloworld";
		String b="Hello";
		System.out.println("String a : "+a+"\nString b : "+b);
		System.out.println("Length of string a is : "+a.length());
		System.out.println("Character at index 2 in a is : "+a.charAt(2));
		if (a.equals(b)) { // 
		System.out.println("Address of a is equal to b");
		} else { // 
		System.out.println("Address of a is not equal to b");
		}
		
	}
	
}
