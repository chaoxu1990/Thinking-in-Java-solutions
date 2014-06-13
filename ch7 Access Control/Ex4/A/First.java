//first.java
package A;

public class First {
	public void f() {
		System.out.println("First.f()");
	}
	public static void main(String [] args){
		Second sec = new Second();
		sec.s();
	}
}