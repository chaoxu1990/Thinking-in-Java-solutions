//Ex13

public class Ex13
{
	public static void main(String[] args)
	{
		char var = 'a';
		int i = 0;
		while(i++<10)
		{
			System.out.println(Integer.toBinaryString((int)var++));
		}
	}
}