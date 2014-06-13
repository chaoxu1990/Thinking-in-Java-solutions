//exercise 6

package chaoxu.ucdavis.edu;


public class Ex6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex6 test = new Ex6();
		System.out.println(test.storage("Hello World!"));

	}
	int storage(String s)
	{
		return s.length() * 2;
	}

}
