/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter5;

/**
 *
 * @author uttam
 */
import java.sql.*;
import java.util.Scanner;

public class GetFromUser 
{
    public static void main(String[] args)
    {
        getFromUser();
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
            System.out.println("Database Connected Successfully!");
            return con;
        }
        catch(Exception e)
        {
            System.out.println("Some error: " + e);
        }
        return null;
    }
    public static void getFromUser()
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter id: ");
            int roll = sc.nextInt();
            
            Statement st = getConnection().createStatement();
            ResultSet result = st.executeQuery("SELECT* FROM students WHERE id = "+roll);
            while(result.next())
            {
                System.out.println(result.getInt("id"));
                System.out.println(result.getString("name"));
                System.out.println(result.getString("email"));
                System.out.println(result.getString("city"));
                
            }
        }
        catch(Exception e)
        {
            System.out.println("Some Error: " +e);
        }
    }
}
