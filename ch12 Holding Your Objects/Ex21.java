//ch12 ex21

import java.util.*;
import java.io.*;

public class Ex21{
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
        Iterator<String> it = words.iterator();
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        Map<String, Integer> count = new HashMap<String, Integer>();
        int totalWords = 0;
        while(it.hasNext()){
            String s = it.next();
            Integer cnt = count.get(s);
            count.put(s, cnt == null?1:cnt+1);
            totalWords++;
        }
        System.out.println("Word count: " + count);
        System.out.println("totalWords: " + totalWords);
    }
}
