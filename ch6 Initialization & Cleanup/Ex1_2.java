//Ex1,2,3



class NewString{
	NewString(String x){
	c = x;
	}
	
	protected String a;
	protected String b = "initialized at the point of definition.";
	protected String c;
}

public class Ex1_2{
	
	public static void main(String[] args){
	
		/*	*String "a" is null
			*String "b" is initialized at the point of definition.
			*String "c" is initialized by the constructor.
		*/
		
			NewString test = new NewString("initialized by the constructor.");
			System.out.println("String \"a\" is "+test.a);
			System.out.println("String \"b\" is "+test.b);
			System.out.println("String \"c\" is "+test.c);
	}
}