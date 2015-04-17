//Chapter 10, Exercise 7

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

interface Rodent{
    final String name = "Rodent";
    void eat();
    void run();
    void sleep();
    public String toString();
}

class Mouse implements Rodent{
    private String name = "Mouse";
    public void eat(){System.out.println(name + ".eat()");}
    public void run(){System.out.println(name + ".run()");}
    public void sleep(){System.out.println(name + ".sleep()");}
    public String toString(){return name;}
}

class Gerbil implements Rodent{
    private String name = "Gerbil";
    public void eat(){System.out.println(name + ".eat()");}
    public void run(){System.out.println(name + ".run()");}
    public void sleep(){System.out.println(name + ".sleep()");}
    public String toString(){return name;}
}

class Hamster implements Rodent{
    private String name = "Hamster";
    public void eat(){System.out.println(name + ".eat()");}
    public void run(){System.out.println(name + ".run()");}
    public void sleep(){System.out.println(name + ".sleep()");}
    public String toString(){return name;}
}

public class Ex7{
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

