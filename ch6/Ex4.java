//Ex4

class A{
	A(){
	System.out.println("Print");
	}
	A(String s){
	System.out.println("Print " + s);
	}
}
public class Ex4{
	
	public static void main(String[] args){
	
	A a1 = new A();
	A a2 = new A("a2");
	}
}