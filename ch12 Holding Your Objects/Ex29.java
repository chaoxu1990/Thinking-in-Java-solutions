//ch12, Ex29

import java.util.*;

class A extends Object{}

public class Ex29{
    public static void main(String[] args){
        PriorityQueue<A> pq = new PriorityQueue<A>();
        pq.offer(new A());

        /*
         *  pq.offer(new A());
         *  error: cannot be cast to java.lang.Comparable
        */
    }
}
