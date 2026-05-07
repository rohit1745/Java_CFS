package prevent.join;

public class joinDemo {
    public static void main(String[] args) throws InterruptedException{
         WashingMachine wash=new WashingMachine();
         wash.start();
         wash.join();
         System.out.println("Now Drying clothes.......... ");
    }
   
    
}
