//Ex10.java

class Component1{
	Component1(int i){System.out.println("Component1(" + i + ")");}
}

class Component2{
	Component2(int i){System.out.println("Component2(" + i + ")");}
}

class Component3{
	Component3(int i){System.out.println("Component3(" + i + ")");}
}

class Root{
	Component1 c1 = new Component1(1);
	Component2 c2 = new Component2(2);
	Component3 c3 = new Component3(3);
	
	Root(int i){System.out.println("Root(" + i + ")");}
}

class Stem extends Root{
	Stem(int i){
	super(4);
	Component1 c1 = new Component1(5);
	Component2 c2 = new Component2(6);
	Component3 c3 = new Component3(7);	

	System.out.println("Stem(" + i + ")");}
}

public class Ex10{
	public static void main(String[] args){
		Root r1 = new Root(8);
		Stem s1	= new Stem(9);
	}
}