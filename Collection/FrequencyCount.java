package Collection;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        Map<Integer,Integer> map=new HashMap();
        for(int n : arr)
        {
            map.put(n,map.getOrDefault(n, 1)+1);
        }
        System.out.println(map);
    }
    
}
