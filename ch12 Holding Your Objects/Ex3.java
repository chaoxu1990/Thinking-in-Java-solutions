//Ch12, Ex3

import java.util.*;

interface Selector{
    boolean end();
    Object current();
    void next();
}

public class Ex3{
    ArrayList<Object> items = new ArrayList<Object>();
    public void add(Object x){items.add(x);}
    private class SequenceSelector implements Selector{
        private int i = 0;
        public boolean end(){return i == items.size();}
        public Object current(){return items.get(i);}
        public void next(){i++;}
    }
    public Selector selector(){
        return new SequenceSelector();
    }
    public static void main(String[] args){
        Ex3 e = new Ex3();
        for(int i = 0; i<10; i++)e.add(i);
        Selector s = e.selector();
        while(!s.end()){
            System.out.print(s.current() + " ");
            s.next();
        }
        System.out.println();
        e.add(10);
        e.add(11);
        e.add(12);
        e.add("Hello World!");
        e.add("Good Bye!");
        while(!s.end()){
            System.out.print(s.current() + " ");
            s.next();
        }
        System.out.println();
    }
}
