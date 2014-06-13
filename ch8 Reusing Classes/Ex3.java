//Ex3.java


class Art {
	Art() { System.out.println("Art constructor"); }
}

class Drawing extends Art {
	Drawing() { System.out.println("Drawing constructor"); }
}

class Cartoon extends Drawing {
}
public class Ex3{
	public static void main(String[] args) {
		Cartoon x = new Cartoon();
	}
	
}