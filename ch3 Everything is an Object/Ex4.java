//combine exercise 4&5

package chaoxu.ucdavis.edu;


public class Ex4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataOnly test = new DataOnly();
		test.i = 1;
		test.d = 2.0;
		test.b = false;
		System.out.println(test.i);
		System.out.println(test.d);
		System.out.println(test.b);

	}

}

class DataOnly
{
	int i;
	double d;
	boolean b;
}


