//Ch11, Ex10

interface A{
    public void show();
}
class B{
    public A test(boolean b){
        if(b){
            class helper implements A{
                helper(){show();}
                public void show(){System.out.println("b = true");}
            }
        return new helper();
        }
        else{
            class helper2 implements A{
                helper2(){show();}
                public void show(){System.out.println("b = false");}
            }
            return new helper2();
        }
    }
}

public class Ex10{
    public static void main(String[] args){
        B b = new B();
        A a1 = b.test(true);
        A a2 = b.test(false);
    }
}

