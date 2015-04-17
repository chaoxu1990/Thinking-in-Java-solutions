//Ch10, Ex6

interface base{
    void One();
    void Two();
    void Three();
}

public class Ex6 implements base{
    public void One(){System.out.println("One");}
    // Error: cannot assign weaker access to public methods:
    // protected void Two(){System.out.println("Two");}
    // private void Three(){System.out.println("Three");}

    public void Two(){System.out.println("Two");}
    public void Three(){System.out.println("Three");}
    public static void main(String[] args){
        Ex6 x = new Ex6();
        x.One();
        x.Two();
        x.Three();
    }
}

