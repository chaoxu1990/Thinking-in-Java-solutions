//Ch9 Ex16
class AlertStatus{
    public void status(){System.out.println("VoidAlert!");}
}

class LowAlert extends AlertStatus{
    public void status(){System.out.println("LowAlert!");}
}

class MidAlert extends AlertStatus{
    public void status(){System.out.println("MidAlert!");}
}

class HigAlert extends AlertStatus{
    public void status(){System.out.println("HighAlert!");}
}

class Startship{
    private AlertStatus as = new AlertStatus();
    public void low(){as = new LowAlert();}
    public void mid(){as = new MidAlert();}
    public void hig(){as = new HigAlert();}
    public void check(){as.status();}
}

public class Ex16{
    public static void main(String args[]){
        Startship ss = new Startship();
        ss.check();
        ss.low();
        ss.check();
        ss.mid();
        ss.check();
        ss.hig();
        ss.check();

    }
}
