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

public class UpdateData 
{
    public static void main(String[] args)
    {
        updateData();
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
            System.out.println("Database Connected Successfully.");
            return con;
        }
        catch(Exception e)
        {
            System.out.println("Some erroe: " +e);
        }
        return null;
    }
    public static void updateData()
    {
        try
        {
            Statement st = getConnection().createStatement();
            String query = "UPDATE students SET name = 'Meena' WHERE id = 4";
            int result = st.executeUpdate(query);
            System.out.println(result + "row(s) updated successfully.");
        }
        catch(Exception e)
        {
            System.out.println("Some error " + e);
        }
    }
}
