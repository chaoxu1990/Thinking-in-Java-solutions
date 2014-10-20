//Ex1.java
//
class Cycle{
    Cycle(){
        System.out.println("Cycle constructor!");
    }

    public void r(int i){
        System.out.println("Cycle(" + i + ") ride!");
    }
}

class Unicycle extends Cycle{
    Unicycle(){
        System.out.println("Unicycle constructor!");
    }
    public void r(int i){
        System.out.println("Unicycle(" + i + ") ride!");
    }
}

class Bicycle extends Cycle{
    Bicycle(){
        System.out.println("Bicycle constructor!");
    }
    public void r(int i){
        System.out.println("Bicycle(" + i + ") ride!");
    }
}

class Tricycle extends Cycle{
    Tricycle(){
        System.out.println("Tricycle constructor!");
    }
    public void r(int i){
        System.out.println("Tricycle(" + i + ") ride!");
    }
}

class Ex1{
    public static void ride(Cycle c, int i){
        c.r(i);
    }
    public static void main(String[] args){
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();

        ride(u,1);
        ride(b,2);
        ride(t,3);

    }
}
