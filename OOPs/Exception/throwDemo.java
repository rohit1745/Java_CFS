package OOPs.Exception;

import OOPs.inheritance.test;

public class throwDemo {
    public static void main(String[] args) {
         int age=15;
    
    
        if(age<18)
        {
            throw new ArithmeticException("Not valid for votting");
        }
        System.out.println("valid for votting");
    }
   
    
}
