//: holding/UniqueWords.java

import java.util.*;
import net.mindview.util.*;

public class UniqueWords{
    public static void main(String[] args){
        Set<String> words = new TreeSet<String>(
                new TextFile("SetOperations.java", "\\w+"));
        System.out.println(words);
    }
}
