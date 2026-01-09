import java.awt.*;
import javax.swing.*;

class GridLayoutDemo1 extends JFrame {

    GridLayoutDemo1() {
        setTitle("GridLayout");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));

        JLabel userLabel = new JLabel("Username");
        JLabel passwordLabel = new JLabel("Password");
        JLabel label3 = new JLabel("Field 3");
        JLabel label4 = new JLabel("Field 4");

        JTextField t1 = new JTextField();
        JPasswordField p1 = new JPasswordField();
        JTextField t2 = new JTextField();
        JTextField p2 = new JTextField();

        JButton okBtn = new JButton("OK");
        JButton cancelBtn = new JButton("Cancel");

        add(userLabel);  add(t1);
        add(passwordLabel); add(p1);
        add(label3); add(t2);
        add(label4); add(p2);
        add(okBtn); add(cancelBtn);

        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutDemo1();
    }
}
