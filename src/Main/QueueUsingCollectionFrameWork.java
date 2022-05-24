package Main;
import java.util.*;
import java.util.LinkedList;
//Through LinkedList
public class QueueUsingCollectionFrameWork {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
        //Through ArrayDeque
        Queue<Integer> p=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!p.isEmpty())
        {
            System.out.println(p.peek());
            p.remove();
        }
    }
}
