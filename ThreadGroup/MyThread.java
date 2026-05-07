package ThreadGroup;

public class MyThread extends Thread {
    MyThread(ThreadGroup groupe,String name)
    {
        super(groupe,name);
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+Thread.currentThread().getThreadGroup().getName());
    }

    
}
