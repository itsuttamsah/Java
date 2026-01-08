import java.awt.*;
import javax.swing.*;

class MyTable extends JFrame
{
    JFrame f;
    JTable jt;
    String columnNames[] = {"Name", "Year", "Course"};
    String data[][] = {{"Ashok", "2025", "MBBS"}, {"Uttam", "2025", "BEIT", "Ujwal", "2025", "BEIT"},
                        {"Ashok", "2025", "MBBS"}, {"Uttam", "2025", "BEIT", "Ujwal", "2025", "BEIT"},
                        {"Ashok", "2025", "MBBS"}, {"Uttam", "2025", "BEIT", "Ujwal", "2025", "BEIT"},
                        {"Ashok", "2025", "MBBS"}, {"Uttam", "2025", "BEIT", "Ujwal", "2025", "BEIT"},
                        {"Ashok", "2025", "MBBS"}, {"Uttam", "2025", "BEIT", "Ujwal", "2025", "BEIT"}
                        };
    public MyTable()
    {
        //frame setting
        f = new JFrame("Table");
        f.setSize(500, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        //components
        jt = new JTable(data, columnNames);
        JScrollPane sp = new JScrollPane(jt);
        
        f.add(sp);
        // f.add(jt);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new MyTable();
    }
}