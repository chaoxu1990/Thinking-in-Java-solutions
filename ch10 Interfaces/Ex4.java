//Chapter 10, Exercise 4
//First version

/*
abstract class A{}

class B extends A{
    public void print(){
        System.out.println("Hello!");
    }
}

public class Ex4{
    public static void main(String[] args){
        A a = new B();
        ((B)a).print();
    }
}
*/

//second version

abstract class A{
    public abstract void print();
}

class B extends A{
    public void print(){
        System.out.println("Hello!");
    }
}

public class Ex4{
    public static void main(String[] args){
        A a = new B();
        a.print();
    }
}


