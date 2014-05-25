//Ex2

import java.util.*;
public class Ex2{
	public static void main(String[] args){
		
		Random randx = new Random();
		Random randy = new Random();
		
		for(int i = 1; i<=25; i++){
			
			int x = randx.nextInt();
			int y = randy.nextInt();
			
			if(x<y)
					System.out.println(x+"<"+y);
			else if(x>y)
					System.out.println(x+">"+y);
			else
					System.out.println(x+"=="+y);
		}
	}
}

