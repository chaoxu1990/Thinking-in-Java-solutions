class Cup {
	static String first = "FirstCup";
	static String second;
	static{
	second = "SecondCup";
	}
static void printStrings(){
	System.out.println(first);
	System.out.println(second);
	System.out.println("second is initialized");
}
}


public class Ex14 {
	public static void main(String[] args) {
		System.out.println("Inside main()");
		
		//Cup.printStrings();
		System.out.println("cool!");
	}
}