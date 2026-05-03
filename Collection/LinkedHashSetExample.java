package Collection;
import java.util.LinkedHashSet;
public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(10);  //Not print duplicate element
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);

        System.out.println(lhs);  //Print in order comparitive to [ HashSet ] 
        
        
    }
    
}
