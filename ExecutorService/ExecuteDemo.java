package ExecutorService;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo   {
    public static void main(String[] args) {
        ExecutorService executer = Executors.newFixedThreadPool(3);
        
        Runnable task1=() ->
        {
            String name=Thread.currentThread().getName();
            System.out.println("Task exection by "+name);


        };
         Runnable task2=() ->
        {
            String name=Thread.currentThread().getName();
            System.out.println("Task exection by "+name);


        };
         Runnable task3=() ->
        {
            String name=Thread.currentThread().getName();
            System.out.println("Task exection by "+name);


        };
        // executer.submit(task1);
        // executer.submit(task2);
        // executer.submit(task3);
        for(int i=0;i<8;i++) //OR
        {
            executer.submit(task3);
        }
        executer.shutdown();
    
        
    }
    
}
