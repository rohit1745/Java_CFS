package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
    }
    
}
