//Ch12, Ex4
import java.util.*;

class Generator{
    int key = 0;
    public String next(){
        switch(key){
            default:
            case 0: key++; return "An Jack Chan";
            case 1: key++; return "Shaxun Chen";
            case 2: key++; return "George Chen";
            case 3: key++; return "Xiaolin Cheng";
            case 4: key++; return "Paul Congdon";
            case 5: key++; return "Casey Deccio";
            case 6: key++; return "Debalina Ghosh";
            case 7: key = 0; return "Dhruv Gupta";
        }
    }

    public void fillStringSet(String[] s){
        for(int i = 0; i<s.length; i++)
            s[i] = next();
    }

    public Collection fill(Collection<String> c, int n){
        for(int i = 0; i<n; i++)c.add(next());
        return c;
    }
}

public class Ex4{
    public static void main(String[] args){
        Generator gen = new Generator();
        String[] a = new String[10];
        gen.fillStringSet(a);
        for(String s: a)System.out.print(s + ", ");
        System.out.println();
        System.out.println(gen.fill(new ArrayList<String>(), 10));
        System.out.println(gen.fill(new LinkedList<String>(), 10));
        System.out.println(gen.fill(new HashSet<String>(), 10));
        System.out.println(gen.fill(new LinkedHashSet<String>(), 10));
        System.out.println(gen.fill(new TreeSet<String>(), 10));
    }
}
