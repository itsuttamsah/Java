import java.awt.*;
import javax.swing.*;

public class CardLayoutDemo
{
    JFrame frame;
    JPanel cardPanel;
    CardLayout cardLayout;

    CardLayoutDemo()
    {
        //Frame Set up

        frame = new JFrame("CardLayout Example");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        JPanel card1 = new JPanel();
        card1.setBackground(Color.pink);
        card1.add(new JLabel("This is card1"));

        JPanel card2 = new JPanel();
        card2.setBackground(Color.yellow);
        card2.add(new JLabel("This is card2"));

        JPanel card3 = new JPanel();
        card3.setBackground(Color.green);
        card3.add(new JLabel("This is card3"));

        cardPanel.add(card1, "Card1");
        cardPanel.add(card2, "Card2");
        cardPanel.add(card3, "card3");

        JButton nextBtn = new JButton("Next");
        nextBtn.addActionListener(e -> cardLayout.next(cardPanel));

        JButton prevBtn = new JButton("Previous");
        prevBtn.addActionListener(e -> cardLayout.next(cardPanel));

        frame.setLayout(new BorderLayout());
        frame.add(cardPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevBtn);
        buttonPanel.add(nextBtn);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new CardLayoutDemo();
    }
}