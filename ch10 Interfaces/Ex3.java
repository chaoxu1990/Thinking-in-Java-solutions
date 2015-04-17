//Chapter 10, Exercise 3
abstract class A{
    public abstract void print();
    A(){
        System.out.println("before print");
        print();
        System.out.println("after print");
    }
}
class Ad extends A{
    private int d = 1;
    public void print(){
        System.out.println("d = " + d);
    }
}

public class Ex3{
    public static void main(String[] args){
        Ad ad = new Ad();
        ad.print();
    }
}

