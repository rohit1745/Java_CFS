package LockDemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance=100000;
    private final Lock lock = new ReentrantLock();
    void withdraw(int amount)
    {
        lock.lock();
        try {
            
        
        System.out.println(Thread.currentThread().getName()+"entered");
        balance=balance-amount;
        System.out.println("Balance After Withdraw:"+balance);
        }
         catch (Exception e) {
            // TODO: handle exception
        }
        finally{
            lock.unlock();
        }

    }
    
}
class Test
{
    public static void main(String[] args)throws InterruptedException, ExecutionException {
         ExecutorService executor = Executors.newFixedThreadPool(2);
         BankAccount account=new BankAccount();
         executor.submit(()->account.withdraw(1000));
         executor.submit(()->account.withdraw(2000));
         executor.submit(()->account.withdraw(3000));
        
        
    }
}