import javax.xml.transform.Source;
import java.sql.*;

public class MetaDataDemo {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "Rohit@1745@"


            );

            DatabaseMetaData metaDB = con.getMetaData();
            System.out.println("part-1======database info==========");
            System.out.println("Driver Name:  "+metaDB.getDriverName());
            System.out.println("Driver Version:  "+metaDB.getDriverVersion());
            System.out.println("Logged in user:  "+metaDB.getUserName());
            System.out.println("Database url:  "+metaDB.getURL());
            System.out.println("Database url:  "+metaDB.getURL());
            System.out.println("===========================================================");


            //part-2===========ResultSetMetaData (Info about the Software================
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("Select * From employee");
            ResultSetMetaData rsmd= rs.getMetaData();
            System.out.println("=======table resultSet info============");

            //1.How many column present in table
            int totalColumn = rsmd.getColumnCount();
            System.out.println("Total Coloumn:"+totalColumn);

            //2.what are the name and types in column

            System.out.println("============================================");
            System.out.println("Column index   | column type   | Column name");
            System.out.println("=================================================");

            //loop from 1 to total column
            for(int i=1;i<=totalColumn;i++)
            {
                System.out.println("   "+ i +"   |  " + rsmd.getColumnName(i)+"   |  "+ rsmd.getColumnType(i)+  "   |  "  + rsmd.getColumnDisplaySize(i));

            }
            System.out.println("=======================================");
            con.close();




        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
