package ThreadCommunication;

public class Chef extends Thread{
    weddingHall hall;
    Chef(weddingHall h)
    {
        hall=h;

    }
    public void run()
    {
        System.out.println("Chef :It's preparing dinner........");
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            // TODO: handle exception
        }
        hall.dinnerReady=true;
        System.out.println("Chef:  dinner is Ready.........");
        hall.notify();
    }
}
