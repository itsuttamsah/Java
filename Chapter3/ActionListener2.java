import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class OkCancelBtn extends JFrame implements ActionListener
{

    JButton okBtn, cnlBtn;

    public OkCancelBtn()
    {
        //frame setup
        setTitle("OK and Cancel");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //components
        okBtn = new JButton("OK");
        cnlBtn = new JButton("Cancel");

        okBtn.addActionListener(this);
        cnlBtn.addActionListener(this);

        add(okBtn, BorderLayout.WEST);
        add(cnlBtn, BorderLayout.EAST);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == okBtn)
        {
            JOptionPane.showMessageDialog(null, "Ok Button Clicked");
        }
        else if(e.getSource() == cnlBtn)
        {
            JOptionPane.showMessageDialog(this, "Cancel Button Clicked", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args) {
        new OkCancelBtn();
    }
}