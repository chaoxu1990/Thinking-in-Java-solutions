//ch12, ex28

import java.util.*;

public class Ex28{
    public static void main(String[] args){
        Random rand = new Random();
        PriorityQueue<Double> qd = new PriorityQueue<Double>();
        for(int i = 0; i < 10; i++)
            qd.offer(rand.nextDouble()*i);

        while(qd.peek() != null)
            System.out.print(qd.poll() + " ");
        System.out.println();
    }
}
