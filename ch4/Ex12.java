//Ex12

public class Ex12
{
	public static void main(String[] args)
	{
		int bint = 15;
		System.out.println("bint: "+Integer.toBinaryString(bint));

		bint <<= 1;

		
		
		while(bint>=1)
		{
		System.out.println("bint: "+Integer.toBinaryString(bint));
		bint >>>= 1;
		}
	}
}