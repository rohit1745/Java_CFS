package ExecutorService;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ApplicationDemo  {
    public static void main(String[] args) {
            ExecutorService executerService = Executors.newFixedThreadPool(3);
            //  readUserData();
            //  readOrderData();
            //  callPaymentService();
            //  callNotificationService();
            //  readCacheData();
            //  readFromFile();
            executerService.submit(()->readUserData());
            executerService.submit(()->readOrderData());
            executerService.submit(()->callPaymentService());
            executerService.submit(()->callNotificationService());
            executerService.submit(()->readFromFile());
            


        
    }
    public static void readUserData()
    {
        System.out.println("Reading user data from db");
        sleep(2000);
        System.out.println("User db read completed");


    }
    public static void readOrderData()
    {
        
        System.out.println("Reading order data from db");
        sleep(2000);
        System.out.println("order db read completed");
    }
    public static void callPaymentService()
    {
        
        System.out.println("Calling Payment Service");
        sleep(2000);
        System.out.println("Calling Service Response Resevied");
    }
     public static void callNotificationService()
    {
        
        System.out.println("Calling Notification Service");
        sleep(3000);
        System.out.println("Calling Notifiaction  Response Resevied");
    }
     public static void readCacheData()
    {
        
        System.out.println("Read Data from Cache");
        sleep(1500);
        System.out.println("Cache read completed");
    }
     public static void readFromFile()
    {
        
        System.out.println("Reading Data from File");
        sleep(2000);
        System.out.println("Reading Data from File completed");
    }
    public static void sleep(int msec)
    {
        try {
            Thread.sleep(msec);
        } catch (Exception e) {
            // TODO: handle exception
            Thread.currentThread().interrupt();
        }
        

    }
  
}
