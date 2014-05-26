public class Ex6{
	
	public static int test(int testval, int start, int end){
		if(end < start){
			System.out.println("end is smaller than start, error.");
			return 0;
			}
		else if(testval<=end && testval>= start){
			return 1;
		}
		else return -1;
		
	}

	public static void main(String [] args)
	{
		System.out.println(test(10, 5, 10));
		System.out.println(test(5, 10, 15));
		System.out.println(test(5,5,10));
	}
}