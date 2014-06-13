//Ex2

class Float{
float f;
}

public class Ex2{	
	public static void main(String[] args){
		Float x1 = new Float();
		Float x2 = new Float();
		
		x1.f = 10.0f;
		x2.f = 100.0f;
		System.out.println("x1.f: "+x1.f);
		System.out.println("x2.f: "+x2.f);

		x1 = x2;
		System.out.println("x1.f: "+x1.f);
		System.out.println("x2.f: "+x2.f);

		x2.f = 5.0f;
		
		System.out.println("x1.f: "+x1.f);
		System.out.println("x2.f: "+x2.f);
	
	}
}