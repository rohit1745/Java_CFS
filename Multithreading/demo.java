class multithread extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Threads Running"+i);
        }
    }
    
}

public class demo
{
    public static void main(String[] args) {
        System.out.println("Hello");
        multithread m=new multithread();
        m.start();

        for(int i=1; i<=50; i++)
        {
            System.out.println("Main Thread"+Thread.currentThread().getName());
        }


    }
}