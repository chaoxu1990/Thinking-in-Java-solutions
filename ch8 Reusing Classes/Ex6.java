//Ex6.java
class Game {
	Game(int i) {
		System.out.println("Game constructor");
	}	
}

class BoardGame extends Game {
	BoardGame(int i) {
		 //System.out.println("BoardGame constructor"); // call to super must be first
			// statement in constructor 
		super(i); // else: "cannot find symbol: constructor Game()
		System.out.println("BoardGame constructor");
	}
}

public class Ex6 extends BoardGame {
	Ex6() {
		super(11);
		System.out.println("Chess constructor");
	}
	public static void main(String[] args) {
		Ex6 x = new Ex6();
	}
}
