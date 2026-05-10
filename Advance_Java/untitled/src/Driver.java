import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {
    public static void main(String[] args) {


        try {

            //load
            Class.forName("com.mysql.cj.jdbc.Driver");

            //get connection
             Connection connection = DriverManager.getConnection(
                     "jdbc:mysql://localhost:3306/testdb",
                     "root",
                     "Rohit@1745@"
             );

             //create Statement

            Statement statement= connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from employee");

            while (resultSet.next())
            {
                System.out.println(resultSet.getInt("empid")+" "+resultSet.getString("empname"));
            }
                connection.close();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
