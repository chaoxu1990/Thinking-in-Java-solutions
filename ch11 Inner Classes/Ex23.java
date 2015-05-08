//ch 11, Ex 23

interface U{
    void f(int i);
    void g(int i);
    String toString();
}

class A{
    public U build(){
        return new U(){
            public void f(int i){System.out.println("f(" + i + ")");}
            public void g(int i){System.out.println("g(" + i + ")");}
            public String toString(){return "Interface U";}
        };
    }
}

class B{
    private U[] us;
    B(int i){ us = new U[i];}
    void set(U u, int i){us[i] = u;}
    void setNULL(int i){us[i] = null;}
    void call(){
        int i = 0;
        for(U u: us){
            if(u != null){
                System.out.println(u.toString() + "(" + i + "): ");
                u.f(i);
                u.g(i);
            }
            else
                System.out.println("NULL!");

            System.out.println();
            i++;
        }
        System.out.println();
    }
}

public class Ex23{
    public static void main(String[] args){
        A[] as = new A[3];
        B b = new B(3);
        for(int i = 0; i<3; i++){
            as[i] = new A();
            b.set(as[i].build(), i);
        }

        b.call();
        b.setNULL(1);
        b.call();
    }
}
