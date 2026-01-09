import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo1 extends JFrame
{

    public GridLayoutDemo1()
    {    
        setTitle("GridLayout");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2,5,5));

        JLabel userLabel = new JLabel("Username");
        JLabel passwordLable = new JLabel("Password");
        JTextField usertext = new JTextField();
        JTextField userPassword = new JTextField();
        JButton cancelBtn = new JButton("Cancel");
        JButton okBtn = new JButton ("OK");

        add(userLabel);
        add(usertext);
        add(passwordLable);
        add(userPassword);
        add(okBtn);
        add(cancelBtn);

        setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutDemo1();
    }
}