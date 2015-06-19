//ch12 ex26

import java.util.*;
import java.io.*;

public class Ex26{
    public static void main(String[] args){
       List<String> words = new ArrayList<String>();
        try{
            BufferedReader in = new BufferedReader(new FileReader("UniqueWords.java"));
            while(in.ready()){
                String text = in.readLine();
                String[] tmp = text.split("\\W+");
                for(String s: tmp)
                    if(!s.isEmpty())
                        words.add(s);
            }
        }catch(IOException e){e.printStackTrace();}
        System.out.println("Words in file: " + words);

        Map<String, ArrayList<Integer>> m = new LinkedHashMap<String, ArrayList<Integer>>();
        int count = 0;
        Iterator<String> itWords = words.iterator();
        while(itWords.hasNext()){
            String s = itWords.next();
            count++;
            if(m.keySet().contains(s)){
                m.get(s).add(count);
                m.put(s, m.get(s));
            }
            else{
                ArrayList<Integer> a = new ArrayList<Integer>();
                a.add(0, count);
                m.put(s, a);
            }
        }
        System.out.println("Map of word locations: " + m);

        Map<Integer, String> reOrder = new TreeMap<Integer, String>();
        Iterator<Map.Entry<String, ArrayList<Integer>>> itEntry = m.entrySet().iterator();
        while(itEntry.hasNext()){
            Map.Entry<String, ArrayList<Integer>> me = itEntry.next();
            for(int i = 0; i<me.getValue().size(); i++)
                reOrder.put(me.getValue().get(i), me.getKey());
        }
        System.out.println();
        System.out.println("TreeMap of ordered locations, words: " + reOrder);
        System.out.println();
        System.out.println("Words in original order: " + reOrder.values());
    }
}


