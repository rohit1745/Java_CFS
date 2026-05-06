package WrapperANDGenerics.Generics;

public class main {
    public static void main(String[] args) {

        Gift<Integer> intGift=new Gift<>();
        intGift.setValue(10);
        System.out.println(intGift.getValue());

        Gift<String> stringGift=new Gift<>();
        stringGift.setValue("Rohit");
        System.out.println(stringGift.getValue());

    }
    
}

   