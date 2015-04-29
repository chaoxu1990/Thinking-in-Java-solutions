interface Tossing{
    void m1();
}

interface TossingFactory{
    Tossing getTossing();
}

class CoinTossing implements Tossing{
    public void m1(){System.out.println("CoinTossing!");}
	public static TossingFactory factory = new TossingFactory(){
		public Tossing getTossing(){return new CoinTossing();}
	};
}

class DiceTossing implements Tossing{
    public void m1(){System.out.println("DiceTossing!");}
	public static TossingFactory factory = new TossingFactory(){
		public Tossing getTossing(){return new DiceTossing();}
	};	
}

public class Ex17{
    public static void TossingCreator(TossingFactory tf){
        Tossing t = tf.getTossing();
        t.m1();
    }
    public static void main(String[] args){
        TossingCreator(CoinTossing.factory);
        TossingCreator(DiceTossing.factory);
    }
}


