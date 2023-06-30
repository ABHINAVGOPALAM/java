import java.util.*;
class Node
{
	int data;
	Node next;
	Node prev;

	Node(int x)
	{	
	data=x;
	}
}

class Dll
{
	static Node head=null,tail=null;
	static void insert(int x)
	{
		Node a=new Node(x);
		if(head==null)
		{
			head=a;
			tail=a;
			a.next=null;
			a.prev=null;
		}
		else
		{
			a.prev=tail;
			tail.next=a;
			tail=a;
			a.next=null;
		}
	}
	static void display()
	{
		if(head==null)
		{
			System.out.println("No elements to Display");
		}
		else
		{
			Node temp=head;
			System.out.print("\nElements in the list are : ");
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println("\n\n");
		}
	}

	static void delete(int x)
	{
		Node p1=head;
		Node p2=head;

		while(p1!=null&&p1.data!=x)
		{
			p2=p1;
			p1=p1.next;
		}
		if(p1==null)
		{
			System.out.println("Element Not Found");
		}
		else
		{
			if(p1==head)
			{
				if(p1==tail)
					head=tail=null;
				else
				{
					head=head.next;
					head.prev=null;
				}
			}
			else if(p1==tail)
			{
				tail=tail.prev;
				tail.next=null;
			}
			else
			{
				p2.next=p1.next;
				p1.next.prev=p2;
			}
		}
	}


	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int ch,x;
		while(true)
		{
			System.out.println("1.Insert at end\n2.Delete element\n3.Display\n4.exit");
			System.out.print("Enter your choice : ");
			ch=in.nextInt();
			System.out.println("");
			switch (ch)
			{
				case 1:
							{
									System.out.println("\n");
				 					System.out.print("Enter element to be inserted :");
									x=in.nextInt();
									insert(x);
									System.out.println("\n"+x+" is inserted into the list");
									break;
							}
				case 2:
							{
									System.out.print("Enter element to delete :");
									x=in.nextInt();
									delete(x);
									System.out.println("\n"+x+" is deleted from the list");
									break;
							}
				case 3: 
							{	
								display();
								break;
							}
				case 4:
							{
								System.exit(0);
								break;
							}
				default :System.out.println("Enter a valid choice ");
			}
		}
	}
}
