//Ex5
import java.lang.*;
public class Ex5 {

static void ternaryPrint (int q) {
		if(q == 0) System.out.print(0);
		else {
			int nlz = Integer.numberOfLeadingZeros(q); 
			q <<= nlz;
			for(int p = 0; p < 32 - nlz; p++) {
				int n = (Integer.numberOfLeadingZeros(q) == 0) ? 1 : 0;
				System.out.print(n);		
				q <<= 1;
			}		
		}
		System.out.println("");
	}


	public static void main(String[] args) {
		int a = 0xA, b = 0x5;
		System.out.println("Using toBinaryString method:");
		System.out.println("a:"+Integer.toBinaryString(a));
		System.out.println("b:"+Integer.toBinaryString(b));
		System.out.println("a&b:"+Integer.toBinaryString(a&b));
		System.out.println("a|b:"+Integer.toBinaryString(a|b));
		System.out.println("a^b:"+Integer.toBinaryString(a^b));
		System.out.println("~a:"+Integer.toBinaryString(~a));		
		System.out.println("~b:"+Integer.toBinaryString(~b));

		System.out.println("Using ternary operator:");
		System.out.print("a: ");
		ternaryPrint(a);
		
		System.out.print("b: ");
		ternaryPrint(b);
		
		System.out.print("a&b: ");
		ternaryPrint(a&b);
		
		System.out.print("a|b: ");
		ternaryPrint(a|b);
		
		System.out.print("a^b: ");
		ternaryPrint(a^b);
		
		System.out.print("~a: ");		
		ternaryPrint(~a);

		System.out.print("~b: ");
		ternaryPrint(~b);
		
		
	}
}