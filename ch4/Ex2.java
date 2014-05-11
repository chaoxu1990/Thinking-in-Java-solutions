//Ex3

class Float{
float f;
}

public class Ex2{
	static void ali(Float y){
		y.f = 10.0f;
	}
	
	public static void main(String[] args){
		Float x = new Float();
		x.f = 100.0f;
		System.out.println("x.f: "+x.f);
		ali(x);
		System.out.println("x.f: "+x.f);
	}
}