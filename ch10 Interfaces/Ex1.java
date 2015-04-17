//Chapter 10, Exercise 1

import java.util.*;

class RandomGenerator{
    private Random rand = new Random();
    public Rodent next(){
        switch(rand.nextInt(3)){
            default:
            case 0: return new Mouse();
            case 1: return new Gerbil();
            case 2: return new Hamster();
        }
    }
}
abstract class Rodent{
    private String name = "Rodent";
    abstract void eat();
    abstract void run();
    abstract void sleep();
    abstract public String toString();
}

class Mouse extends Rodent{
    private String name = "Mouse";
    @Override void eat(){System.out.println(name + ".eat()");}
    @Override void run(){System.out.println(name + ".run()");}
    @Override void sleep(){System.out.println(name + ".sleep()");}
    @Override public String toString(){return name;}
}

class Gerbil extends Rodent{
    private String name = "Gerbil";
    @Override void eat(){System.out.println(name + ".eat()");}
    @Override void run(){System.out.println(name + ".run()");}
    @Override void sleep(){System.out.println(name + ".sleep()");}
    @Override public String toString(){return name;}
}

class Hamster extends Rodent{
    private String name = "Hamster";
    @Override void eat(){System.out.println(name + ".eat()");}
    @Override void run(){System.out.println(name + ".run()");}
    @Override void sleep(){System.out.println(name + ".sleep()");}
    @Override public String toString(){return name;}
}

public class Ex1{
    public static void main(String[] args){
        RandomGenerator rnd = new RandomGenerator();
        Rodent[] rodents = new Rodent[10];
        for(Rodent r : rodents){
            r = rnd.next();
            System.out.println(r + ": ");
            r.eat();
            r.run();
            r.sleep();
        }
    }
}

