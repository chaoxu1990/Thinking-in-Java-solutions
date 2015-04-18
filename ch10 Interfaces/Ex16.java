import java.nio.*;
import java.util.*;

class RandomChars{
    private static Random rand = new Random();
    public char next(){return (char)rand.nextInt(128);}
}

public class Ex16 extends RandomChars implements Readable{
    private int count;
    public Ex16(int count){
        this.count  = count;
    }

    public int read(CharBuffer cb){
        if(count-- == 0) return -1;
        String result = Character.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args){
        Scanner s = new Scanner(new Ex16(10));
        while(s.hasNext())
            System.out.print(s.next() + " ");
        System.out.println();
    }
}
