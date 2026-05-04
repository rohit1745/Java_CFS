package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMappDemo {
    public static void main(String[] args) {
        Map<Integer,String> map =new LinkedHashMap<>();
        map.put(1, "Rohit");
        map.put(2, "Prasad");
        map.put(3, "Chandu");
        System.out.println(map);
        

    }
    
}
