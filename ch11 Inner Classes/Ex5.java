class Outter{
    class Inner{}
}

public class Ex5{
    public static void main(String[] args){
        Outter ot = new Outter();
        Outter.Inner in = ot.new Inner();
    }
}
