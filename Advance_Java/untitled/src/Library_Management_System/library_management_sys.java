package Library_Management_System;

import java.awt.*;
import java.sql.*;
import java.util.Scanner;

public class library_management_sys {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(DBConfigLib.url, DBConfigLib.username, DBConfigLib.password);
            Scanner sc = new Scanner(System.in);


            while (true) {
                System.out.println("1.View Books");
                System.out.println("2.Add Book");
                System.out.println("3.Remove Book");

                System.out.println("4.Exit");
                System.out.println("Enter Your Choice");
               int choice=sc.nextInt();

                switch (choice) {
                    case 1:

                        PreparedStatement ps1 = con.prepareStatement("SELECT * FROM book");

                        ResultSet rs = ps1.executeQuery();

                        System.out.println("\nBook_ID\tBook_Name\tBook_Author_Name\tAvailable");
                        System.out.println("============================================================");

                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt("id") + "\t" +
                                            rs.getString("book_name") + "\t" +
                                            rs.getString("book_author_name") + "\t" +
                                            rs.getInt("available")
                            );
                        }
                        break;
                    case 2:
                        System.out.println("Book ID");
                        int book_id=sc.nextInt();
                        System.out.println("Book Name");
                        String book_name=sc.next();
                        System.out.println("Book Author Name");
                        String author_name=sc.next();
                        System.out.println("Number Of Book ");
                        int contity=sc.nextInt();

                        PreparedStatement ps=con.prepareStatement("INSERT INTO book values (?,?,?,?)");
                        ps.setInt(1,book_id);
                        ps.setString(2,book_name);
                        ps.setString(3,author_name);
                        ps.setInt(4,contity);

                        int rows=ps.executeUpdate();
                        System.out.println("Data Insert Successful:"+rows);
                        break;


                    case 3:
                        System.out.println("Enter Book Name");
                        String name=sc.next();

                        PreparedStatement ps2=con.prepareStatement("DELETE FROM book WHERE book_name = ?");
                        ps2.setString(1,name);
                        int db=ps2.executeUpdate();
                        if(db>0)
                        {
                            System.out.println("Data Delete Successful:"+db);
                        }
                        else {
                            System.out.println("Invalid Book name");
                        }
                    case 4:
                        System.out.println("Exiting.............");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice!..............Please select correct choice");
                }



            }



        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
