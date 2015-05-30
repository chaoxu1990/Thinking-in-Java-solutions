//Ch12 Ex7
import java.util.*;

class myClass{
    private int i;
    public myClass(int input){i = input;}
    public String toString(){return Integer.toString(i);}
}

public class Ex7{
    public static void main(String[] args){
        ArrayList<myClass> am = new ArrayList<myClass>();
        for(int i = 0; i<10; i++) am.add(new myClass(i));
        List<myClass> copy = am.subList(0, 4);
        System.out.println("Whole list: " + am);
        System.out.println("Sublist: " + copy);
        am.removeAll(copy);
        System.out.println("Whole list: " + am);
    }
}
