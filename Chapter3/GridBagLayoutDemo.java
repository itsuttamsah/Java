import java.awt.*;
import javax.swing.*;

class GridBagDemo extends JFrame
{
    GridBagDemo()
    {
        //Frame Setup
        setTitle("GridBagDemo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);


        //components:
        JButton bt1 = new JButton("Button1");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(bt1, gbc);

        JButton bt2 = new JButton("Button2");
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(bt2, gbc);

        JButton bt3 = new JButton("Button3");
        gbc.gridx = 2;
        gbc.gridy = 0;
        add(bt3, gbc);

        JButton bt4 = new JButton("Button4");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridheight = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        add(bt4, gbc);

        //reset constraint
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;

        JButton bt5 = new JButton("Button5");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(bt5, gbc);

        JButton bt6 = new JButton("Button6");
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(bt6, gbc);

        JButton bt7 = new JButton("Button7");
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(bt7, gbc);

        JButton bt8 = new JButton("Button8");
        gbc.gridx = 2;
        gbc.gridy = 3;
        add(bt8, gbc);

        setVisible(true);
    }
    public static void main(String[] args) {
        new GridBagDemo();
    }
}
