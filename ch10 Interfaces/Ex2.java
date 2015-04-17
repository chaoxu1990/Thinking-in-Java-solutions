//Chapter 10, Exercise 2
abstract class A{
    public void Hello(){System.out.println("Hello!");}
}

public class Ex2{
    public static void main(String[] args){
        System.out.println("Hello!");
        /*
         * Error, Class A is abstract class, cannot be instantiated
         * A a = new A();
         * a.Hello();
         */
    }
}
