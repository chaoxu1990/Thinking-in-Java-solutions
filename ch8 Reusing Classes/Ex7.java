//Ex7.java

class A{
	A(int i){System.out.println("A(" + i + ")");}
}

class B{
	B(char c){System.out.println("B(" + c + ")");}
}

public class Ex7 extends A{
		Ex7(char c){
		super(5);
		System.out.println("C(" + c + ")");
		}

	private B b = new B('b');
	public static void main(String [] args){
		Ex7 c = new Ex7('c');
		System.out.println("Finished!");
	}
}
