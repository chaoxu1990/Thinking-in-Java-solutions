//ch12 Ex16


import java.util.*;
import java.io.*;

public class Ex16{
    public static void vowelsCounter(Set<String> words){
        Set<Character> vowels = new HashSet<Character>();
        Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'E', 'a', 'e', 'i', 'o', 'u');
        int count = 0, totalCount = 0;
        for(String s: words){
            count = 0;
            for(Character c: s.toCharArray()){
                if(vowels.contains(c)){
                count++;
                totalCount++;
                }
            }
            System.out.println(s + ": " + count);
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
