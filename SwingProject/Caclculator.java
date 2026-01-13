import java.awt.event.*;
import javax.swing.*;

class SimpleCalculator extends JFrame implements ActionListener
{
    JTextField num1, num2;
    JButton addBtn, subBtn, mulBtn, divBtn;
    JLabel resultLabel;

    SimpleCalculator()
    {
        setTitle("Simple Calculator");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel num1Label = new JLabel("Number1: ");
        num1Label.setBounds(50, 50, 100, 30);
        num1 = new JTextField();
        num1.setBounds(150, 50, 150, 30);

        JLabel num2Label = new JLabel("Number2: ");
        num2Label.setBounds(50, 100, 100, 30);
        num2 = new JTextField();
        num2.setBounds(150, 100, 150, 30);

        addBtn = new JButton("+");
        addBtn.setBounds(50, 150, 50, 40);
        subBtn = new JButton("-");
        subBtn.setBounds(110, 150, 50, 40);
        mulBtn = new JButton("*");
        mulBtn.setBounds(170, 150, 50, 40);
        divBtn = new JButton("/");
        divBtn.setBounds(230, 150, 50, 40);

        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);

        resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(50, 200, 300, 30);

        add(num1Label);
        add(num1);
        add(num2Label);
        add(num2);
        add(addBtn);
        add(subBtn);
        add(mulBtn);
        add(divBtn);
        add(resultLabel);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());
            double result = 0;

            if(e.getSource() == addBtn)
            {
                result = n1 +n2;
            }
            if(e.getSource() == subBtn)
            {
                result = n1 - n2;
            }
            if(e.getSource() == mulBtn)
            {
                result = n1 * n2;
            }
            if(e.getSource() == divBtn)
            {
                result = n1 / n2;
            }
            resultLabel.setText("Result: " +result);
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers");
        }
        catch(ArithmeticException ex)
        {
            JOptionPane.showMessageDialog(this, "Error:" + ex.getMessage());
        }
    }
    public static void main(String[] args) {
        new SimpleCalculator();
    }
}