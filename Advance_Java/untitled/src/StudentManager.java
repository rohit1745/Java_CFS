import java.sql.*;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        try {
            Connection con= DriverManager.getConnection(DBConfigStd.url,DBConfigStd.username,DBConfigStd.password);
            Scanner sc=new Scanner(System.in);

            while (true)
            {
                System.out.println("\n===============Student Managment System====================");
                System.out.println("1.Insert Student");
                System.out.println("2.Update Marks");
                System.out.println("3.View Marks");
                System.out.println("4.Delete Student");
                System.out.println("5.View all Student");
                System.out.println("6.Exit");
                System.out.println("enter Your Choice");
                int choice=sc.nextInt();

                switch (choice)
                {
                    case 1:  //Insert Student Data
                        System.out.println("Enter the Roll_No");
                        int roll_no=sc.nextInt();
                        System.out.println("Enter the name");
                        String name=sc.next();
                        System.out.println("Enter Marks");
                        double marks= sc.nextDouble();
                        System.out.println("Enter Address");
                        String address=sc.next();

                        PreparedStatement ps= con.prepareStatement("INSERT INTO Students values (?,?,?,?)");
                        ps.setInt(1,roll_no);
                        ps.setString(2,name);
                        ps.setDouble(3,marks);
                        ps.setString(4,address);

                        int rows=ps.executeUpdate();
                        System.out.println(rows+"Record Inserted Successful");
                        break;

                    case 2: //Updata Marks
                        System.out.println("Enter Student Roll_No");
                        int rollNo=sc.nextInt();
                        System.out.println("Enter New Marks");
                        double mark=sc.nextDouble();
                        PreparedStatement ps1=con.prepareStatement("update students set marks=? where roll_no=?");
                        ps1.setDouble(1,mark);
                        ps1.setInt(2,rollNo);
                        int um= ps1.executeUpdate();
                        if (um>0)
                        {
                            System.out.println("Marks Update successful");
                        }
                        else {
                            System.out.println("Student Not Found...........");
                        }

                        break;

                    case 3:    //View Marks
                        System.out.println("Enter Roll_NO");
                        int roll_No=sc.nextInt();
                        PreparedStatement ps2=con.prepareStatement("SELECT marks FROM students WHERE roll_no = ?");
                        ps2.setInt(1,roll_No);
                        ResultSet vm=ps2.executeQuery();
                        if (vm.next())
                        {
                            System.out.println("Student Marks:"+vm.getDouble("marks"));
                        }
                        else {
                            System.out.println("Student Not Found...........");
                        }

                        break;

                    case 4:// Delete Student

                        System.out.println("Enter Student Name to Delete");
                        String std_name=sc.next();
                        PreparedStatement ps3=con.prepareStatement("DELETE FROM students WHERE name = ?");
                        ps3.setString(1,std_name);
                        int ds=ps3.executeUpdate();
                        if(ds>0)
                        {
                            System.out.println("Delete Student Data Successful:"+ds);
                        }
                        else {
                            System.out.println("Student not found");
                        }

                        break;

                    case 5: //View all Students
//
                        PreparedStatement ps4 = con.prepareStatement("SELECT * FROM students");

                        ResultSet rs = ps4.executeQuery();

                        System.out.println("\nRoll_No\tName\tMarks\tAddress");
                        System.out.println("====================================");

                        while(rs.next())
                        {
                            System.out.println(
                                    rs.getInt("roll_no") + "\t" +
                                            rs.getString("name") + "\t" +
                                            rs.getDouble("marks") + "\t" +
                                            rs.getString("address")
                            );
                        }
                        break;


                    case 6://  Exit
                        System.out.println("exiting...........");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choicee!..... Please try again....");



                }


            }

        }
        catch (SQLException s)
        {
            System.out.println("Data Error:"+s.getMessage());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
