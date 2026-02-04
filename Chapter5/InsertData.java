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

public class InsertData 
{
       public static void main(String[] args)
       {
           insertData();
       }
       public static Connection getConnection()
       {
           try
           {
                String driver = "com.mysql.cj.jdbc.Driver";
                String databaseUrl = "jdbc:mysql://localhost:3306/collegedb";
                String username = "root";
                String password = "";
                Class.forName(driver);
                Connection con = DriverManager.getConnection(databaseUrl, username, password);
                System.out.println("Database Connected");
                return con;
           }
           catch(Exception e)
           {
               System.out.println("Some error: " +e );
           }
           return null;
       }
       public static void insertData()
       {
           try
           {
               Statement st = getConnection().createStatement();
               String query = "INSERT INTO students(id, name, email, city)VALUES"
                       + "(3, 'Aashish', 'aashish@gmail.com', 'Lalitpur'),"
                       + "(4, 'Mina', 'mina@gmail.com', 'Bhaktapur')";
               int result = st.executeUpdate(query);
               System.out.println(result + "row(s) inserted");
           }
           catch(Exception e)
           {
               System.out.println("Error: " +e);
           }
       }
}

