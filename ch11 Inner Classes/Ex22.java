//Ch11, Ex22

interface Selector{
    boolean end();
    Object current();
    void next();
}

interface reverseSelector{
    boolean begin();
    Object current();
    void previous();
}

class Sequence{
    private Object[] items;
    private int next = 0;
    public Sequence(int size){items = new Object[size];}
    public void add(Object x){
        if(next < items.length){
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector{
        private int i = 0;
        public boolean end(){return i == items.length;}
        public Object current(){return items[i];}
        public void next(){if(i < items.length) i++;}
    }

    public Selector selector(){
        return new SequenceSelector();
    }

    private class SequenceReverseSelector implements reverseSelector{
        private int i = items.length - 1;
        public boolean begin(){return i == -1;}
        public Object current(){return items[i];}
        public void previous(){if(i > -1) i--;}
    }

    public reverseSelector reverseSelector(){
        return new SequenceReverseSelector();
    }
}

class Ex22{
    public static void main(String[] args){
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println();
        reverseSelector reverseselector = sequence.reverseSelector();
        while(!reverseselector.begin()){
            System.out.print(reverseselector.current() + " ");
            reverseselector.previous();
        }
        System.out.println();
    }
}
