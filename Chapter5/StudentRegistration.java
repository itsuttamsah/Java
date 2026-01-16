import javax.swing.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;

public class StudentRegistration extends JFrame 
{
    JTextField nameTxt, addressTxt, phoneTxt;
    JRadioButton maleBtn, femaleBtn;
    ButtonGroup gender;
    JComboBox courseBox;
    JButton registerBtn;
    
    StudentRegistration()
    {
        //setting frame
        setTitle("Student Registration");
        setSize(500, 450);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //components:
        JLabel nameLabel = new JLabel("Student Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        nameTxt = new JTextField();
        nameTxt.setBounds(150, 50, 200, 30);
        
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(30, 100, 100, 30);
        addressTxt = new JTextField();
        addressTxt.setBounds(150, 100, 200, 30);
        
        JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(30, 150, 100, 30);
        phoneTxt = new JTextField();
        phoneTxt.setBounds(150, 150, 200, 30);
        
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(30, 200, 100, 30);
        maleBtn = new JRadioButton("Male");
        maleBtn.setBounds(90, 250, 100, 30);
        femaleBtn = new JRadioButton("Female");
        femaleBtn.setBounds(150, 250, 100, 30);
        gender = new ButtonGroup();
        gender.add(maleBtn);
        gender.add(femaleBtn);
        
        JLabel courseLabel = new JLabel("Course:");
        courseLabel.setBounds(30, 300, 100, 30);
        String courseList[] = {"BEIT", "BCA", "BBA", "BBS", "BECivil"};
        courseBox = new JComboBox<>(courseList);
        courseBox.setBounds(150, 300, 200, 30);
        
        registerBtn = new JButton("Register");
        registerBtn.setBounds(200, 350, 200, 30);
        
        add(nameLabel);
        add(nameTxt);
        add(addressLabel);
        add(addressTxt);
        add(phoneLabel);
        add(phoneTxt);
        add(courseLabel);
        add(courseBox);
        add(genderLabel);
        add(maleBtn);
        add(femaleBtn);
        add(registerBtn);

        setVisible(true);
        
//        registerBtn.addActionListener(this);
        
    }
    public static void main(String[] args)
    {
        new StudentRegistration();
    }
}