import java.awt.event.*;
import javax.swing.*;

class Registration extends JFrame implements ActionListener
{
    JTextField nameText, ageText;
    JComboBox<String> gradeBox;
    JRadioButton maleBtn, femaleBtn;
    JCheckBox hb1, hb2, hb3;
    JButton addStudentBtn, clearBtn;
    JTextArea displArea;
    ButtonGroup genderBtn;

    Registration()
    {
        setTitle("Registration");
        setSize(500, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel nameLabel = new JLabel("Full Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        nameText = new JTextField();
        nameText.setBounds(150, 50, 200, 30);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(50, 100, 100, 30);
        ageText = new JTextField();
        ageText.setBounds(150, 100, 100, 30);

        JLabel gradLabel = new JLabel("Course:");
        gradLabel.setBounds(50, 150, 100, 30);
        String gradeList[] = {"BCA", "BBA", "BEIT", "BECivil", "MIT"};
        gradeBox = new JComboBox<>(gradeList);
        gradeBox.setBounds(150, 150, 150, 30);
        gradeBox.setSelectedIndex(2);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 200, 100, 30);
        maleBtn = new JRadioButton("Male");
        maleBtn.setBounds(150, 200, 75, 30);
        femaleBtn = new JRadioButton("Female");
        femaleBtn.setBounds(230, 200, 80, 30);
        genderBtn = new ButtonGroup();
        genderBtn.add(maleBtn);
        genderBtn.add(femaleBtn);

        JLabel hobblabel = new JLabel("Hobbies:");
        hobblabel.setBounds(50, 250, 100, 30);
        hb1 = new JCheckBox("Movies");
        hb1.setBounds(150, 250, 80, 30);
        hb2 = new JCheckBox("Cricket");
        hb2.setBounds(230, 250, 80, 30);
        hb3 = new JCheckBox("Books");
        hb3.setBounds(310, 250, 80, 30);

        addStudentBtn = new JButton("ADD");
        addStudentBtn.setBounds(150, 300, 100, 30);
        clearBtn = new JButton("CLEAR");
        clearBtn.setBounds(270, 300, 100, 30);

        displArea = new JTextArea();
        displArea.setBounds(50, 350, 400, 100);

        add(nameLabel); add(nameText);
        add(ageLabel); add(ageText);
        add(gradLabel); add(gradeBox);
        add(genderLabel); add(maleBtn); add(femaleBtn);
        add(hobblabel); add(hb1); add(hb2); add(hb3);
        add(addStudentBtn); add(clearBtn);
        add(displArea);

        addStudentBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == addStudentBtn)
        {
            String name = nameText.getText();
            String age = ageText.getText();
            String grade = (String) gradeBox.getSelectedItem();

            String gender = "";
            if(maleBtn.isSelected()) gender = "Male";
            else if(femaleBtn.isSelected()) gender = "Female";

            String hobbies = "";
            if(hb1.isSelected()) hobbies += "Movies ";
            if(hb2.isSelected()) hobbies += "Cricket ";
            if(hb3.isSelected()) hobbies += "Books ";

            if(name.isEmpty() || age.isEmpty() || grade.isEmpty() || gender.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Please fill all required fields!");
                return;
            }

            displArea.append("Name: " + name + ", Age: " + age + ", Grade: " + grade +
                             ", Gender: " + gender + ", Hobbies: " + hobbies + "\n");

            // Clear fields after adding
            nameText.setText(""); ageText.setText("");
            gradeBox.setSelectedIndex(0);
            maleBtn.setSelected(false); femaleBtn.setSelected(false);
            hb1.setSelected(false); hb2.setSelected(false); hb3.setSelected(false);
        }
        else if(e.getSource() == clearBtn)
        {
            nameText.setText(""); ageText.setText("");
            gradeBox.setSelectedIndex(0);
            maleBtn.setSelected(false); femaleBtn.setSelected(false);
            hb1.setSelected(false); hb2.setSelected(false); hb3.setSelected(false);
            displArea.setText("");
        }
    }

    public static void main(String[] args)
    {
        new Registration();
    }
}
