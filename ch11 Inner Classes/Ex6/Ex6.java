import FirstPackage.*;
import SecondPackage.*;

public class Ex6 extends SecondFile{
    FirstFile getInner(){
        return this.new inner();
    }

    public static void main(String[] args){
        Ex6 x = new Ex6();
        System.out.println(x.getInner().show());
    }
}
