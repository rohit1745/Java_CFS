package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,3,4,5,4,5,6,7));
        System.out.println(list);
        

        ArrayList<Integer> unique=new ArrayList<>();
        
        for(Integer data:list)
            {
                if(!unique.contains(data))
                {
                    unique.add(data);
                }
            }
            System.out.println(unique);
    }
}
