import java.awt.*;
import javax.swing.*;

class MyComboBox extends JFrame
{
    String faculty[] = {"BBA", "BCA", "BEIT", "BECivil"};
    public MyComboBox()
    {
        JLabel l = new JLabel("Select your program:");
        JComboBox cb = new JComboBox<>(faculty);
        JButton bt1 = new JButton("Submit");
        JButton bt2 = new JButton("Cancel");

        add(l);
        add(cb);
        add(bt1);
        add(bt2);
        cb.setSelectedItem("BEIT");

        setLayout(new FlowLayout());
        setSize(400,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyComboBox();
    }
}