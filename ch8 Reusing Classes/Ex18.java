import java.util.*;

public class Ex18{
    private static Random rand = new Random(47);

    private final int v1 = rand.nextInt(20);
    private static final int v2 = rand.nextInt(20);
    public static void main(String[] args){
        Ex18 a = new Ex18();
        Ex18 b = new Ex18();
        System.out.println("a.v1: "+ a.v1);
        System.out.println("b.v1: "+ b.v1);
        System.out.println("a.v2: "+ a.v2);
        System.out.println("b.v2: "+ b.v2);
    }
}
