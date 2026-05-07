class AccessModifiers 

    //private access modifier

{
    private int pin=123;
    private void ShowPin()
    {
        System.out.println("Privata Access Modifier Pin="+pin);
    }

    void verify()
    {
        ShowPin();
    }
    
}



//Default access modifier

class DefaultAccessModifier
{
        int num=10;
    void display()
    {
        System.out.println("Default access modifier Number="+num);
    }
}



//Protected access modifier
class ProtectedAccessModifier{
    protected String name="John";
    protected void displayName()
    {
        System.out.println("Protected Access Modifier Name="+name);
    }
}

//Public Access Modifier
class PublicAccessModifier{
    public String  Name="Monalisa";
    public void displayname()
    {
        System.out.println("Public Access Modifier Student Name="+ Name);
    }
}


public class TestDemo{
    public static void main(String[] args) {
        AccessModifiers obj=new AccessModifiers();//Private Access Modifier 
        obj.verify();
        DefaultAccessModifier obj2=new DefaultAccessModifier();//Default Access Modifier
        obj2.display();
        ProtectedAccessModifier obj3=new ProtectedAccessModifier(); //Protected Access Modifier
        obj3.displayName();
        PublicAccessModifier obj4=new PublicAccessModifier();
        obj4.displayname();
    }

}