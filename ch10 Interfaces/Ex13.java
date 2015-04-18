interface A{
    void a();
}

interface B extends A{
    void b();
}

interface C extends A{
    void c();
}

interface D extends B, C{
    void d();
}

class imp implements D{
    public void a(){System.out.println("A!");}
    public void b(){System.out.println("B!");}
    public void c(){System.out.println("C!");}
    public void d(){System.out.println("D!");}
}

public class Ex13{
    public static void main(String[] args){
        imp ip = new imp();
        ip.a();
        ip.b();
        ip.c();
        ip.d();
    }
}


