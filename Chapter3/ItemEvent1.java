import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ItemEventDemo extends JFrame implements ItemListener
{
    JRadioButton male, female;
    JComboBox<String> countrySelect;
    ButtonGroup gender;

    ItemEventDemo()
    {
        //frame setting
        setTitle("ItemEvent and Listener");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));

        //components
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        String countryList[] = {"Nepal", "India", "China", "USA", "UK", "South Korea"};
        countrySelect = new JComboBox<>(countryList);
        countrySelect.setSelectedIndex(2);

        add(male);
        add(female);
        add(countrySelect);

        male.addItemListener(this);
        female.addItemListener(this);
        countrySelect.addItemListener(this);

        setVisible(true);
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource() == male && e.getStateChange() == ItemEvent.SELECTED)
        {
            JOptionPane.showConfirmDialog(this, "Your Selection male.");
        }
        else if(e.getSource() == female && e.getStateChange()== ItemEvent.SELECTED)
        {
            JOptionPane.showConfirmDialog(this, "Your Selection is female");
        }
        else if(e.getSource() == countrySelect && e.getStateChange()==ItemEvent.SELECTED)
        {
            String country = countrySelect.getSelectedItem().toString();
            JOptionPane.showConfirmDialog(this, "Your selected coutry is " + country);
        }
    }

    public static void main(String[] args) {
        new ItemEventDemo();
    }

}