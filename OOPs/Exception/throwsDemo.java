package OOPs.Exception;

import java.io.*;

public class throwsDemo {
   static void readFile() throws IOException
    {
        FileReader file= new FileReader("test.txt");
    }
    public static void main(String[] args) throws IOException {
        readFile();
    }
    
}
