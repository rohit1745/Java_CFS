package prevent.join;

public class WashingMachine extends Thread {
    public void run()
    {
       
        try {
             System.out.println("Washing Started ......");
            Thread.sleep(10000);
            System.out.println("Washing Finished..........");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    
}
