package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CursorDemo {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>(Arrays.asList("Rohit","prasad","chandu","Hemant"));
        System.out.println(a);

        Iterator<String> it=a.iterator();

        while(it.hasNext())
        {
            String data = it.next();
            
            if (data.equals("Rohit")) {
                System.out.println("Found");
            } 
            else {
                System.out.println(data);
            }
        }
        

    }
    
}
