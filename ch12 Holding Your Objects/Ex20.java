//ch12 Ex20


import java.util.*;
import java.io.*;

public class Ex20{
    public static void vowelsCounter(Set<String> words){
        Map<Character, Integer> vowels = new HashMap<Character, Integer>();
        vowels.put('A', 0);
        vowels.put('E', 0);
        vowels.put('I', 0);
        vowels.put('O', 0);
        vowels.put('U', 0);
        vowels.put('a', 0);
        vowels.put('e', 0);
        vowels.put('i', 0);
        vowels.put('o', 0);
        vowels.put('u', 0);
        int totalCount = 0;
        for(String s: words){
            for(Character c: s.toCharArray()){
                if(vowels.containsKey(c)){
                Integer count = vowels.get(c);
                vowels.put(c, count == null?1:count+1);
                totalCount++;
                }
            }
        }

        for(Character c: vowels.keySet()){
            System.out.println(c + " " + vowels.get(c));
        }
        System.out.println("TotalCount: " + totalCount);
    }
    public static void main(String[] args){
        Set<String> words = new HashSet<String>();
        try{
            BufferedReader in = new BufferedReader(new FileReader("UniqueWords.java"));
            while(in.ready()){
                String text = in.readLine();
                Collections.addAll(words, text.split("\\W+"));
            }
        }catch(IOException e){e.printStackTrace();}
        Iterator<String> it = words.iterator();
        words.remove(it.next());
        vowelsCounter(words);
        //System.out.println(words);
    }
}

