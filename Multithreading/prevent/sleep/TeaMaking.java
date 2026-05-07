package prevent.sleep;

public class TeaMaking extends Thread {
    public  void run()
    {
        try {
            System.out.println("Wat Bolling........");
            Thread.sleep(2000);
            System.out.println("Tea is ready.........");
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Tea making some Problems......");
        }
    }

    
}
