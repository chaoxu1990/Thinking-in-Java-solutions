class Word{
    private String s;
    Word(String w){
        s = w;
    }
    public String toString(){
        return s;
    }
}

interface Selector{
    boolean end();
    Object current();
    void next();
}

public class Ex2{
    private Object[] items;
    private int next = 0;
    public Ex2(int size){items = new Object[size];}
    public void add(Object x){
        if(next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector{
        private int i = 0;
        public boolean end() {return i == items.length;}
        public Object current(){return items[i];}
        public void next(){if(i < items.length) i++;}
    }

    public Selector selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args){
        Ex2 ex = new Ex2(2);
        ex.add(new Word("Hello "));
        ex.add(new Word("World!"));
        Selector s = ex.selector();

        while(!s.end())
        {
            System.out.print(s.current() + " ");
            s.next();
        }

        System.out.println();
    }
}
