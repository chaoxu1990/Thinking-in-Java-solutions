interface Cycle{
    void m1();
}

interface CycleFactory{
    Cycle getCycle();
}

class Unicycle implements Cycle{
    public void m1(){System.out.println("Unicycle!");}
	public static CycleFactory factory = new CycleFactory(){
		public Cycle getCycle(){return new Unicycle();}
	};
}

class Bicycle implements Cycle{
    public void m1(){System.out.println("Bicycle!");}
	public static CycleFactory factory = new CycleFactory(){
		public Cycle getCycle(){return new Bicycle();}
	};
}


class Tricycle implements Cycle{
    public void m1(){System.out.println("Tricycle!");}
	public static CycleFactory factory = new CycleFactory(){
		public Cycle getCycle(){return new Tricycle();}
	};
}

public class Ex16{
    public static void CycleCreator(CycleFactory cf){
        Cycle c = cf.getCycle();
        c.m1();
    }
    public static void main(String[] args){
        CycleCreator(Unicycle.factory);
        CycleCreator(Bicycle.factory);
        CycleCreator(Tricycle.factory);
    }
}

