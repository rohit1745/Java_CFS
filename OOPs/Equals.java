package OOPs;

public class Equals {
    public static void main(String[] args) {
        main();
    }
     
    static void main()
    {
        int a=10;
        int b=20;
        int c=10;
        System.out.println(a==b); //false
        System.out.println(a==c); //true

        String a1="Rohit";
        String a2="java";
        String a3="java";
        System.out.println(a1.equals(a2)); // false
        System.out.println(a2.equals(a3)); // true
        System.out.println(a3==a2); //true

        String a4="Hello";
        String a5="Hello";
        System.out.println(a4.equals(a5)); // true
       

        

    }
    
}
