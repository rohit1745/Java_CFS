package ThreadCommunication;

public class CommDemo {
    public static void main(String[] args) {
        weddingHall w=new weddingHall();
        Guest g=new Guest(w);
        Chef c=new Chef(w);
        g.start();
        c.start();

    }
    
}
