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
        while(ib.hasNext()){
            ib.next();
            ib.set(ia.previous());
        }
        System.out.println(a);
        System.out.println(b);
    }
}
