//Ex8

import java.util.*;

public class Ex8{
	public static void main(String[] args){
		for(int i = 1; i<=15; i++){
			switch(i){
				case 1 : System.out.println("1: "+i); //break;
				
				case 5 : System.out.println("5: "+i); //break;
				
				case 11: System.out.println("11: "+i); //break;
			
				default: System.out.println("default i: " + i);
			}
		}
		System.out.println("break");
	}
}

