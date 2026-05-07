package WithOutSyn;

public class test {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();


        Thread Pati = new WithOutSyn.PersonDemo("Pati",account); //t1
        Thread Patni = new WithOutSyn.PersonDemo("Patni",account); //t2
         Pati.start();
         Patni.start();
        

    }
    
}
