package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1, "Rohit");
        map.put(2, "Prasad");
        map.put(3, "Chandu"); //Complexity 0(1)
         map.put(null, "Eknath");
         System.out.println(map);

        String value=map.get(1);  //print particular key ex=1
        System.out.println(value);

        for(Map.Entry<Integer,String> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " ----> " + entry.getValue());
        }


        if(map.containsKey(3))  //findout key
        {
            System.out.println("Available");
        }
        else
        {
            System.out.println("Unavailable");
        }
        
        
    }
}
