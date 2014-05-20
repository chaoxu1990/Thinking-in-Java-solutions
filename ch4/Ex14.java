//Ex14

public class Ex14
{

	static void judge(boolean b)
	{
		System.out.println(b?"true":"false");
	}

	static void compare(String a, String b)
	{
		judge(a==b);
		judge(a!=b);
		judge(a.equals(b));
		judge(b.equals(a));
	}
	
	
	
	public static void main(String[] args)
	{
		String a = "aaa", b = "bbb";
		compare(a,b);
	}
}