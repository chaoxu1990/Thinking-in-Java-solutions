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

public class Ex17 extends Amphibian{
    public void Swim() {System.out.println("Ex17 Swimming!");}
    public void Eat() {System.out.println("Ex17 Eatting!");}
    public void Walk() {System.out.println("Ex17 Walking!");}
    
    public static void main(String[] args){
        Ex17 a = new Ex17();
        a.Swim();
        a.Eat();
        a.Walk();
        
        a.Grow(a);

        Amphibian.Grow(a);
        

        Amphibian b = new Amphibian();
        b.Grow(b);
    }
}

