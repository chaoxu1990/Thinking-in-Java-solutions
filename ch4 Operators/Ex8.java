//Ex8

public class Ex8{
	public static void main(String[] args){
		long hex = 0xAAAL, oct = 0777L;
		
		System.out.println("hex: "+ hex);
		System.out.println("oct: "+ oct);
		
		System.out.println("hex: "+ Long.toBinaryString(hex));
		System.out.println("oct: "+ Long.toBinaryString(oct));
		
	}
}