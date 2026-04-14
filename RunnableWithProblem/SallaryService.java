package RunnableWithProblem;

import java.text.Collator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SallaryService {
    public static void main(String[] args)throws InterruptedException, ExecutionException  {
        
        ExecutorService executorService=Executors.newFixedThreadPool(2);
        Callable<Double> salaryTask=()->
        {
            System.out.println("Claculate by Salary........... "+Thread.currentThread().getName());
            Thread.sleep(1000);
            return 100000.0;
        };

        Future<Double> submit = executorService.submit(salaryTask);
        System.out.println("HR going to some Work..............");
        Double sal=submit.get();
        executorService.shutdown();
        System.out.println("Final salary:"+sal);

    }
    
}
