package OOPs.inheritance;

public class test {
    public static void main(String args[])
    {
        parentProperty p=new parentProperty();
        p.BankBalance();
        p.cars();
        p.gold();
        child c=new child(); //Single Inheritance object
        c.BankBalance();  //from parent class
        c.cars(); //from parent class
        c.Diamond();  //from own class 
        daughter d=new daughter(); // this is a Multiple Inheritance object
        d.gold();  //from parent class
        d.Diamond();  // from child class

    }
}
