import java.awt.*;
import javax.swing.*;

class PanelDemo extends JFrame
{
    static JFrame f;
    static JButton b1, b2, b3, b4;
    static JLabel l;
    public static void main(String[] args) {
        f = new JFrame("Panel");
        l = new JLabel("Panel Label");
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");

        JPanel p = new JPanel();

        p.add(l);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);

        f.add(p);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}