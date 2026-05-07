package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
            ArrayList<Integer> list=new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            System.out.println(list); //all print 
            System.out.println(list.get(1));// index print
            System.out.println(list.size()); //index size print


            ArrayList<String> list2=new ArrayList<>();
            list2.add("ROHIT");
            list2.add("PRASAD");
            list2.add("CHANDU");
            list2.add("RAM");
            System.out.println(list2);
            list2.add(1,"Eknath");  //add element in particular index
            System.out.println(list2);
            list2.remove(2);  // Remove element in particular index
            System.out.println(list2);
            System.out.println(list2.get(0));
            System.out.println(list2.size());
            

            String arr[]={"A","B","C","D","E"};
            List<String> List=new ArrayList<>(Arrays.asList(arr));
            System.out.println(List);

            //Travers

            //Sorting
             ArrayList<Integer> list4=new ArrayList<>();
            list4.add(10);
            list4.add(30);
            list4.add(50);
            list4.add(20);
            Collections.sort(list4);
            System.out.println(list4);


        }
   
        
    
    
}
