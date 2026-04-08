package OOPs.Exception;
 import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class throwDemo2 {
     public static void main(String[] args) {
        div();
    }
    static void div() throws ArithmeticException,InputMismatchException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("First No");
        int a=sc.nextInt();
        System.out.println("Second No");
        int b=sc.nextInt();
        int c;
        if(b==0)
        {
            throw new ArithmeticException("Divided by zero");
        }
        else
        {
            c=a/b;
            System.out.println(c);
        }

    }
   
    
}
