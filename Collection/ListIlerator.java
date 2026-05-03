package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIlerator {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list);

        ListIterator<Integer> ListIterator = list.listIterator();
        while(ListIterator.hasNext())
        {
            Integer data  = ListIterator.next();

            if(data==10)
            ListIterator.remove();
            ListIterator.add(200);
            
            if(data==30)
            {
            ListIterator.add(100);
            //ListIterator.nextIndex();
            }

            
        }
        System.out.println(list);
        
        
    }
}
