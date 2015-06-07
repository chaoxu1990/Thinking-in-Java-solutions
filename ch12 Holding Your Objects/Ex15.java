//ch12, Ex15
import java.util.*;

public class Ex15{
    public static void main(String[] args){
        String input = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '+'){
                st.push(input.charAt(++i));
                continue;
            }
            else if(input.charAt(i) == '-'){
                System.out.print(st.pop());
            }
        }
        System.out.println();
    }
}
