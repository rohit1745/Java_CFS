package Collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> treemap=new TreeMap<>();
        treemap.put(10, "k");
        treemap.put(100, "G");
        treemap.put(50, "W");
        treemap.put(1, "R");
        System.out.println(treemap);
        
    }
    
}
