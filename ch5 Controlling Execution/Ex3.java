//Ex3

import java.util.*;
public class Ex3{
	public static void main(String[] args){
		
		Random randx = new Random();
		Random randy = new Random();
		
		while(true){
		//for(int i = 1; i<=25; i++){
			
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

