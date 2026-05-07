package ThreadCommunication;

public class Guest extends Thread{
    weddingHall hall;
    Guest (weddingHall h)
    {
        hall=h;
    }
    public void run()
    {
        synchronized(hall){

        
        System.out.println("Guest Enter Hall..........");
        while(hall.dinnerReady)
        {
            System.out.println("Guest Pleas wait!... dinner is not ready");
            try {
                hall.wait(); //release lock
            } 
            catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println("Guest  is having dinner..........");
    }
    }
    
}
