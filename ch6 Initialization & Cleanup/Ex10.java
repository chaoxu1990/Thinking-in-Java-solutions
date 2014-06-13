//Ex10

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
public class Ex10{
	
	public static void main(String[] args){
	A a2 = new A(false);
	A a3 = new A(false);
	a2.finishUse();
	new A(false);
	System.gc();
	}
}