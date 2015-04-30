//Ch11, Ex13

/*
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
*/

interface A{
    public void show();
}
class B{
    public A test(){
        return new A(){
            public void show(){System.out.println("Hello World!");}
        };
    }
}


public class Ex13{
    public static void main(String[] args){
        B b = new B();
        b.test().show();
    }
}

