class Amphibian{
    public void Swim() {System.out.println("Swimming!");}
    public void Eat() {System.out.println("Eatting!");}
    public void Walk() {System.out.println("Walking!");}

    protected static void Grow(Amphibian a){
        a.Swim();
        a.Eat();
        a.Walk();
    }
    }

public class Ex16 extends Amphibian{
    public static void main(String[] args){
        Ex16 a = new Ex16();
        a.Swim();
        a.Eat();
        a.Walk();
        
        Amphibian.Grow(a);

    }
}
