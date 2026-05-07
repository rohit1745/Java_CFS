package Abstract;

public abstract class App {
    public static void main(String[] args) {
        Payment p= new NetBanking();
        p.Invoice();
        p.pay();
        p=new CreaditCard();
        p.pay();

        
    }
    
}
