import java.util.*;

class RandomGenerator{
	protected Shared shared = new Shared();
    private Random rand = new Random();
    public Rodent next(){
        switch(rand.nextInt(3)){
            default:
            case 0: return new Mouse(shared);
            case 1: return new Gerbil(shared);
            case 2: return new Hamster(shared);
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

class Shared{
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	public Shared(){System.out.println("Creating " + this);}
	public void addRef(){refcount++;}
	public String toString(){return "Shared " + id;}
	public void showRefcount(){System.out.println("refcount = " + refcount);}
}

class Rodent{
    private String name = "Rodent";
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
    private Characteristic c = new Characteristic("Rodent Characteristic ");
    private Description d = new Description("Rodent Description ");
	Rodent(Shared shared){
		System.out.println("Rodent() " + id);
		this.shared = shared;
		this.shared.addRef();
	}
    void eat(){System.out.println(name + ".eat()");}
    void run(){System.out.println(name + ".run()");}
    void sleep(){System.out.println(name + ".sleep()");}
    public String toString(){return name;}
}

class Mouse extends Rodent{
    private String name = "Mouse";
    private Characteristic c = new Characteristic("Mouse Characteristic ");
	private Description d = new Description("Mouse Description ");
	Mouse(Shared shared){
		super(shared);
		System.out.println("Mouse()");
	}
    @Override void eat(){System.out.println(name + ".eat()");}
    @Override void run(){System.out.println(name + ".run()");}
    @Override void sleep(){System.out.println(name + ".sleep()");}
    @Override public String toString(){return name;}
}

class Gerbil extends Rodent{
    private String name = "Gerbil";
    private Characteristic c = new Characteristic("Gerbil Characteristic ");
	private Description d = new Description("Gerbil Description ");
	Gerbil(Shared shared){
		super(shared);
		System.out.println("Gerbil()");
	}
	@Override void eat(){System.out.println(name + ".eat()");}
    @Override void run(){System.out.println(name + ".run()");}
    @Override void sleep(){System.out.println(name + ".sleep()");}
    @Override public String toString(){return name;}
}

class Hamster extends Rodent{
    private String name = "Hamster";
    private Characteristic c = new Characteristic("Hamster Characteristic ");
	private Description d = new Description("Hamster Description ");
	Hamster(Shared shared){
		super(shared);
		System.out.println("Hamster()");
	}
	@Override void eat(){System.out.println(name + ".eat()");}
    @Override void run(){System.out.println(name + ".run()");}
    @Override void sleep(){System.out.println(name + ".sleep()");}
    @Override public String toString(){return name;}
}

public class Ex14{
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
		rnd.shared.showRefcount();
    }
}

