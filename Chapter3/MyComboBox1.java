import java.awt.*;
import javax.swing.*;

class MyComboBox1 extends JFrame
{
    String faculty[] = {"BBA", "BCA", "BECivil", "BEIT", "BBS", "MIT"};

    public MyComboBox1() {
        
        //Frame Setup
        setTitle("JComboBox");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        //Components
        JLabel selectFaculty = new JLabel("Select Your Faculty");
        JComboBox<String> facultyBox = new JComboBox<>(faculty);
        add(selectFaculty);
        add(facultyBox);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyComboBox1();
    }
    
}