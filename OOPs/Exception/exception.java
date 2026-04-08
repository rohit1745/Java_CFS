package OOPs.Exception;


class exception
{
    public static void main(String args[])
    {
        try{

        
       
        System.out.println("A");
        System.out.println(10/0);
        System.out.println("B");
        }
        catch(ArithmeticException e)
        {
             System.out.println("hii");
                System.out.println(e.getMessage());
                 System.out.println("B");
        }
        System.out.println("C");
       
    }
}