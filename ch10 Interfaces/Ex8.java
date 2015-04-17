//Chapter 10, Exercise 8


interface FastFood{
    void A();
    void B();
    void C();
}
class Meal {
	Meal() { System.out.println("Meal()"); }
}

class Bread {
	Bread() { System.out.println("Bread()"); }
}

class Cheese {
	Cheese() { System.out.println("Cheese()"); }
}

class Lettuce {
	Lettuce() { System.out.println("Lettuce()"); }
}

class Pickle {
	Pickle() { System.out.println("Pickle()"); }
}

class Lunch extends Meal {
	Lunch() { System.out.println("Lunch()"); }
}

class PortableLunch extends Lunch {
	PortableLunch() { System.out.println("PortableLunch()"); }
}

public class Ex8 extends PortableLunch implements FastFood {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Pickle p = new Pickle();
	private Lunch l = new Lunch();
	public Ex8() { System.out.println("Sandwich()"); }
	public void A() { System.out.println("A()"); }
	public void B() { System.out.println("B()"); }
	public void C() { System.out.println("C()"); }
	public static void main(String[] args) {
		 Ex8 x = new Ex8();
         x.A();
         x.B();
         x.C();
	}
}

