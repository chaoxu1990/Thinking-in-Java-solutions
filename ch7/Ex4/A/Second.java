//second.java

package A;
public class Second {
	protected void s() {
		System.out.println("Second.s()");
	}
	public static void main(String [] args){
		First fst = new First();
		fst.f();
	}
}