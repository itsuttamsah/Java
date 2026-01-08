import java.awt.*;
import javax.swing.*;

class MyList extends JFrame
{
    String weeks[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public MyList() 
    {
        //Frame setting
        setTitle("List of Week");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        //components
        JLabel weeksLabel = new JLabel("Select your weeks:");
        JList<String> weekLists = new JList<>(weeks);
        weekLists.setSelectedIndex(1);
        
        add(weeksLabel);
        add(weekLists);

        setVisible(true);
    }
    public static void main(String[] args) {
        new MyList();
    }
}