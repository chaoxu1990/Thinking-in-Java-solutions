//ch12, ex24
import java.util.*;

public class Ex24{
    public static void main(String[] args){
        Map<String, Integer> m = new LinkedHashMap<String, Integer>();
        m.put("ten", 10);
        m.put("nine", 9);
        m.put("eight", 8);
        m.put("seven", 7);
        m.put("six", 6);
        m.put("five", 5);
        m.put("four", 4);
        m.put("three", 3);
        m.put("two", 2);
        m.put("one", 1);
        m.put("zero", 0);

        System.out.println("Map to sort: " + m);

        List<String> sortedList = new LinkedList<String>(m.keySet());
        Collections.sort(sortedList);

        Iterator<String> sortedListIt = sortedList.iterator();
        while(sortedListIt.hasNext()){
            String s = sortedListIt.next();
            Integer i = m.get(s);
            m.remove(s);
            m.put(s,i);
        }

        System.out.println("Sorted map: " + m);
    }
}
