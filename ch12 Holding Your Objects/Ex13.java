//ch 12, Ex13
import java.util.*;

public class Ex13{
    private List<Event> eventList = new LinkedList<Event>();
    public void addEvent(Event c){eventList.add(c);}
    public void run(){
        ListIterator<Event> it = eventList.listIterator();
        while(it.hasNext()){
            it.next().action();
            it.previous();
            System.out.println(it.next());
        }
    }
}
