//Ex1.java

class First{
private String str;

public String toString(){
	if(str == null)
	str = "Ch8 Ex1.java";
	return str;
}
}

public class Ex1{
	public static void main(String [] args){
		
		First fst = new First();
	
		System.out.println(fst);		
		}
}