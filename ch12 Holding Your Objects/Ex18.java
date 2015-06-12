//ch12 Ex18

import java.util.*;

class Gerbil{
    String name;
    Gerbil(String s){name = s;}
    public void hop(){
        System.out.println("I am " + name + " and I am hopping!");
    }
}

public class Ex18{
    public static void main(String[] args){
        Map<String, Gerbil> Gmap = new HashMap<String, Gerbil>();
        Gmap.put("Luke", new Gerbil("Luke"));
        Gmap.put("Fuzzy", new Gerbil("Fuzzy"));
        Gmap.put("Isaac", new Gerbil("Isaac"));
        Gmap.put("Freckly", new Gerbil("Freckly"));
        Gmap.put("Marilyn", new Gerbil("Marilyn"));

        System.out.println(Gmap);

        Map<String, Gerbil> sortedGmap = new TreeMap<String, Gerbil>(Gmap);
        System.out.println(sortedGmap);
    }
}

