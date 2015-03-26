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
class Characteristic{
    private String s;
    Characteristic(String s){
        this.s = s;
        System.out.println(s);
    }
}

class Description{
    private String s;
    Description(String s){
        this.s = s;
        System.out.println(s);
    }
}

class Rodent{
    private String name = "Rodent";
    private Characteristic c = new Characteristic("Rodent Characteristic ");
    private Description d = new Description("Rodent Description ");
    void eat(){System.out.println(name + ".eat()");}
    void run(){System.out.println(name + ".run()");}
    void sleep(){System.out.println(name + ".sleep()");}
    public String toString(){return name;}
}

class Mouse extends Rodent{
    private String name = "Mouse";
    private Characteristic c = new Characteristic("Mouse Characteristic ");
	private Description d = new Description("Mouse Description ");
    @Override void eat(){System.out.println(name + ".eat()");}
    @Override void run(){System.out.println(name + ".run()");}
    @Override void sleep(){System.out.println(name + ".sleep()");}
    @Override public String toString(){return name;}
}

class Gerbil extends Rodent{
    private String name = "Gerbil";
    private Characteristic c = new Characteristic("Gerbil Characteristic ");
	private Description d = new Description("Gerbil Description ");
	@Override void eat(){System.out.println(name + ".eat()");}
    @Override void run(){System.out.println(name + ".run()");}
    @Override void sleep(){System.out.println(name + ".sleep()");}
    @Override public String toString(){return name;}
}

class Hamster extends Rodent{
    private String name = "Hamster";
    private Characteristic c = new Characteristic("Hamster Characteristic ");
	private Description d = new Description("Hamster Description ");
	@Override void eat(){System.out.println(name + ".eat()");}
    @Override void run(){System.out.println(name + ".run()");}
    @Override void sleep(){System.out.println(name + ".sleep()");}
    @Override public String toString(){return name;}
}

public class Ex12{
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

