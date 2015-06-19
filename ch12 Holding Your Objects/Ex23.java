//ch12 ex23
import java.util.*;

public class Ex23{
    private static int getMaj(int n){
        Random rand = new Random();
        Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
        for(int i = 0; i<10000; i++){
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null?1:freq+1);
        }

        int max = 0, maxKey = 0;
        for(int i = 0; i < m.keySet().size(); i++){
            if(max<m.get(i)){
                max = m.get(i);
                maxKey = i;
            }
        }
        return maxKey;
    }
    public static void main(String[] args){
        Map<Integer, Integer> m20 = new TreeMap<Integer, Integer>();
        for(int i = 0; i<2000; i++){
            int x = getMaj(10000);
            Integer freq = m20.get(x);
            m20.put(x, freq == null?1:freq+1);
        }
        System.out.println("Most often picked ints, 0-19, in 2000 tests of 10000 random picks: " + m20);
    }
}
