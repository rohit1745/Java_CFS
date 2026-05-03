package Collection;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_Demo {
    public static void main(String[] args) {

        TreeSet<Integer> tree=new TreeSet<>();
        tree.add(100);
        tree.add(100);
        tree.add(200);
        tree.add(300);
        tree.add(400);
        System.out.println(tree);



                System.out.println("======================================================================");




        SortedSet<Integer> sortedset=new TreeSet<>();
        sortedset.add(10);
        sortedset.add(2);
        sortedset.add(110);
        sortedset.add(5);
        sortedset.add(1000);
        System.out.println("Sorted Set:"+sortedset);
        System.out.println("First Element:"+sortedset.first());

        System.out.println("less than 110 element:" +sortedset.headSet(110)); // all element less than given element

        System.out.println("greater than 110 element:" +sortedset.tailSet(110)); //all element greater than equals to  given element
        System.out.println("======================================================================");
        NavigableSet<Integer> nset=new TreeSet();
        nset.add(10);
        nset.add(20);
        nset.add(30);
        nset.add(40);
        System.out.println("Navigable set:"+nset);
            
        

            
        
        

    }
    
}
