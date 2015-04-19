class Outer{
    class Inner{
        public void M_inner(){}
    }

    public Inner M_outter(){
        return new Inner();
    }
}

public class Ex1{
    public static void main(String[] args){
        Outer out = new Outer();
        Outer.Inner in = out.M_outter();
    }
}
