package ThreadGroup;

public class TsetDemo {
    public static void main(String[] args) {
        ThreadGroup apiGroup=new ThreadGroup("API-Group");
        MyThread t1=new MyThread(apiGroup," API-group1" );
        MyThread t2=new MyThread(apiGroup," API-group2" );
        t1.start();
        t2.start();

        
    }
    
}
