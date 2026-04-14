package RunnableWithProblem;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class callbleReturnDemo 
{
    public static void main(String[] args)throws InterruptedException, ExecutionException  {
        ExecutorService executorService=Executors.newFixedThreadPool(2);
        Callable<Integer> email=()->{
            System.out.println("Email Send");
            Thread.sleep(2000);
            return 200;
            

        };
    
        Future<Integer> future=executorService.submit(email);
        System.out.println("doing the work........");
        Thread.sleep(1000);
        Integer res=future.get();
        System.out.println("result = "+res);
        executorService.shutdown();
    }
}