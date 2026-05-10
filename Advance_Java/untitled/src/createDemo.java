import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class createDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "Rohit@1745@"


            );

            Statement stmt=con.createStatement();
//            String sql="Insert into employee values (5,'siddhu')";   //Insert Query
          //  String sql="Update employee set empname ='Ram' WHERE empid=3";  //Update Query
            String sql="DELETE FROM employee WHERE empid=5";


            int res = stmt.executeUpdate(sql);

//            System.out.println("Data successfull update:"+res);
 //           System.out.println("Data Update successful :"+res);
            System.out.println("Delete EmpID Successful:"+res);
            con.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
