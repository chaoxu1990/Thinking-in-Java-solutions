//Ex9

import java.util.*;

public class Ex9{
	public static void main(String[] args){
		
		Fib f = new Fib();
		int i = Integer.parseInt(args[0]);
		for(int k=0; k<i;k++)
		System.out.println(f.calF(k));
	}
}

class Fib{
	public int calF(int n){
	if(n<=1) return 1;
	else return calF(n-1) + calF(n-2);
	}
}