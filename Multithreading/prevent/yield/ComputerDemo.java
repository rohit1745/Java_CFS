package prevent.yield;

public class ComputerDemo extends Thread {
    public ComputerDemo(String name)

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
