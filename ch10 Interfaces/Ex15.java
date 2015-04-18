interface A{
    void a1();
    void a2();
}

interface B{
    void b1();
    void b2();
}

interface C{
    void c1();
    void c2();
}

interface D extends A, B, C{
    void d();
}

abstract class E{
    public void e1(){}
    public void e2(){}
}

class F extends E implements D{
    public void a1(){}
    public void a2(){}
    public void b1(){}
    public void b2(){}
    public void c1(){}
    public void c2(){}
    public void d(){}
    public void e1(){}
    public void e2(){}

}

public class Ex15{
    public void m1(A a){}
    public void m2(B b){}
    public void m3(C c){}
    public void m4(D d){}
    public static void main(String[] args){
        F f = new F();
        Ex15 e = new Ex15();
        e.m1(f);
        e.m2(f);
        e.m3(f);
        e.m4(f);
   }
}




