class Outer{
    private String s;
    Outer(String w){s = w;}
    class Inner{
        public void M_inner(){}
        public String toString(){
            return s;
        }
    }

    public Inner M_outter(){
        return new Inner();
    }
}

public class Ex3{
    public static void main(String[] args){
        Outer out = new Outer("Hello World!");
        Outer.Inner in = out.M_outter();
        System.out.println(in);
    }
}

