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
        JLabel menuLabel = new JLabel("This is menu demo.");
        JMenuBar mb = new JMenuBar();
        JMenu veg = new JMenu("Vegeterian");
        JMenuItem Item1 = new JMenuItem("Momo");
        JMenuItem Item2 = new JMenuItem("Samosa");
        JMenuItem Item3 = new JMenuItem("Chaat");

        JMenu nveg = new JMenu("Non-Vegeterian");
        JMenuItem Item4 = new JMenuItem("Chicken Momo");
        JMenuItem Item5 = new JMenuItem("Motton Biryani");
        JMenuItem Item6 = new JMenuItem("Chicken Fry");


        veg.add(Item1);
        veg.add(Item2);
        veg.add(Item3);
        nveg.add(Item4);
        nveg.add(Item5);
        nveg.add(Item6);
        mb.add(veg);
        mb.add(nveg);
        add(menuLabel);
        add(mb);
        setVisible(true);

    }
    public static void main(String[] args) {
        new MenuDemo();
    }
}