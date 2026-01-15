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

public class InsertTeacher 
{
    public static void main(String[] args)
    {
        insertData();
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
    public static void insertData()
    {
        String query = "INSERT INTO teachers(id, name, email, phone) VALUES (?, ?, ?, ?)";
        
        try(Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(query))
        {
            ps.setInt(1,1);
            ps.setString(2, "Aashish");
            ps.setString(3, "aashish@gmail.com");
            ps.setString(4, "9745289741");
            ps.executeUpdate();
            
            ps.setInt(1,2);
            ps.setString(2, "Ashok");
            ps.setString(3, "ashok@gmail.com");
            ps.setString(4, "9745289742");
            ps.executeUpdate();
            
            System.out.println("2 row(s) inserted");
        }
        catch(Exception e)
        {
            System.out.println("Error: "+ e);
        }
    }
}
