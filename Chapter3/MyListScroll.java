import java.awt.*;
import javax.swing.*;

class MyListWithScroll extends JFrame
{
    String week[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public MyListWithScroll() 
    {
        //Frame Setting
        setTitle("List with Scroll");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        //Components
        JLabel weekLabel = new JLabel("Select your weeks:");
        JList<String> weekLists = new JList<>(week);
        weekLists.setSelectedIndex(1);
        JScrollPane weekScroll = new JScrollPane(weekLists);
        weekScroll.setPreferredSize(new Dimension(100,40));

        add(weekLabel);
        add(weekScroll);

        setVisible(true);
    }
    public static void main(String[] args) {
        new MyListWithScroll();
    }

    
    
}