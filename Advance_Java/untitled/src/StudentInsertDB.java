import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        try {
            Connection con= DriverManager.getConnection(DBConfig.url,DBConfig.username,DBConfig.password);
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Student Roll_NO ");
            int RollNo= sc.nextInt();
            System.out.println("Enter Student Name");
            String Name=sc.next();
            System.out.println("Enter Student Marks");
            int Marks=sc.nextInt();
            System.out.println("Enter Student Mobil_NO");
            int MobilNo=sc.nextInt();
            System.out.println("Enter Student Adddress");
            String Address=sc.next();


            String sql="Insert into employee value(?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,RollNo);
            pstmt.setString(2,Name);
            pstmt.setInt(3,Marks);
            pstmt.setInt(4,MobilNo);
            pstmt.setString(5,Address);
            int res=pstmt.executeUpdate();
            System.out.println("Result:"+res);
            con.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
