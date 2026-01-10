import java.awt.*;
import javax.swing.*;

class BorderLayoutDemo
{
    JFrame f;
    JButton bt1, bt2, bt3, bt4, bt5;

    BorderLayoutDemo()
    {
        f = new JFrame();
        f.setTitle("BorederLayout");
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout(10, 10));

        bt1 = new JButton("Button1");
        bt2 = new JButton("Button2");
        bt3 = new JButton("Button3");
        bt4 = new JButton("Button4");
        bt5 = new JButton("Button5");

        f.add(bt1, BorderLayout.NORTH);
        f.add(bt2, BorderLayout.SOUTH);
        f.add(bt3, BorderLayout.WEST);
        f.add(bt4, BorderLayout.EAST);
        f.add(bt5, BorderLayout.CENTER);

        f.setVisible(true);
    }
    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}