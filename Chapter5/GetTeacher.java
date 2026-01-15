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
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetTeacher 
{
    public static void main(String[] args)
    {
        getTeacher();
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

    public static void getTeacher()
    {
        String query = "SELECT * FROM teachers WHERE id = ?"; 
        try (Connection con = getConnection()) 
        {
            if (con == null) return; 

            try (PreparedStatement ps = con.prepareStatement(query)) 
            {
                ps.setInt(1, 2);

                try (ResultSet result = ps.executeQuery()) 
                {
                    while(result.next())
                    {
                        System.out.println("ID: " + result.getInt("id"));
                        System.out.println("Name: " + result.getString("name"));
                        System.out.println("Email: " + result.getString("email"));
                        System.out.println("Phone: " + result.getString("phone"));
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e);
        }
    }
}

