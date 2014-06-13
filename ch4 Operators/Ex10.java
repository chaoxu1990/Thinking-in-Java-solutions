//Ex10
import java.lang.*;
public class Ex10 {
	public static void main(String[] args) {
		int a = 0xA, b = 0x5;
		System.out.println("a:"+Integer.toBinaryString(a));
		System.out.println("b:"+Integer.toBinaryString(b));
		System.out.println("a&b:"+Integer.toBinaryString(a&b));
		System.out.println("a|b:"+Integer.toBinaryString(a|b));
		System.out.println("a^b:"+Integer.toBinaryString(a^b));
		System.out.println("~a:"+Integer.toBinaryString(~a));		
		System.out.println("~b:"+Integer.toBinaryString(~b));		
	}
}