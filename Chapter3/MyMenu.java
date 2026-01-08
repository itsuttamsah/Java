import java.awt.*;
import javax.swing.*;

class MenuDemo extends JFrame
{

    public MenuDemo()
    {
        //setting frame
        setTitle("Menu");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        //components
        JMenuBar mb = new JMenuBar();
        JMenu course = new JMenu("Courses");
        JMenuItem Item1 = new JMenuItem("BEIT");
        JMenuItem Item2 = new JMenuItem("BCA");
        JMenuItem Item3 = new JMenuItem("BESoftware");

        course.add(Item1);
        course.add(Item2);
        course.add(Item3);
        mb.add(course);
        add(mb);
        setVisible(true);

    }
    public static void main(String[] args) {
        new MenuDemo();
    }
}