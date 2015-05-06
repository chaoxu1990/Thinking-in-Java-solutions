interface Inner{
    void f();
    class In implements Inner{
        public void f(){System.out.println("In.f()");}
        void t(){
            In i = new In();
            i.f();
            System.out.println("Test Inner class");
        }
    }
}

public class Ex21 implements Inner{
    public void f(){System.out.println("Ex21.f()");}
    public static void main(String[] args){
        new Ex21().f();
        new Ex21.In().f();
        new Ex21.In().t();
    }
}

