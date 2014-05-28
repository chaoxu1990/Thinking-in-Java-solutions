//Ex9

class A{
	A(int i, String s){this(s);System.out.println(i);}
	A(String s){System.out.println(s);}
}
public class Ex9{
	
	public static void main(String[] args){
	A a2 = new A("2nd");
	A a3 = new A(3,"3rd");
	}
}