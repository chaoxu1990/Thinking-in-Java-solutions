//Ch11, Ex8.java

class Helper{
    class Inner{
        private int i = 3;
    }
    public void InnerTester(){
        Inner ir = new Inner();
        System.out.println(ir.i);
    }
}

public class Ex8{
    public static void main(String[] args){
        Helper hp = new Helper();
        hp.InnerTester();
    }
}

