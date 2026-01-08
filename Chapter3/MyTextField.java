import java.awt.*;
import javax.swing.*;
class MyTextField extends JFrame
{
    public MyTextField()
    {
        JLabel l = new JLabel("Enter Your Name:");
        JTextField tf = new JTextField(20);

        add(l);
        add(tf);

        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyTextField();
    }
}