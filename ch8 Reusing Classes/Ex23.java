//Ex23.java
//

class A{
    A() {System.out.println("A() constructor!");}
    static int a = printInit("A.a initialized!");
    static int printInit(String s){
        System.out.println(s);
        return 1;
    }
}


class B extends A{
    B() {System.out.println("B() constructor!");}
    static int b = printInit("B.b initialized!");
    }


class C{
    C() {System.out.println("C() constructor!");}
    static int c = printInit("C.c initialized!");
    static A a = new A();
    static int printInit(String s){
        System.out.println(s);
        return 1;
    }
}

class D {
    D() {System.out.println("D() constructor!");}
}

public class Ex23 extends B{
    Ex23(){System.out.println("Ex23() constructor!");}
    static int i = printInit("Ex23.i initialized!");

    public static void main(String[] args){
        //accessing static main causes loading (and initialization)
        //of A, B, & Ex23
        System.out.println("Hi!");
        //call constructors from loaded classes:
        Ex23 e = new Ex23();
        //call to static field loads & initialization classes
        System.out.println(C.a);
        //call to constructor loads D:
        D d = new D();

    }

}

