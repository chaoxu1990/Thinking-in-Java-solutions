class ArrayConstruction {
	
	ArrayConstruction(String s){
		System.out.println(s);
		System.out.println("test"+s+"\n");
	}
}


public class Ex18 {
	public static void main(String[] args) {
		ArrayConstruction [] arr = new ArrayConstruction[10];
		int i = 100;
		for(ArrayConstruction it: arr)
		{
			it = new ArrayConstruction(Integer.toString(i));
			i++;
		}
	}
}