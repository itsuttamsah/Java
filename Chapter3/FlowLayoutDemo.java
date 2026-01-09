import java.awt.*;
import javax.swing.*;

public class FlowLayoutDemo
{

    JFrame f1;
    JButton b1, b2, b3, b4, b5, b6, b7, b8;
    FlowLayoutDemo()
    {
        f1 = new JFrame("FlowLayout");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(400, 400);
        f1.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));

        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");
        b6 = new JButton("Button 6");
        b7 = new JButton("Button 7");
        b8 = new JButton("Button 8");

        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.add(b8);

        f1.setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
    
}