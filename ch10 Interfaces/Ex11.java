class Swap{
    public String sp(String s){
        char[] ca = new char[s.length()];
        if(s.length() % 2 == 0){
            for(int i = 0; i<s.length(); i+=2){
                ca[i] = s.charAt(i+1);
                ca[i+1] = s.charAt(i);
            }
        }
        else{
            for(int i = 0; i<s.length() - 1; i+=2){
                ca[i] = s.charAt(i+1);
                ca[i+1] = s.charAt(i);
            }
            ca[s.length() - 1] = s.charAt(s.length() - 1);
        }

        return new String(ca);
    }
}
interface Processor{
    String name();
    Object process(Object input);
}

class Apply{
    public static void process(Processor p, Object s){
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}

class SwapAdapter implements Processor{
    public String name(){return "SwapAdapter";}
    Swap s;
    SwapAdapter(Swap sp){
        s = sp;
    }
    public String process(Object input){
        return s.sp((String)input);
    }
}
public class Ex11{
    public static void main(String[] args){
        String s = new String(args[0]);
        Apply.process(new SwapAdapter(new Swap()), s);
    }
}
