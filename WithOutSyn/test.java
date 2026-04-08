package WithOutSyn;

public class test {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();


        Thread Pati = new Person("Pati",account); //t1
        Thread Patni = new Person("Patni",account); //t2
         Pati.start();
         Patni.start();
        

    }
    
}
