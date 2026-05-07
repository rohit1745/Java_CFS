package RunnableWithProblem;

import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SallaryService {
    public static void main(String[] args)throws InterruptedException, ExecutionException  {
        
        ExecutorService executorService=Executors.newFixedThreadPool(2);
        Callable<String> salaryTask=()->
        {
            System.out.println("Claculate by Salary........... "+Thread.currentThread().getName());
            Thread.sleep(1000);
            return "1000000.0";
        };
        Callable<String> email=()->
        {
            System.out.println("Sending the Email........... "+Thread.currentThread().getName());
            Thread.sleep(1000);
            return "done";
        };

        // Future<String> submit = executorService.submit(salaryTask);
        // System.out.println("HR going to some Work..............");
        // Double sal=submit.get();
        // executorService.shutdown();
        // System.out.println("Final salary:"+sal);
        List<Callable<String>> task= Arrays.asList(salaryTask,email);
        List<Future<String>> results=executorService.invokeAll(task);
        System.out.println("HR going to some Work..............");


        System.out.println("............Final Result.................");
        for(Future<String> future:results)
        {
            System.out.println(future.get());
        }
        
       
    }
    
}
