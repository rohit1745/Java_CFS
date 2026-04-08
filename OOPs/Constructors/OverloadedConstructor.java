package OOPs.Constructors;

import java.security.PublicKey;

public class OverloadedConstructor {
    String name,city,country;
    {
        name="Rohit";
        city="Sarangkheda";
        country="Maharastra";
        
    }
     void Info()
    {
        System.out.println("Student name="+name);
        System.out.println("Student city="+city);
        System.out.println("Student country="+country);
    }
   
   
    void College (String n,String ct,String c)
    {
        name=n;
        city=ct;
        country=c;
       
        System.out.println("name"+n);
        System.out.println("city"+ct);
        System.out.println("country"+c);
    }
  
    
}
class Demo
{
    public static void main(String args[])
    {
        OverloadedConstructor o=new OverloadedConstructor();
        o.Info();
          OverloadedConstructor o1=new OverloadedConstructor();
          o1.College("prasad","Dhule","Bihar");

    }
}
