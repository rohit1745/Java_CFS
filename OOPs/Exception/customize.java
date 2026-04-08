package OOPs.Exception;

import java.util.Scanner;

class NSalException extends Exception
{
    NSalException(String message)
    {
        super(message);
    }
}

public class customize 
{
    void info() throws NSalException
    {
        Scanner cs=new Scanner(System.in);
        System.out.println("Enter your salary");
        int sal=cs.nextInt();
        if(sal<0)
        {
            throw new NSalException("negative Salary");
        }
        else
        {
            System.out.println("Your salary is good "+sal);
        }
        
    }
    
}
