import java.awt.event.*;
import javax.swing.*;

class loginForm extends JFrame implements ActionListener
{
    JTextField userText;
    JPasswordField passText;
    JButton loginButton;
    int attempt = 0;

    loginForm()
    {
        //setting frame
        setTitle("Login Form");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 30);
        userText = new JTextField();
        userText.setBounds(150, 50, 150, 30);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 150, 30);
        passText = new JPasswordField();
        passText.setBounds(150, 100, 150, 30);

        loginButton = new JButton("Login)");
        loginButton.setBounds(150, 150, 100, 30);

        loginButton.addActionListener(this);

        add(userLabel);
        add(userText);
        add(passLabel);
        add(passText);
        add(loginButton);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String username = userText.getText();
        String passsword = String.valueOf(passText.getPassword());

        if(username.equals("Uttu") && passsword.equals("1234@"))
        {
            JOptionPane.showMessageDialog(this, "Login Successful!");
        }
        else
        {
            attempt++;
            if(attempt>=2)
            {
                JOptionPane.showMessageDialog(this, "Try Later");
                loginButton.setEnabled(false);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Invalid Username and Password");
            }
        }
    }
    public static void main(String[] args) {
        new loginForm();
    }
}
