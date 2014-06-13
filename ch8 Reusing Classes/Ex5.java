//Ex5.java

class A{
	A(){System.out.println("A()");}
}

class B{
	B(){System.out.println("B()");}
}

public class Ex5 extends A{
	private B b = new B();
	public static void main(String [] args){
		Ex5 c = new Ex5();
		System.out.println("Finished!");
	}
}