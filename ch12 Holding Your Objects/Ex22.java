//ch12 ex22

import java.util.*;
import java.io.*;
class strCnt{
    String s;
    int cnt;
    strCnt(String str, int count){
        s = str;
        cnt = count;
    }
    public String toString(){return s + ": " + cnt;}
}
public class Ex22{
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
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println(words);
        Set<strCnt> strObj = new HashSet<strCnt>();
        Iterator<String> it = words.iterator();
        String s1 = "", s2 = "";
        if(it.hasNext())
            s1 = it.next();

        int totalWords = 1;
        while(it.hasNext()){
            int cnt = 1;
            while(it.hasNext()){
                s2 = it.next();
                totalWords++;
                if(s1.equals(s2))
                    cnt++;
                else
                    break;
            }
            strCnt w = new strCnt(s1, cnt);
            strObj.add(w);
            s1 = s2;
        }
        Iterator<strCnt> it2 = strObj.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        System.out.println("totalWords: " + totalWords);
    }
}

