import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class KeyEvent1 extends JFrame implements KeyListener
{
    JFrame f1;
    JLabel l1;
    JTextArea t1;
    KeyEvent1()
    {
        f1 = new JFrame("Key Event and Key Listener");
        f1.setSize(400, 400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());

        l1 = new JLabel("Your Feedbacks:");
        t1 = new JTextArea();

        f1.add(l1);
        f1.add(t1);

        f1.setVisible(true);
        t1.addKeyListener(this);
    }
    public void keyPressed(KeyEvent e)
    {
        l1.setText("Key Pressed");
    }
    public void keyReleased(KeyEvent e)
    {
        l1.setText("Key Released");
    }
    public void keyTyped(KeyEvent e)
    {
        l1.setText("Key Typed");
    }
    public static void main(String[] args) {
        new KeyEvent1();
    }
}