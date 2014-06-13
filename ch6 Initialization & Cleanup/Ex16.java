class ArrayConstruction {
	
	static private String [] s = {"aa","aa","aa","ab","ab","ab","ac","ac","ac"};
	
	static void print(){
			for(String str: s){
			System.out.println(str);
			}
		}
}


public class Ex16 {
	public static void main(String[] args) {
		ArrayConstruction.print();
	}
}