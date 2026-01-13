import javax.swing.*;
import java.awt.event.*;

class AdapterDemo extends WindowAdapter {

    JFrame f1;

    AdapterDemo() {
        f1 = new JFrame("Window Event");
        f1.setSize(400, 400);
        f1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f1.addWindowListener(this);
        f1.setVisible(true);
    }

    public void windowOpened(WindowEvent e) {
        JOptionPane.showMessageDialog(f1, "Welcome");
    }

    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(f1, "Good Bye");
        System.exit(0);
    }

    public void windowIconified(WindowEvent e) {
        JOptionPane.showMessageDialog(f1, "See You Later");
    }

    public void windowDeiconified(WindowEvent e) {
        JOptionPane.showMessageDialog(f1, "Welcome Back");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AdapterDemo());
    }
}
