//Ch12 Ex5

import java.util.*;

public class Ex5{
    public static void main(String[] args){
        Random rand = new Random(47);
        ArrayList<Integer> ints = new ArrayList<Integer>();
        for(int i = 0; i<7; i++) ints.add(i);
        System.out.println("1: " + ints);
        int i1 = 42;
        ints.add(i1);
        System.out.println("2: " + ints);
        System.out.println("3: " + ints.contains(i1));
        ints.remove((Object)i1);
        int i2 = ints.get(2);
        System.out.println("4: " + i2 + " " + ints.indexOf(i2));
        int i3 = 3;
        System.out.println("5: " + ints.indexOf(i3));
        System.out.println("6: " + ints.remove(i3));
        System.out.println("7: " + ints.remove(i2));
        System.out.println("8: " + ints);
        ints.add(3, 43);
        System.out.println("9: " + ints);
        List<Integer> sub = ints.subList(1,4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + ints.containsAll(sub));
        Collections.shuffle(sub, rand);
        System.out.println("shuffled subList: " + sub);
        System.out.println("11: " + ints.containsAll(sub));
        Collections.sort(sub);
        System.out.println("sorted subList: " + sub);
        System.out.println("12: " + ints.containsAll(sub));
        List<Integer> copy = new ArrayList<Integer>(ints);
        sub = Arrays.asList(ints.get(1), ints.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<Integer>(ints);
        copy.remove(0);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(1, 44);
        System.out.println("16: " + copy);
        copy.addAll(2,sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + ints.isEmpty());
        ints.clear();
        System.out.println("19: " + copy);
        System.out.println("20: " + ints.isEmpty());
   }
}
