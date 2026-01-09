import java.awt.*;
import javax.swing.*;

class MenuSubMenu extends JFrame 
{

    public MenuSubMenu() 
    {
        //setting frame
        setTitle("Menu Demo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        //setting component
        JLabel menuLabel = new JLabel("Menu Lists");
        JMenuBar foodMenu = new JMenuBar();

        JMenu vegMenu = new JMenu("Vegeterian");
        JMenuItem v1 = new JMenuItem("Pakoda");
        JMenuItem v2 = new JMenuItem("Samosa");

        JMenu v3 = new JMenu("Mithai");
        JMenuItem v3_1 = new JMenuItem("Rasgula");
        JMenuItem v3_2 = new JMenuItem("Gulabjamun");
        
        JMenu nonvegMenu = new JMenu("Non-Vegeterian");
        JMenuItem nv1 = new JMenuItem("Chicken Chowein");
        JMenuItem nv2 = new JMenuItem("Motton Biryani");

        JMenu nv3 = new JMenu("Chicken Momo");
        JMenuItem nv3_1 = new JMenuItem("Jhol Momo");
        JMenuItem nv3_2 = new JMenuItem("Fry Momo");

        add(menuLabel);

        v3.add(v3_1);
        v3.add(v3_2);

        vegMenu.add(v1);
        vegMenu.add(v2);
        vegMenu.add(v3);

        nv3.add(nv3_1);
        nv3.add(nv3_2);

        nonvegMenu.add(nv1);
        nonvegMenu.add(nv2);
        nonvegMenu.add(nv3);

        foodMenu.add(vegMenu);
        foodMenu.add(nonvegMenu);

        add(foodMenu);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MenuSubMenu();
    }
    
}