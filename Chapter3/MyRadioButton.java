import java.awt.*;
import javax.swing.*;

class MyRadioButton extends JFrame
{

    public MyRadioButton() {
        JLabel l = new JLabel("Select Your Gender:");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JButton bt1 = new JButton("Submit");
        JButton bt2 = new JButton("Cancel");
        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        add(l);
        add(male);
        add(female);
        add(bt1);
        add(bt2);

        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyRadioButton();
    }
    

}