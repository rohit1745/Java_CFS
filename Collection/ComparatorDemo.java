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
    public int compare(Employee o1, Employee o2) {
        return o2.id-o1.id;
    }
}

public class ComparatorDemo {

    public static void main(String[] args) {
        Map<Employee,String> map=new TreeMap<>(new MyComparator());
        map.put(new Employee(1,"Raj",10001),"RAJ");
        map.put(new Employee(4,"Amit",34344),"Rohit");
        map.put(new Employee(2,"Rohit",232323),"Ajay");
        map.put(new Employee(6,"OM",390090),"OM");

        System.out.println(map);
    }
}