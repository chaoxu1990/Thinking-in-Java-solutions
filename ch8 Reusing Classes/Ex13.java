//Ex13.java

class A{
	void Md(){System.out.println("Void");}
	void Md(int i){System.out.println("Int: " + i);}
	void Md(double f){System.out.println("Double: " + f);}
}


class B extends A{
	void Md(int i, double f){
	double Result  = i*1.0 + f;
	System.out.println("Extend Result: " + Result);
	}
}

public class Ex13{
	public static void main(String[] args){
		A a = new A();
		B b = new B();
		a.Md();
		a.Md(1);
		a.Md(2.0);
		b.Md(3,4.0);
	}
}