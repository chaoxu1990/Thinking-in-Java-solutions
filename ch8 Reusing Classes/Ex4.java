//Ex4.java


class A {
	A() { System.out.println("A()"); }
}

class B extends A {
	B() { System.out.println("B()"); }
}

class C extends B {C(){System.out.println("C()");}}

public class Ex4 extends C{
	Ex4(){System.out.println("Ex4()");}
	public static Ex4 maker(){return new Ex4();}
	public static void main(String[] args) {
		Ex4 e = new Ex4();
		Ex4 e2 = maker();
	}
	
}

class D extends Ex4{
	D(){System.out.println("D()");}
	public static void main(String [] args){
		Ex4 e = new Ex4();
		//test Ex4;
		e.main(args);
	}
}