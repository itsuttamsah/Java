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

public class Table 
{
    public static void main(String[] args)
    {
        createTable();
    }
    public static Connection getConnectin()
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
            System.out.println("Some error: "+ e);
        }
        return null; 
    }
    public static void createTable()
    {
        try
        {
            Statement st = getConnectin().createStatement();
            String query = "CREATE TABLE teachers("
                    + "id INT PRIMARY KEY,"
                    + "name VARCHAR(50),"
                    + "email VARCHAR(50),"
                    + "phone VARCHAR(15)"
                    +")";
            int result = st.executeUpdate(query);
            System.out.println("Table Created");
        }
        catch(Exception e)
        {
            System.out.println("Some error: " + e);
        }
    }
}
