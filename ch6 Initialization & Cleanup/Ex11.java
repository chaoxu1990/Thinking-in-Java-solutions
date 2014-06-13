//Ex11

class A{

	boolean finish = true;
	A(boolean state){finish = state;}
	void startUse(){
		finish  = false;
	}
	
	void finishUse(){
		finish = true;
	}
	protected void finalize(){
	if(!finish){
		System.out.println("Error: still in use!");
	}
	}
}
public class Ex11{
	
	public static void main(String[] args){
	A a2 = new A(false);
	A a3 = new A(false);
	a2.finishUse();
	new A(false);
	System.out.print("Try 1: "); 
	System.runFinalization();
	System.out.print("Try 2: "); 	
	Runtime.getRuntime().runFinalization();
	System.out.print("Try 3: "); 
	System.gc();
	System.out.print("Try 4: ");
	// using deprecated since 1.1 method:
	System.runFinalizersOnExit(true);	
	}
}