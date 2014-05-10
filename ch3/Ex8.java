//exercise 8

package chaoxu.ucdavis.edu;


public class Ex8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test test1 = new test();
		test test2 = new test();
		test test3 = new test();
		test test4 = new test();
/*
 * warning: test.i should be accessed in a static way.
 * This means that the static variable should be accessed as: 
 * class.variable, not object.variable(test.i not test1.i)
 * The reason I wrote it as test1.i is try to demonstrate that
 * there is only one instance for a particular instance. 
 */		
		test1.i = 5;
		test1.j = 6;
		
		test2.i = 15;
		test2.j = 16;
		
		test3.i = 25;
		test3.j = 26;
		
		test4.i = 35;
		test4.j = 36;
		
		
		System.out.println("test1.i = " + test1.i);
		System.out.println("test1.j = " + test1.j);
		
		System.out.println("test2.i = " + test2.i);
		System.out.println("test2.j = " + test2.j);
		
		System.out.println("test3.i = " + test3.i);
		System.out.println("test3.j = " + test3.j);
		
		System.out.println("test4.i = " + test4.i);
		System.out.println("test4.j = " + test4.j);

	}

}

class test
{
	static int i = 47;
	int j;
}