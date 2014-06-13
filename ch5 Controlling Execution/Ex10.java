//Ex10

import java.util.*;

public class Ex10{

public static boolean isVN(int n){
	if(n<1000||n>9999)
	return false;
	int tmp = n;
	int[] ArrayofDigits = new int[4];
	boolean test = false;

	for(int i = 0; i<4; i++)
	{
		ArrayofDigits[3-i] = tmp%10;
		tmp/=10;
	}
	int FirstPart = 0, SecondPart = 0;
	for(int i = 0; i<4; i++){
		for(int j = 0; j<4;j++){
			if(j==i) continue;
			for(int p = 0; p<4; p++){
				if(p==i||p==j) continue;
				for(int q = 0; q<4; q++){
					if(q==i||q==j||q==p) continue;
					FirstPart = ArrayofDigits[i]*10 + ArrayofDigits[j];
					SecondPart = ArrayofDigits[p]*10 + ArrayofDigits[q];
					test = n == FirstPart*SecondPart?true:false;
					if(test == true){
					System.out.println(n + " = " + FirstPart + " * " + SecondPart);
					return true;
					}
					else continue;
				}
			}
		}		
	}
	return true;
	}

	public static void main(String[] args){
		for(int i=1000; i<10000;i++)
		if(isVN(i)==false)
		System.out.println("ERROR!");

	}
}

	
