import A.*;

public class Outside {
	public static void main(String[] args){
	Ex15 c = new Ex15();
	/*
	c.ptd();
	
	Outside.java:6: error: ptd() has protected access in Ex15
        c.ptd();
         ^
	1 error
	*/
	
	c.pud();
	}
}

class Outside2 extends Ex15 {
	Outside2(){
		System.out.println("Inherit Method.");	
	}

	public void callProtected(){
		super.ptd();
	}
	public static void main(String[] args){
	Ex15 c2 = new Ex15();

	c2.pud();

	Outside2 osd2 = new Outside2();
	osd2.callProtected();
	}
}
