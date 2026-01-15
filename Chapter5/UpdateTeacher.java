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

public class UpdateTeacher 
{
    public static void main(String[] args)
    {
        updateTeacher();
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
            System.out.println("Some error: " +e);
        }
        return null;
    }
    public static void updateTeacher()
    {
        String query = "UPDATE teachers set phone = ? WHERE id = ?";
        try(Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(query);)
        {
            ps.setString(1, "9804253418");
            ps.setInt(2, 1);
            
            int result = ps.executeUpdate();
            System.out.println(result + " row(s) updated");
        }
        catch(Exception e)
        {
            System.out.println("Error" + e);
        }
    }
}
