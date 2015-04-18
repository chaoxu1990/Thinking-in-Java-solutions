interface Tossing{
    void m1();
}

class CoinTossing implements Tossing{
    public void m1(){System.out.println("CoinTossing!");}
}

class DiceTossing implements Tossing{
    public void m1(){System.out.println("DiceTossing!");}
}

interface TossingFactory{
    Tossing getTossing();
}

class CoinFactory implements TossingFactory{
    public Tossing getTossing(){return new CoinTossing();}
}

class DiceFactory implements TossingFactory{
    public Tossing getTossing(){return new DiceTossing();}
}

public class Ex19{
    public static void TossingCreator(TossingFactory tf){
        Tossing t = tf.getTossing();
        t.m1();
    }
    public static void main(String[] args){
        TossingCreator(new CoinFactory());
        TossingCreator(new DiceFactory());
    }
}


