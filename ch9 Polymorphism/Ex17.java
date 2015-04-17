//Ch9, Ex17.java
//
class Cycle{
    Cycle(){
        System.out.println("Cycle constructor!");
    }

    public void r(int i){
        System.out.println("Cycle(" + i + ") ride!");
    }
}

class Unicycle extends Cycle{
    Unicycle(){
        System.out.println("Unicycle constructor!");
    }
    public void r(int i){
        System.out.println("Unicycle(" + i + ") ride!");
    }
    public void balance(){
        System.out.println("Unicycle balance!");
    }
}

class Bicycle extends Cycle{
    Bicycle(){
        System.out.println("Bicycle constructor!");
    }
    public void r(int i){
        System.out.println("Bicycle(" + i + ") ride!");
    }
    public void balance(){
        System.out.println("Bicycle balance!");
    }
}


class Tricycle extends Cycle{
    Tricycle(){
        System.out.println("Tricycle constructor!");
    }
    public void r(int i){
        System.out.println("Tricycle(" + i + ") ride!");
    }
}

class Ex17{
    public static void main(String[] args){
        Cycle[] c = {new Unicycle(), new Bicycle(), new Tricycle()};
        c[0].r(1);
        c[1].r(2);
        c[2].r(3);

        //error, cannot find method "balance"
        /*
         * c[0].balance();
         * c[1].balance();
         * c[2].balance();
         */

        ((Unicycle)c[0]).balance();
        ((Bicycle)c[1]).balance();
        //error, cannot find the method "balance"
        //((Tricycle)c[1]).balance();


    }
}

