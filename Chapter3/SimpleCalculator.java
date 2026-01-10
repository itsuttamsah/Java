import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener
{
    JButton addBtn, subBtn, mulBtn, divBtn;
    JTextField num1Text, num2Text, result;

    SimpleCalculator() 
    {
        //frame setting
        setTitle("Simple Calculator");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5,5);

        //componets:
        result = new JTextField();
        result.setEditable(false);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(result, gbc);

        JLabel num1Label = new JLabel("Enter 1st Number:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(num1Label, gbc);

        JLabel num2Label = new JLabel("Enter 2nd Number:");
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(num2Label, gbc);

        num1Text = new JTextField();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        gbc.fill =GridBagConstraints.HORIZONTAL;
        add(num1Text, gbc);

        num2Text = new JTextField();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        gbc.fill =GridBagConstraints.HORIZONTAL;
        add(num2Text, gbc);

        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;

        addBtn = new JButton("Add");
        gbc.gridx = 0;
        gbc.gridy = 3;
        addBtn.addActionListener(this);
        add(addBtn, gbc);

        subBtn = new JButton("Subtract");
        gbc.gridx = 1;
        gbc.gridy = 3;
        subBtn.addActionListener(this);
        add(subBtn, gbc);

        mulBtn = new JButton("Multiply");
        gbc.gridx = 2;
        gbc.gridy = 3;
        mulBtn.addActionListener(this);
        add(mulBtn, gbc);

        divBtn = new JButton("Divide");
        gbc.gridx = 3;
        gbc.gridy = 3;
        divBtn.addActionListener(this);
        add(divBtn, gbc);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        int a, b, c;
        a = Integer.parseInt(num1Text.getText());
        b = Integer.parseInt(num2Text.getText());

        if(e.getSource() == addBtn)
        {
            c = a + b;
        }
        else if(e.getSource() == subBtn)
        {
            c = a - b;
        }
        else if(e.getSource() == mulBtn)
        {
            c = a * b;
        }
        else if(e.getSource() == divBtn)
        {
            c = a / b;
        }
        else
        {
            c = 0;
        }
        result.setText(String.valueOf(c));
    }
    public static void main(String[] args) {
        new SimpleCalculator();
    }
}