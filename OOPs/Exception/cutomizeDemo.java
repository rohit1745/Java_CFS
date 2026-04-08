package OOPs.Exception;

class NSalException extends Exception {
    public NSalException(String message) {
        super(message);
    }
}

public class cutomizeDemo {
    public static void main(String[] args) {
        customize e=new customize();
        try
        {
            e.info();
        }
        catch(NSalException ex)
        {
            System.out.println("Company sod re.........");
        }
    }
    
}
