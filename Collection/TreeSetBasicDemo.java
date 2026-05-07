package Collection;

import java.util.TreeSet;
class Student
{
    int roll_No;
    String name;
    public Student(int roll_No, String name) {
        this.roll_No = roll_No;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [roll_No=" + roll_No + ", name=" + name + "]";
    }
    
}
public class TreeSetBasicDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeset=new TreeSet<>();
        treeset.add(10);
        treeset.add(100);
        treeset.add(50);
        treeset.add(30);
        treeset.add(90);
        System.out.println(treeset);

        TreeSet<Student> studentSet=new TreeSet<>();
        Student s=new Student(1, "Rohit");
        Student s1=new Student(2, "Eknath");
        Student s2=new Student(3, "Prasad");
        studentSet.add(s);
        studentSet.add(s1);
        studentSet.add(s2);

        
        
    }
    
}
