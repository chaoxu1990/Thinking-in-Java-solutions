interface Inner{
    void f();
    class In{
        public void t(){System.out.println("Test Inner class");}
    }
}

public class Ex20 implements Inner{
    public void f(){System.out.println("function f()");}
    public static void main(String[] args){
        Ex20 e = new Ex20();
        e.f();
        Inner.In i = new Inner.In();
        i.t();
    }
}
