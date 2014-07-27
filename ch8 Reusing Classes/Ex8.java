//Ex8.java

class A{
	A(int i){System.out.println("A(" + i + ")");}
}


public class Ex8 extends A{
		Ex8(char c){
		super(0);
		System.out.println("C(" + c + ")");
		}
		
		Ex8(){
		super(1);
		System.out.println("C()");
		}
		
	public static void main(String [] args){
		Ex8 c1 = new Ex8('c');
		Ex8 c2 = new Ex8();
		
		System.out.println("Finished!");
	}
}