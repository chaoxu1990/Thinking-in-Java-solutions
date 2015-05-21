//ch11, Ex26

class One{
    class InOne{
        InOne(int i){System.out.println("InOne: " + i);}
    }
}

public class Ex26{
    class InTwo extends One.InOne{
        InTwo(One o){
            o.super(42);
            System.out.println("InTwo");
        }
    }
    public static void main(String[] args){
        One o = new One();
        Ex26 e = new Ex26();
        Ex26.InTwo it = e.new InTwo(o);
    }
}
