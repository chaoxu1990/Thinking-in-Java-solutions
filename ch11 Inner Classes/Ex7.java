//Ch11, Ex7.java


class Helper{
    private int i = 3;
    private String show(){return "Hello World!";}

    class Inner{
        public void Modify(){
            i = 5;
            System.out.println("i = " + i);
            System.out.println(Helper.this.show());
        }
    }
    public void InnerCreator(){
        Inner ir = new Inner();
        ir.Modify();
    }
}

public class Ex7{
    public static void main(String[] args){
        Helper hp = new Helper();
        hp.InnerCreator();
    }
}
