//Ex1.java
//
class Cycle{
    Cycle(){
        System.out.println("Cycle constructor!");
    }
	private int wheels = 0;
    public void r(){
        System.out.println("Cycle(" + wheels + ") ride!");
    }
}

class Unicycle extends Cycle{
    Unicycle(){
        System.out.println("Unicycle constructor!");
    }
	private int wheels = 1;
    public void r(){
        System.out.println("Unicycle(" + wheels + ") ride!");
    }
}

class Bicycle extends Cycle{
    Bicycle(){
        System.out.println("Bicycle constructor!");
    }
	private int wheels = 2;
    public void r(int i){
        System.out.println("Bicycle(" + wheels + ") ride!");
    }
}

class Tricycle extends Cycle{
    Tricycle(){
        System.out.println("Tricycle constructor!");
    }
	private int wheels = 3;
    public void r(){
        System.out.println("Tricycle(" + wheels + ") ride!");
    }
}

class Ex5{
    public static void ride(Cycle c){
        c.r();
    }
    public static void main(String[] args){
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();

        ride(u);
        ride(b);
        ride(t);

    }
}
