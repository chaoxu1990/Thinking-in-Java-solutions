//Ex21

public class Ex21 {
	public enum Bills {
		ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
	}
	Bills bill;
	public Ex21(Bills b){this.bill = b;}
	
	void printDescription(){
		switch(bill){
		case ONE: System.out.println("This is ONE."); break;
		case FIVE: System.out.println("This is FIVE."); break;
		case TEN: System.out.println("This is TEN."); break;
		case TWENTY: System.out.println("This is TWENTY."); break;
		case FIFTY: System.out.println("This is FIFTY."); break;
		case HUNDRED: System.out.println("This is HUNDRED."); break;
		
		}
		
	}
	
	public static void main(String[] args) {
		for(Bills b : Bills.values())
			System.out.println(b + ", ordinal " + b.ordinal());	
		Ex21 e = new Ex21(Bills.ONE);
		e.printDescription();
	}	
}