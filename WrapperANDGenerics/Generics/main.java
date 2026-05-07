package WrapperANDGenerics.Generics;


class pair<K,V>
{
    K key;
    public pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    V value;
    void display()
    {
        System.out.println("key--->"+key +" value--->"+ value);
    }

    


}

public class main {
    public static void main(String[] args) {

        Gift<Integer> intGift=new Gift<>();
        intGift.setValue(10);
        System.out.println(intGift.getValue());

        Gift<String> stringGift=new Gift<>();
        stringGift.setValue("Rohit");
        System.out.println(stringGift.getValue());

        pair<Integer,String> p1=new pair(1, "Ram");
        pair<Integer,String> p2=new pair(2, "Sham");
        p1.display();
        p2.display();



    }
    
}

   