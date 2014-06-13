//Ex2.java

public class Inherit extands Detergent {
	public void scrub(){
		append("Inherit.scrub()");
		super.scrub();
	}
	public void sterilize(){append("sterilize()");}
	public static void main(String [] args){
		Inherit inht = new Inherit();
		inht.dilute();
		inht.apply();
		inht.scrub();
		inht.foam();
		inht.sterilize();
		System.out.println(inht);
		System.out.println("Testing base class:");
		Detergent.main(args);
		
	}
}