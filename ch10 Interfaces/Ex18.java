interface Cycle{
    void m1();
}

class Unicycle implements Cycle{
    public void m1(){System.out.println("Unicycle!");}
}

class Bicycle implements Cycle{
    public void m1(){System.out.println("Bicycle!");}
}


class Tricycle implements Cycle{
    public void m1(){System.out.println("Tricycle!");}
}

interface CycleFactory{
    Cycle getCycle();
}

class UnicycleFactory implements CycleFactory{
    public Cycle getCycle(){return new Unicycle();}
}

class BicycleFactory implements CycleFactory{
    public Cycle getCycle(){return new Bicycle();}
}

class TricycleFactory implements CycleFactory{
    public Cycle getCycle(){return new Tricycle();}
}


public class Ex18{
    public static void CycleCreator(CycleFactory cf){
        Cycle c = cf.getCycle();
        c.m1();
    }
    public static void main(String[] args){
        CycleCreator(new UnicycleFactory());
        CycleCreator(new BicycleFactory());
        CycleCreator(new TricycleFactory());
    }
}

