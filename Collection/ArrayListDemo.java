package Collection;

import java.util.ArrayList;

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
            System.out.println(list2.get(0));
            System.out.println(list2.size());
            
        }
   
        
    
    
}
