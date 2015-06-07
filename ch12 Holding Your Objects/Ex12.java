//ch12, ex12

import java.util.*;
public class Ex12{
    public static void main(String[] args){
        List<Integer> a = new ArrayList<Integer>(10);
        for(int i = 0; i<10; i++) a.add(i);
        List<Integer> b = new ArrayList<Integer>(a);
        ListIterator<Integer> ia = a.listIterator(10);
        ListIterator<Integer> ib = b.listIterator();
        //while(ia.hasNext())ia.next();
        while(ib.hasNext() && ia.hasPrevious()){
            ib.next();
            ib.set(ia.previous());
        }
        /*
         * Using hasNext() to check if there's a next element.
         * Similarly, we cna use hasPrevious() to check if there's a previous element.
         * Using next() method to return the next element.
         * Similarly, we can use previous() method to return previous element.
         * Using set() method to replace the element.
        */
        System.out.println(a);
        System.out.println(b);
    }
}
