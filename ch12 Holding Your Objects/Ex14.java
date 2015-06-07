//ch12, Ex14
import java.util.*;

public class Ex14{
    public static void addMid(LinkedList<Integer> l, int x){
        ListIterator<Integer> lt = l.listIterator((l.size())/2);
        lt.add(x);
    }

    public static void main(String[] args){
        LinkedList<Integer> li = new LinkedList<Integer>();
        int[] x = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i: x) {
            Ex14.addMid(li, i);
            System.out.println(li);
        }
    }
}
