public class Ex4{
	public static void main(String[] args){
		int factor = 0;
		for(int i = 2; i<100;i++){
			for(int j = 1; j<(i+2)/2; j++){
				if(i%j==0) factor++;
			}
		if(factor<2) 
			System.out.println(i + "is a prime.");
		factor = 0;
		}
	}
}