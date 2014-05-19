//Ex7
import java.util.*;
public class Ex7
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int c = rand.nextInt();
		
		if(c%2 == 0) 
			System.out.println("head");
		else
			System.out.println("tail");
	}
}