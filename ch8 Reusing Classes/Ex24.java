// reusing/Scarab.java
// TIJ4 Chapter Reusing, Exercise 24, page 274
/* In Beetle.java, inherit a specific type beetle from class Beetle, following
* the same format as the existing classes. Trace and expain the output.
*/
//Copy from http://greggordon.org/java/tij4/reusing/Scarab.java

class Insect {
	private int i = 9;
	protected int j;
	Insect() {
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}
	private static int x1 = printInit("static Insect.x1 initialized");
	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}

class Beetle extends Insect {
	public Beetle() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	private int k = printInit("Beetle.k initialized");
	private static int x2 = printInit("static Beetle.x2 initialized");
}

public class Ex24 extends Beetle {
	public Ex24() {
		System.out.println("n = " + n);
		System.out.println("j = " + j);
	}
	private static int x3 = printInit("static Ex24.x3 initialized");
	private int n = printInit("Ex24.n initialized");
    public static void main(String[] args) {
		System.out.println("Ex24 constructor");
		Ex24 ex = new Ex24();
	}
}
