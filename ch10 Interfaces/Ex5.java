//Ch10, Ex5

import Ex5.*;

public class Ex5 implements base{
    public void One(){System.out.println("One");}
    public void Two(){System.out.println("Two");}
    public void Three(){System.out.println("Three");}
    public static void main(String[] args){
        Ex5 x = new Ex5();
        x.One();
        x.Two();
        x.Three();
    }
}
