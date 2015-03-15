class A{
    void first(){
        System.out.println("A.first()");
        this.second();
    }
    void second(){
        System.out.println("A.second()");
    }
}

class B extends A{
    @Override void second(){
        System.out.println("B.second()");
    }
}

public class Ex10{
    public static void main(String[] args){
        B b = new B();
        //By calling the first() method, b is automatically upcasted to its base calss and call the A.first() method
        //And because of the polymorphism, "this.second()" method call in base class will call the derived-class method which is B.second()
        b.first();
    }
}
