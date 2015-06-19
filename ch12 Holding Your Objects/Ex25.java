//ch12 ex25
import java.util.*;
import java.io.*;

public class Ex25{
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
    }
}

