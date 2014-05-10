//exercise 7

package chaoxu.ucdavis.edu;


public class Ex7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Incrementable.increment();
		System.out.println(StaticTest.i);

	}

}

class StaticTest
{
	static int i = 47;	
}


class Incrementable
{
	static void increment(){StaticTest.i++;}
}


