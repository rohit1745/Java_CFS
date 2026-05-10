import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudentInsertDB {
    public static void main(String[] args) {
        try {
            Connection con= DriverManager.getConnection(DBConfigStd.url,DBConfigStd.username,DBConfigStd.password);
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Student Roll_NO ");
            int roll_no= sc.nextInt();
            System.out.println("Enter Student Name");
            String name=sc.next();
            System.out.println("Enter Student Marks");
            Double marks=sc.nextDouble();
            System.out.println("Enter Student Adddress");
            String address=sc.next();


            String sql="Insert into Students value(?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,roll_no);
            pstmt.setString(2,name);
            pstmt.setDouble(3,marks);

            pstmt.setString(4,address);
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
