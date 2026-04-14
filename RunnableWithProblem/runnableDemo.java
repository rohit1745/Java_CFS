package RunnableWithProblem;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class runnableDemo {
    public static void main(String[] args)throws SecurityException {
        ExecutorService executorService=Executors.newFixedThreadPool(2);
        Runnable emailTask=()->
        {
            System.out.println(Thread.currentThread().getName());

        };
        executorService.submit(emailTask);
        
  
        executorService.shutdown();
    }
    
}
