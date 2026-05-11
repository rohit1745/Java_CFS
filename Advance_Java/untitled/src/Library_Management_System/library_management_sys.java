package Library_Management_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class library_management_sys {
    public static void main(String[] args) {
        try
        {
            Connection con= DriverManager.getConnection(DBConfigLib.url, DBConfigLib.username, DBConfigLib.password);
            Scanner sc=new Scanner(System.in);

            while (true)
            {
                System.out.println("1.Add Book");
                System.out.println("1.View Books");
                System.out.println("1.Add Book");
                System.out.println("1.Add Book");
                System.out.println("1.Add Book");
                System.out.println("1.Add Book");
                System.out.println("1.Add Book");


            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        catch (SQLException s)
        {
            System.out.println("Data Error:"+s.getMessage());
        }
    }
}
