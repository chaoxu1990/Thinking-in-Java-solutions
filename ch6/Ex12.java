//Ex12

class Tank{
	boolean empty = true;
	
	Tank(boolean state) {
		empty = state;
	}
	
	protected void finalize(){
		if(!empty) {
			System.out.println("Not empty!");
		}
	}
}

public class Ex12{
	public static void main(String[] args){
	Tank t1 = new Tank(false);
	Tank t2 = new Tank(true);
	System.out.println("first forced gc():");
	System.gc();
	// Force finalization on exit but using method
	// deprecated since JDK 1.1:
	System.out.println("try deprecated runFinalizersOnExit(true):");
	System.runFinalizersOnExit(true);
	System.out.println("last forced gc():");
	System.gc();
	}
}