package prevent.yield;

public class Computer extends Thread {
    public Computer(String name)

    {
        super(name);
    }
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println(getName()+"Using Computer"+i);
            Thread.yield();
        }
    }
}
