
//Program to Demonstrate Upcasting

class D1{
	void display(){
		System.out.println("Inside D1");
	}
}
class D2 extends D1{
	void display(){
		System.out.println("Inside D2");
	}
}
class D3 extends D2{
	void display(){
		System.out.println("Inside D3");
	}
}

class DMD{
	public static void main(String args[]) {
		D1 ref;
	ref=new D1();
	ref.display();
	ref=new D2();
	ref.display();
	ref=new D3();
	ref.display();
	}
}
