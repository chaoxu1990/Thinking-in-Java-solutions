//Ch11, Ex12.java

/*
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
*/
interface Inner{
    public void Modify();
}
class Helper{
    private int i = 3;
    private String show(){return "Hello World!";}

    public Inner InnerCreator(){
        return new Inner(){
            public void Modify(){
                i = 5;
                System.out.println("i = " + i);
                System.out.println(show());
            }
        };
    }

    public void showi(){System.out.println("i = " + i);}
}


public class Ex12{
    public static void main(String[] args){
        Helper hp = new Helper();
        hp.showi();
        hp.InnerCreator().Modify();
    }
}

