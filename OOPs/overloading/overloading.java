package OOPs.overloading;

public class overloading {
   public  int add(int a ,int b)
{
   
    // System.out.println("a="+a +", b="+b);
    System.out.println("sum="+(a+b));
    return a+ b;
    
}
public int add (int a, int b, int c)
{
    System.out.println("sum="+(a+b+c));
    return a+b+c;
}
void print()
{
    System.out.println("Hii");
}
void print(String name)//overload constructor
{
    System.out.println("Hello");
}
    
}
class Demo
{
    public static void main(String args[])
    {
        overloading o=new overloading();
        o.add(10, 200);
        o.add(10, 20, 30);
        o.print();
        o.print("Rohit");

    }
}
