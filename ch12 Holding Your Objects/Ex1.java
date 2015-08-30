//Ch12, Ex1
//test

import java.util.ArrayList;

class Gerbil{
    int gerbilNumber;
    Gerbil(int i){gerbilNumber = i;}
    public void hop(){
        System.out.println("I am gerbil No." + gerbilNumber + " and I am hopping!");
    }
}

public class Ex1{
    public static void main(String[] args){
        ArrayList<Gerbil> gb = new ArrayList<Gerbil>();
        for(int i = 0; i<5; i++)
            gb.add(new Gerbil(i));
        for(int i = 0; i<5; i++)
            gb.get(i).hop();

        for(Gerbil g: gb)
            g.hop();
    }
}
