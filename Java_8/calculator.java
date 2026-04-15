package Java_8;

@FunctionalInterface
public interface calculator {
     int sum (int a , int b);
}
     public interface Print {
        void display(String name);
     
        
     }
     
    

class test
{
    public static void main(String[] args) {
        calculator c1=(a,b)->
        {
            return a+b;
        };
        int res = c1.sum(10, 10);
        System.out.println("Calculation is:"+res);

        Print p=(name)->{
            System.out.println(name);
        };
        p.display("Rohit");
    }
}
   
       
    
        
    
    

