package WithOutSyn;

public class Person extends Thread {
    BankAccount account;
    Person(String name, BankAccount account)
    {
        super(name);
        this.account=account;

    }
 public void run()
{
    account.withdraw(500);
  
    
}
    
}
