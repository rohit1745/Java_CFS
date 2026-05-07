package Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncronizedMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Null",20);
        map.put("Rohit",null);
        System.out.println(map); //It is allow to print null value compare to ConcurrentHashMap


        Collections.synchronizedMap(map);

        ConcurrentMap<String,Integer> con=new ConcurrentHashMap<>();
         map.put("Null",20);
        map.put("Rohit",null);
        System.out.println(con); //It not allow to print null value compare to HashMap


        CopyOnWriteArrayList copy=new CopyOnWriteArrayList<>();
        copy.add(100);
        copy.add(100);
        copy.add(200);
        copy.add(300);
        copy.add(500);
        System.out.println(copy);


    }
    
}
