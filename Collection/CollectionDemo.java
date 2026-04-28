package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CollectionDemo {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,7};
        
        System.out.println(arr[2]);   // --------indexing
        //list
        
        List<Integer> List1=new ArrayList<>();//craeting array list from other collection
        List<Integer> List2=new ArrayList<>(2); // initial capacity 
        
        //by integer
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);//allow to print a duplicate element
        list.add(50);
        System.out.println("List"+list);
        System.out.println(list.get(2));    //--indexing


        //by String
        List<String> list4=new ArrayList<>();
        list4.add("rohit");//allow to print a duplicate element
        list4.add("prasad");
        System.out.println(list4);    //--indexing

        
       

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
