package OOPs.Exception;

public class demo {
     public static void main (String args[])
    
    {
       
        viewCar();
    //    testDrive();
    //     paperProcess();
    //      Done();
        
    }
    public static void viewCar()
        {
            System.out.println("check the car");
         testDrive();

        }
    public static void testDrive()
    {
        System.out.println("Drive the car");
        paperProcess();
    }
    public static void paperProcess()
    {
        System.out.println("Complete paper Process.....");
        Done();
    }
    public static void Done()
    {
        try{
            System.out.println(10/0);
        }
        catch(Exception e)
        {
             System.out.println("bhai payment Purna karavi lagel...........");
            // System.out.println(e.getMessage());
           // System.out.println(e.toString());
           //e.printStackTrace();
            
          
        }
        
        System.out.println("Payment Done");
    }
    
}
