package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CollectionDemo {
    public static void main(String[] args) {

        //list
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(50);

        System.out.println("List"+list);

        //Queue
        Queue<Integer> Queue=new ConcurrentLinkedQueue<>();
        Queue.add(100);
        Queue.add(100);
        Queue.add(200);
        Queue.add(300);
        Queue.add(400);
        System.out.println("Queue"+Queue);


        
    }
    
}
