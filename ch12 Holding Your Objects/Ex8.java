//Ch12, Ex8

import java.util.*;

class Gerbil{
    int gerbilNumber;
    Gerbil(int i){gerbilNumber = i;}
    public void hop(){
        System.out.println("I am gerbil No." + gerbilNumber + " and I am hopping!");
    }
}

public class Ex8{
    public static void main(String[] args){
        ArrayList<Gerbil> gb = new ArrayList<Gerbil>();
        for(int i = 0; i<5; i++)
            gb.add(new Gerbil(i));

        Iterator<Gerbil> it = gb.iterator();
        while(it.hasNext()) it.next().hop();
    }
}

