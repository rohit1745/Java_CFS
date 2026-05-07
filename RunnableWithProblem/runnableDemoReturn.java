package RunnableWithProblem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class runnableDemoReturn {
    public static void main(String[] args) {
        ExecutorService executerService = Executors.newFixedThreadPool(3);
        Runnable emailtask =()->
        {
            System.out.println("Sending email"+Thread.currentThread().getName());
        };
        executerService.submit(emailtask);
        executerService.shutdown();

    }
    
}
