package A;

public class Ex15{
	protected void ptd(){System.out.println("Protected Method!");}
	public void pud(){System.out.println("Public Method!");}
	public static void main(String[] args){
			Ex15 a = new Ex15();
			a.ptd();
			a.pud();
		}
}