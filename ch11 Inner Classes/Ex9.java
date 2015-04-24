//Ch11, Ex9

interface A{
    public void show();
}
class B{
    public A test(){
        class helper implements A{
            helper(){show();}
            public void show(){System.out.println("Hello World!");}
        }
        return new helper();
    }
}

public class Ex9{
    public static void main(String[] args){
        B b = new B();
        A a = b.test();
    }
}
