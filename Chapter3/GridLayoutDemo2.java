import java.awt.*;
import javax.swing.*;

class GridLayoutDemo1 extends JFrame
{

    public GridLayoutDemo1()
    {    
        setTitle("GridLayout");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2,5,5));

        JLabel userLabel = new JLabel("Username");
        JLabel passwordLable = new JLabel("Password");
        JTextField t1 = new JTextField();
        JTextField p1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField p2 = new JTextField();
        JButton cancelBtn = new JButton("Cancel");
        JButton okBtn = new JButton ("OK");

        add(userLabel);
        add(passwordLable);
        add(t1);
        add(p1);
        add(t2);
        add(p2);
        add(okBtn);
        add(cancelBtn);

        setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutDemo1();
    }
}