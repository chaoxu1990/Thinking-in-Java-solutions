//Ch11, Ex15

class First{
    private String str;
    First(String s){
        str = s;
    }
    public String toString(){return str;}
}

public class Ex15{
    public First FirstMaker(String s){
        return new First(s){};
    }

    public static void main(String[] args){
        Ex15 e = new Ex15();
        System.out.println(e.FirstMaker("Hello World!"));
    }
}
