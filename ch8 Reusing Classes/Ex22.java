//Ex22

final class A {
	final void g() { System.out.println("A.g()"); }
} 

//Error: Cannot inherit from final class
//public class Ex22 extends A{
public class Ex22 {
	public static void main(String[] args) {
		A a = new A();
		a.g();
	
		System.out.println("Hello World!");
		
	}
}