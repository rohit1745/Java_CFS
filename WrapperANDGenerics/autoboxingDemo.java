package WrapperANDGenerics;

public class autoboxingDemo {
    public static void main(String[] args) {
        int a=10;
        Integer b=a; //autoboxing Integer.valueOf(a)
        System.out.println(b);


        Boolean b1=new Boolean(true);
        Boolean b2=new Boolean("Rohit");
        Boolean b3=new Boolean("TRUE");  //it is not case sensitive
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

    }
    
}
