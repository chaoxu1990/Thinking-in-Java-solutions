//Ex8

class A{
	void a(){
	System.out.println("a");
	b();
	this.b();
	}
	void b(){
	System.out.println("b");
	}
}
public class Ex8{
	
	public static void main(String[] args){
	A a = new A();
	System.out.println("Calling a()");	
	a.a();
	System.out.println("Calling b()");	
	a.b();
	}
}