import java.awt.*;
import javax.swing.*;

class MyButtonFrame extends JFrame {

    MyButtonFrame() {
        JButton bt1 = new JButton("Yes");
        JButton bt2 = new JButton("NO");

        setLayout(new FlowLayout());
        
        add(bt1);
        add(bt2);
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyButtonFrame();
    }
}
