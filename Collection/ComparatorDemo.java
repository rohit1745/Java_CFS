package Collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;


class Employee {
    int id;
    String name;
    int sal;

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
     @Override
    public String toString() {
        return id + " " + name + " " + sal;
    }


}

class MyComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o2, Employee o1) {
        return o1.sal-o2.sal; //sorting by salary
        //return o1.id-o2.id; //sarting by emlpoyee ID
    }
}

public class ComparatorDemo {

    public static void main(String[] args) {
        Map<Employee,String> map=new TreeMap<>(new MyComparator());
        map.put(new Employee(1,"Raj",100000),"RAJ");
        map.put(new Employee(4,"Amit",200000),"Amit");
        map.put(new Employee(2,"Rohit",300000),"Ajay");
        map.put(new Employee(6,"OM",400000),"OM");

        System.out.println(map);
    }
}