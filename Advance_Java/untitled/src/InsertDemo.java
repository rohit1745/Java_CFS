import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDemo {
    public static void main(String[] args) {
        try {
            Connection con= DriverManager.getConnection(DBConfig.url,DBConfig.username,DBConfig.password);
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter empId ");
            int empid= sc.nextInt();
            System.out.println("Enter Emp name");
            String empname=sc.next();
            System.out.println("Enter Employee Address");
            String empaddress=sc.next();

            String sql="Insert into employee value(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,empid);
            pstmt.setString(2,empname);
            pstmt.setString(3,empaddress);
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
