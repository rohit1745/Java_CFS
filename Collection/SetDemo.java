package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(10);//Duplicate are not allow
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(null);
        System.out.println(set);


        ArrayList<String> a=new ArrayList<>();
        a.add("Ram");
        a.add("Null");  //it can print duplicate element
        a.add("Null");
        System.out.println(a);



        //Hash Set
        HashSet<Integer> h=new HashSet<>(4, 0.5f);
        h.add(100);
        h.add(200);
        h.add(300);
        System.out.println("Hash Seth:"+h); //Not print in order


        //Sorted Set
        SortedSet<Integer> s = new TreeSet<>();
        s.add(100);
        s.add(200);
        s.add(10);
        s.add(50);
        s.add(50);


        System.out.println("SortedSet:"+s); //print in order


        
            
        

    }
    
}
