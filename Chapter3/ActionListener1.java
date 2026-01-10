import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class ActionListener1 extends JFrame implements ActionListener
{

    public ActionListener1() 
    {
        //Settting Frame
        setTitle("ActionListener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(400, 400);

        JButton btn = new JButton("Click Me");

        btn.addActionListener(this);

        add(btn, BorderLayout.CENTER);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(this, "Button Clicked");
    }    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ActionListener1());
    }
}