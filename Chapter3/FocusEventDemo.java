import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

class FocusDemoEvent extends JFrame implements FocusListener
{
    JTextField t1, t2, t3;
    JLabel l1, l2, l3;
    JButton btn1;

    FocusDemoEvent()
    {
        setTitle("Focus Event Listener");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 15, 15));

        l1 = new JLabel("First Value:");
        l2 = new JLabel("Second Value:");
        l3 = new JLabel("Third Value:");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t3.setEditable(false);

        btn1 = new JButton("Multiply");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);

        add(btn1);

        t1.addFocusListener(this);
        t2.addFocusListener(this);
        btn1.addFocusListener(this);

        setVisible(true);
    }
    public void focusGained(FocusEvent e)
    {
        int a, b, c;
        a = Integer.parseInt(t1.getText());
        b = Integer.parseInt(t2.getText());

        if(e.getSource() == btn1)
        {
            c = a * b;
            t3.setText(String.valueOf(c));
        }
    } 
    public void focusLost(FocusEvent e)
    {
        if(e.getSource() == t1 && t1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Enter number to continue: ");
            t1.requestFocus();
        }
        if(e.getSource() == t2 && t2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Enter number to continue: ");
            t2.requestFocus();
        }
    }   
    public static void main(String[] args) {
        new FocusDemoEvent();
    }
}