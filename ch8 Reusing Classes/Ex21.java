//Ex21

class A {
	final void g() { System.out.println("A.g()"); }
} 

public class Ex21 extends A{
	//can't override a final method
	//@Override void g(int i){System.out.println("Ex21.g(" + i + ")");}
	//Or
	//void g(){System.out.println("Ex21.g()");}
	
	//This(overload) is ok.
	void g(int i){System.out.println("Ex21.g(" + i + ")");}
	public static void main(String[] args) {
		Ex21 a = new Ex21();
		a.g();
		a.g(2);
		
	}
}