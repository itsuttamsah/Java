import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseEvent1 extends JFrame implements MouseListener
{
    JFrame f;
    JLabel l1, l2, l3;
    MouseEvent1()
    {
        f = new JFrame("MouseEvent");
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(3, 1, 5, 5));

        l1 = new JLabel("No event 1:");
        l2 = new JLabel("No event 2:");
        l3 = new JLabel("No event 3:");

        p.add(l1);
        p.add(l2);
        p.add(l3);
        f.add(p);

        f.addMouseListener(this);
        f.setVisible(true);
    }
    public void mouseReleased(MouseEvent e)
    {
        l1.setText("Mouse Released at point." + e.getX() + "," + e.getY());
    }
    public void mousePressed(MouseEvent e)
    {
        l1.setText("Mouse Presed at point." + e.getX() + "," + e.getY());
    }
    public void mouseExited(MouseEvent e)
    {
        l2.setText("Mouse Exited at point." + e.getX() + "," + e.getY());
    }
    public void mouseEntered(MouseEvent e)
    {
        l2.setText("Mouse Entered at point." + e.getX() + "," + e.getY());
    }
    public void mouseClicked(MouseEvent e)
    {
        l3.setText("Mouse Clciked at point." + e.getX() + "," + e.getY() + " " +
        e.getClickCount());
    }
    public static void main(String[] args) {
        new MouseEvent1();
    }
}