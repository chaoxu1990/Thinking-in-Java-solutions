//Ex11

public class Ex11
{
	public static void main(String[] args)
	{
		int bint = 16;
		while(bint>=1)
		{
		System.out.println("bint: "+Integer.toBinaryString(bint));
		bint >>= 1;
		}
	}
}