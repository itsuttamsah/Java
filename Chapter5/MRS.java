package Chapter5;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class MRS extends JFrame implements ActionListener
{
    JLabel lblID, lblName, lblGenre, lblLng, lblLth;
    JTextField txtID, txtName, txtGenre, txtLng, txtLth;
    JButton btnOk;
    MRS()
    {
        setTitle("Movie Rental Portfolio");
        setSize(400, 300);
        setLayout(new GridLayout(6,2,10,10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblID = new JLabel("Move ID:");
        lblName = new JLabel("Movie Name:");
        lblGenre = new JLabel("Genre:");
        lblLng = new JLabel(";Language:");
        lblLth = new JLabel("Length(min):");
        
        txtID = new JTextField();
        txtName = new JTextField();
        txtGenre = new JTextField();
        txtLng = new JTextField();
        txtLth = new JTextField();
        
        btnOk = new JButton("OK");
        btnOk.addActionListener(this);
        
        add(lblID);
        add(txtID);
        add(lblName);
        add(txtName);
        add(lblGenre);
        add(txtGenre);
        add(lblLng);
        add(txtLng);
        add(lblLng);
        add(txtLng);
        add(lblLth);
        add(txtLth);
        add(new JLabel());
        add(btnOk);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            int id = Integer.parseInt(txtID.getText());
            String name = txtName.getText();
            String genre = txtGenre.getText();
            String language = txtLng.getText();
            int length = Integer.parseInt(txtLth.getText());
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/MRS",
                    "root",
                    ""
            );
            
            String sql = "INSERT INTO movie VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, genre);
            ps.setString(4, language);
            ps.setInt(5, length);
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Movie Record Inserted Successfully");
            
            con.close();
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    public static void main(String[] args)
    {
        new MRS();
    }
}
