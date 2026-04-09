package WithOutSyn;

public class BankAccount {
    int bal=1000;
    void withdraw(int amount)
    {
        if(bal >= amount)
        {
                System.out.println(Thread.currentThread().getName()+" going to Withdraw. Balance: "+bal+  "  Total balance:"+bal);
            try {
             Thread.sleep(1000);
            }
             catch (Exception e) {
            // TODO: handle exception
                System.out.println("Exception");
            }
                bal=bal-amount;
                System.out.println(Thread.currentThread().getName()+" Completed withdraw. Remaining balance="+bal);
        }
        else{
            System.out.println("Not enough balance for "+Thread.currentThread().getName() );
        }
        
    
}
}