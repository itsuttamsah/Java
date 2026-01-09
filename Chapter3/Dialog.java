import java.awt.*;
import javax.swing.*;

class Dialog extends JFrame
{

    public static void main(String[] args) {
        
        //setting fram
        JFrame frame = new JFrame("Dialog Box");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        //componets
        JOptionPane.showMessageDialog(frame, "Message of the dialog box goes here.", "Error", JOptionPane.ERROR_MESSAGE);
        frame.setVisible(true);
    }
    
}