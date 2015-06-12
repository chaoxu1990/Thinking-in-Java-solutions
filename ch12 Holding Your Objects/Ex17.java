//ch12 Ex17

import java.util.*;

class Gerbil{
    String name;
    Gerbil(String s){name = s;}
    public void hop(){
        System.out.println("I am " + name + " and I am hopping!");
    }
}

public class Ex17{
    public static void main(String[] args){
        Map<String, Gerbil> Gmap = new HashMap<String, Gerbil>();
        Gmap.put("Luke", new Gerbil("Luke"));
        Gmap.put("Fuzzy", new Gerbil("Fuzzy"));
        Gmap.put("Isaac", new Gerbil("Isaac"));
        Gmap.put("Freckly", new Gerbil("Freckly"));
        Gmap.put("Marilyn", new Gerbil("Marilyn"));

        for(String s: Gmap.keySet()){
            Gmap.get(s).hop();
        }
    }
}
