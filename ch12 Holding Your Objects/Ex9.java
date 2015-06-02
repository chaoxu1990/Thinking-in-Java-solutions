import java.util.*;

public class Ex9{
    private ArrayList<Object> items = new ArrayList<Object>();
    public void add(Object x){items.add(x);}
    public Iterator<Object> iterator(){return items.iterator();}
    public static void main(String[] args){
        Ex9 ex = new Ex9();
        for(int i = 0; i<10; i++) ex.add(i);
        Iterator<Object> it = ex.iterator();
        while(it.hasNext()) System.out.println(it.next());
    }
}
