package Collection;

import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q);

        //Smallest value --->highest Priority [ Queue<Integer> q = new PriorityQueue<>(); ]
        //Bigest value ---->highest Priority [ Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());]
        System.out.println(q.poll());
            
        
    }
    
}
