//ch12, Ex27
import java.util.*;
class Command{
    String s;
    Command(String str){s = str;}
    void operation(){System.out.print(s);}
}

class Build{
    Queue<Command> buildQueue(){
        Queue<Command> q = new LinkedList<Command>();
        for(int i = 0; i<10; i++){
            q.offer(new Command(i + " "));
        }
        return q;
    }
}

public class Ex27{
    public static void main(String[] args){
        Build b = new Build();
        Queue<Command> q = b.buildQueue();

        while(q.peek() != null)
            q.poll().operation();
        System.out.println();
    }
}
