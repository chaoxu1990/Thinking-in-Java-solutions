//Ch12 Ex6

import java.util.*;

public class Ex6{
    public static void main(String[] args){
        Random rand = new Random(47);
        ArrayList<String> ss = new ArrayList<String>();
        for(int i = 0; i<10; i++) ss.add(Integer.toString(i));
        System.out.println("1: " + ss);
        String s1 = "42";
        ss.add(s1);
        System.out.println("2: " + ss);
        System.out.println("3: " + ss.contains(s1));
        ss.remove((Object)s1);
        String s2 = ss.get(2);
        System.out.println("4: " + s2 + " " + ss.indexOf(s2));
        String s3 = "3";
        System.out.println("5: " + ss.indexOf(s3));
        System.out.println("6: " + ss.remove(s3));
        System.out.println("7: " + ss.remove(s2));
        System.out.println("8: " + ss);
        ss.add(3, "43");
        System.out.println("9: " + ss);
        List<String> sub = ss.subList(1,4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + ss.containsAll(sub));
        Collections.shuffle(sub, rand);
        System.out.println("shuffled subList: " + sub);
        System.out.println("11: " + ss.containsAll(sub));
        Collections.sort(sub);
        System.out.println("sorted subList: " + sub);
        System.out.println("12: " + ss.containsAll(sub));
        List<String> copy = new ArrayList<String>(ss);
        sub = Arrays.asList(ss.get(1), ss.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<String>(ss);
        copy.remove(0);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(1, "44");
        System.out.println("16: " + copy);
        copy.addAll(2,sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + ss.isEmpty());
        ss.clear();
        System.out.println("19: " + copy);
        System.out.println("20: " + ss.isEmpty());
   }
}

