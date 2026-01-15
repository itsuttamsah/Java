package Chapter5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author uttam
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteData 
{
    public static void main(String[] args)
    {
        deleteData();
    }
    public static Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/collegedb",
                    "root",
                    ""
            );
            System.out.println("Database Connected Successfully");
            return con;
        }
        catch(Exception e)
        {
            System.out.println("Some error" + e);
        }
        return null;
    }
    public static void deleteData()
    {
        try
        {
            Statement st = getConnection().createStatement();
            String query = "DELETE FROM students WHERE id = 2";
            int result = st.executeUpdate(query);
            System.out.println(result + "row(s) Deleted");
        }
        catch(Exception e)
        {
            System.out.println("Some error: " + e);
        }
    }
}
