/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter5;

/**
 *
 * @author uttam
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteTeacher 
{
    public static void main(String[] arg)
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
            System.out.println("Database Connected!");
            return con;
        }
        catch(Exception e)
        {
            System.out.println("Some error: " + e);
        }
        return null;
    }
    public static void deleteData()
    {
        String query = "DELETE from teachers WHERE id = ?";
        try(Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(query))
        {
            ps.setInt(1,1);
            int result = ps.executeUpdate();
            System.out.println(result + "row(s) deleted");
        }
        catch(Exception e)
        {
            System.out.println("Some error: " + e);
        }
    }
}
